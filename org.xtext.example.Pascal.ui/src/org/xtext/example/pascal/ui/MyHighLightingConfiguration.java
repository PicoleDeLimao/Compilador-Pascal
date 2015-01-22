package org.xtext.example.pascal.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MyHighLightingConfiguration extends DefaultHighlightingConfiguration{
	
	public static final String LAYOUT_ID = "layout";
//	public static final String KEYWORD_ID = "keyword";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(LAYOUT_ID, "Layout",	layoutTextStyle());
	}
	
	public TextStyle layoutTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 255));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
/*
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 0, 255));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
*/
	
}