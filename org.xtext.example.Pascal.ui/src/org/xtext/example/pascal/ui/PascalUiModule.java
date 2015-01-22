/*
 * generated by Xtext
 */
package org.xtext.example.pascal.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class PascalUiModule extends org.xtext.example.pascal.ui.AbstractPascalUiModule {
	
	public PascalUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return MyHighLightingConfiguration.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return MyAntlrTokenToAttributeIdMapper.class ;
	}

}
