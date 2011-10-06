/*******************************************************************************
 * Copyright (c) 2011. All rights reserved by the authors. 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors:
 *     Jin Mingjian (jin.phd@gmail.com) - initial API and implementation
 *******************************************************************************/

package com.github.seed.ui.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import com.github.seed.core.scalamodel.ScalaModelScanner;
import com.github.seed.core.scalamodel.elements.CompilationUnit;
import com.github.seed.core.scalamodel.elements.FunDef;
import com.github.seed.core.scalamodel.elements.FunctionSignature;
import com.github.seed.core.scalamodel.elements.Member;
import com.github.seed.core.scalamodel.elements.ScalaElement;
import com.github.seed.core.scalamodel.elements.ScalaModelPackage;
import com.github.seed.core.scalamodel.elements.Type;
import com.github.seed.core.scalamodel.elements.ValVarDef;
import com.github.seed.ui.ImageManager;

public class ScalaOutlinePage extends ContentOutlinePage {

	private ScalaEditor fEditor;
	private IEditorInput fInput;

	public ScalaOutlinePage(ScalaEditor editor) {
		// TODO Auto-generated constructor stub
		this.fEditor = editor;
	}

	public void setInput(IEditorInput inputElement) {
		fInput = inputElement;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer viewer = getTreeViewer();
		viewer.setAutoExpandLevel(-1);
		viewer.setContentProvider(new ScalaModelContentProvider());
		viewer.setLabelProvider(new ScalaModelLabelProvider());

		// XXX: just for quick M0 demo
		IDocument document = fEditor.getDocumentProvider().getDocument(fInput);
		
		CompilationUnit cu = ScalaModelScanner.getModelRoot(document.get());
		cu.setName(fInput.getName());
        viewer.setInput(cu);
	}

	private static class ScalaModelContentProvider implements ITreeContentProvider {

		@Override
		public void dispose() {
			// TODO Auto-generated method stub

		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub

		}

		@Override
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		@Override
		public Object getParent(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			assert element instanceof EObject;
			return !getChildren((EObject)element).isEmpty();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			assert parentElement instanceof EObject;
			return getChildren((EObject)parentElement).toArray();//XXX: use map to cache children in next
		}

		private List<Object> getChildren(EObject parentElement) {
			EObject eObject = (EObject)parentElement;
			
			if (eObject instanceof Member)
				return Collections.EMPTY_LIST;
			
			List<Object> children = new ArrayList<Object>();
			for (EStructuralFeature feature : getChildrenFeatures(eObject)) {
				Object v = getValue(eObject, feature);
				if (feature.isMany()) {
					List<?> cl = (List<?>)v;
					for (Object c : cl) {
						  children.add(c);
					}
				}	else {
					if (v!=null) 
					  children.add(v);
				}
					
			}
			Collections.reverse(children);
			return children;
		}
		
		protected Object getValue(EObject eObject,
				EStructuralFeature eStructuralFeature) {
			return eObject.eGet(eStructuralFeature, false);
		}

		//NOTE: to inline for maxinizing the performance
		private Collection<? extends EStructuralFeature> getChildrenFeatures(
				Object object) {
			List<EStructuralFeature> childrenFeatures = new ArrayList<EStructuralFeature>();
			EClass eClass = ((EObject) object).eClass();
			for (EReference eReference : eClass.getEAllReferences()) {
				if (eReference.getEReferenceType().getClassifierID()!=ScalaModelPackage.TYPE) 
				  childrenFeatures.add(eReference);
			}
			return childrenFeatures;
		}
		
	}
	
	public class ScalaModelLabelProvider implements ILabelProvider {

		@Override
		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return true;//XXX
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof ScalaElement) {
				ScalaElement se = (ScalaElement)element;
				switch (se.eClass().getClassifierID()) {
				case ScalaModelPackage.PACKAGING:
                	return ImageManager.ICON_SCALA_PACKAGING;
				
				case ScalaModelPackage.CLASS:
					return ImageManager.ICON_SCALA_CLASS;

                case ScalaModelPackage.OBJECT:
                	return ImageManager.ICON_SCALA_OBJECT;
                	
                case ScalaModelPackage.FUN_DEF:
                case ScalaModelPackage.FUN_DCL:
                	return ImageManager.ICON_SCALA_FUN;
                
                case ScalaModelPackage.VAL_VAR_DEF:
                case ScalaModelPackage.VAL_VAR_DCL:
                	return ImageManager.ICON_SCALA_VAL_VAR;
                
                case ScalaModelPackage.IMPORT:
                	return ImageManager.ICON_SCALA_IMPORT;
                	
                case ScalaModelPackage.EXPRESSION:
                	return ImageManager.ICON_SCALA_EXPRESSION;
				}
				
			}
			//NOTE: should not go here
			return ImageManager.ICON_SCALA_DEFAULT;
		}

		@Override
		public String getText(Object element) {
			if (element instanceof ScalaElement) {
				ScalaElement se = (ScalaElement) element;
				StringBuilder text = new StringBuilder();
				text.append(se.getName());
				switch (se.eClass().getClassifierID()) {
				case ScalaModelPackage.FUN_DEF:
					//XXX: FunctionSignature is not completed!
				    FunctionSignature sig = (FunctionSignature)((FunDef)se).getSignature();
				    StringBuilder sb = new StringBuilder("(");
				    for (Type paramType : sig.getParamTypes())
						sb.append(paramType.getName()).append(",");
				    
				    if (sb.length()>1)
				    	text.append(sb.replace(sb.length()-1, sb.length(), ")"));
				    if (((FunDef)se).getType()!=null)
				    	text.append(" : ").append(((FunDef)se).getType().getName());
				    break;
				    
				case ScalaModelPackage.VAL_VAR_DEF:
					//XXX: FunctionSignature is not completed!
				    Type type = ((ValVarDef)se).getType();
				    if (type!=null)
				    	text.append(" : ").append(type.getName());
				    break;
				}
				return text.toString();
			}
			return element.toString();//XXX
		}

	}

}
