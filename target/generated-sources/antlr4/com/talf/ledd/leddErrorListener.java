package com.talf.ledd;

import javax.swing.JOptionPane;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class leddErrorListener extends BaseErrorListener {

	public static final leddErrorListener INSTANCE = new leddErrorListener();

	private static final boolean REPORT_SYNTAX_ERRORS = true;

	private String errorMsg = "";

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, 
	                        Object offendingSymbol, 
	                        int line, 
	                        int charPositionInLine, 
	                        String msg, 
	                        RecognitionException re) {

	    if (!REPORT_SYNTAX_ERRORS) {
	        return;
	    }

	    String sourceName = recognizer.getInputStream().getSourceName();
	    if (!sourceName.isEmpty()) {
	        sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
	    }

	    System.err.println(sourceName+"line "+line+":"+charPositionInLine+" "+msg);
	    this.errorMsg = errorMsg + "\n" + sourceName+"line "+line+":"+charPositionInLine+" "+msg;
	    JOptionPane.showMessageDialog(null,this.errorMsg);
	}

	@Override
	public String toString() {
	    return errorMsg;
	}    
	
	public void showError() {
		JOptionPane.showMessageDialog(null,this.errorMsg);
	}
}
