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

package com.github.seed.ui.services.impl;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class EditorAwareLexingServiceCreationFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		EditorAwareLexingService lexingService = context.get(EditorAwareLexingService.class);
		if ( lexingService == null) {
			lexingService = ContextInjectionFactory.make(EditorAwareLexingService.class, context);
			context.set(EditorAwareLexingService.class, lexingService);
		}
		return lexingService;
	}

}
