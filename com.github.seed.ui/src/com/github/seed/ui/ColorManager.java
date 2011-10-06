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

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class ColorManager {

	private static ColorRegistry colorRegistry;

	//
	private static final String S_DEFAULT = "S_DEFAULT";
	private static final String S_KEYWORD = "S_KEYWORD";
	private static final String S_STRINGLITERAL = "S_STRINGLITERAL";
	private static final String S_COMMENT = "S_COMMENT";
	private static final String S_SCALADOC = "S_COMMENT";
			
	//
	static {
		colorRegistry = new ColorRegistry();
		colorRegistry.put(S_DEFAULT, new RGB(0,0,0));
		colorRegistry.put(S_KEYWORD, new RGB(127,0,85));
		colorRegistry.put(S_STRINGLITERAL, new RGB(0, 0, 255));
		colorRegistry.put(S_COMMENT, new RGB(0,0,222));
		colorRegistry.put(S_SCALADOC, new RGB(142,229,238));
	}
	
	//
	public static Color SCALA_DEFAULT  = colorRegistry.get(S_DEFAULT);
	public static Color SCALA_KEYWORD  = colorRegistry.get(S_KEYWORD);
	public static Color SCALA_STRINGLITERAL  = colorRegistry.get(S_STRINGLITERAL);
	public static Color SCALA_COMMENT  = colorRegistry.get(S_COMMENT);
	public static Color SCALA_SCALADOC  = colorRegistry.get(S_SCALADOC);
	
	
//	public static Color getColor(RGB rgb) {
//	}
}
