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

package com.github.seed.ui;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public class ImageManager {
	private static ImageRegistry imageRegistry;
	
	// ID Constants for image/icon resources 
	private static final String SCALA_DEFAULT = "scala_default";
	private static final String SCALA_CLASS = "scala_class";
	private static final String SCALA_OBJECT = "scala_object";
	private static final String SCALA_FUN = "scala_fun";
	private static final String SCALA_VAL_VAR = "scala_val_var";
	private static final String SCALA_IMPORT = "scala_import";
	private static final String SCALA_PACKAGING = "scala_packaging";
	private static final String SCALA_EXPRESSION = "scala_expression";
	
	static {
		imageRegistry = new ImageRegistry();
		ImageDescriptor imageDescriptor;

		imageDescriptor = createImageDescriptor(new Path("icons/obj16/scu_obj.png"));
		imageRegistry.put(SCALA_DEFAULT, imageDescriptor);

		imageDescriptor = createImageDescriptor(new Path("icons/obj16/class_obj.png"));
		imageRegistry.put(SCALA_CLASS, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/object_obj.png"));
		imageRegistry.put(SCALA_OBJECT, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/fun_obj.png"));
		imageRegistry.put(SCALA_FUN, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/val_var_obj.png"));
		imageRegistry.put(SCALA_VAL_VAR, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/import_obj.png"));
		imageRegistry.put(SCALA_IMPORT, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/packaging_obj.png"));
		imageRegistry.put(SCALA_PACKAGING, imageDescriptor);
		
		imageDescriptor = createImageDescriptor(new Path("icons/obj16/meth_pri_obj.png"));
		imageRegistry.put(SCALA_EXPRESSION, imageDescriptor);
	}
	
	
	private static ImageDescriptor createImageDescriptor(IPath path) {
		java.net.URL url = org.eclipse.core.runtime.FileLocator.find(Activator.getContext().getBundle(),
				                                                     path, null);
		if (url == null)
			throw new RuntimeException("The bundle com.github.seed.ui has not started normally!");
		return ImageDescriptor.createFromURL(url);
	}
	
	// references to image/icon resources 
	public static final Image ICON_SCALA_DEFAULT = imageRegistry.get(SCALA_DEFAULT);
    public static final Image ICON_SCALA_CLASS = imageRegistry.get(SCALA_CLASS);
    public static final Image ICON_SCALA_OBJECT = imageRegistry.get(SCALA_OBJECT);
    public static final Image ICON_SCALA_FUN = imageRegistry.get(SCALA_FUN);
    public static final Image ICON_SCALA_VAL_VAR = imageRegistry.get(SCALA_VAL_VAR);
    public static final Image ICON_SCALA_IMPORT = imageRegistry.get(SCALA_IMPORT);
    public static final Image ICON_SCALA_PACKAGING = imageRegistry.get(SCALA_PACKAGING);
    public static final Image ICON_SCALA_EXPRESSION = imageRegistry.get(SCALA_EXPRESSION);
}
