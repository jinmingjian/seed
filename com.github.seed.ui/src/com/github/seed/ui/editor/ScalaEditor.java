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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.github.seed.ui.Activator;
import com.github.seed.ui.services.ScalaEditorServices;

public class ScalaEditor extends TextEditor {

	private ScalaOutlinePage fOutlinePage;
	private ScalaEditorServices services;
	private ScalaSourceViewerConfiguration sourceViewerConfiguration;
	public ScalaEditor() {
		super();
		this.sourceViewerConfiguration = new ScalaSourceViewerConfiguration();
		setSourceViewerConfiguration(sourceViewerConfiguration);
	}
	
	public void createPartControl(Composite parent) {
		initializeEditorServices();
	    this.sourceViewerConfiguration.setServices(services);
	    
	    super.createPartControl(parent);
	}
	
	/*
	 * NOTE: per EditorServices per Editor
	 */
	private void initializeEditorServices() {
		//XXX: is it rational to use the e4 DI here?
	    IEclipseContext context = EclipseContextFactory.getServiceContext(Activator.getContext());
	    this.services = ContextInjectionFactory.make(ScalaEditorServices.class, context);
	    this.services.setEditor(this);
	}
	
	public String getInputPath() {
		String filePath = null;
		IEditorInput editorInput = getEditorInput();
	    if (editorInput instanceof IPathEditorInput) {
            IPathEditorInput pathInput= (IPathEditorInput) editorInput;
            filePath= pathInput.getPath().toOSString();
        } else if (editorInput instanceof IStorageEditorInput) {
            IStorageEditorInput storageEditorInput= (IStorageEditorInput) editorInput;
            try {
                filePath= storageEditorInput.getStorage().getFullPath().toOSString(); // can be null
            } catch (CoreException e) {
//                e.printStackTrace();
            }
        }
	    return filePath;
	}
	
	public Object getAdapter(Class required) {
		
		if (IContentOutlinePage.class.equals(required)) {
			if (fOutlinePage == null) {
				fOutlinePage = new ScalaOutlinePage(this);
				fOutlinePage.setInput(getEditorInput());
			}
			return fOutlinePage;
		}
		
		return super.getAdapter(required);
	}

}
