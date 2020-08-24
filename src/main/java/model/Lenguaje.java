package model;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.talf.ledd.leddErrorListener;
import com.talf.ledd.leddLexer;
import com.talf.ledd.leddParser;
import com.talf.ledd.nLeddBaseListener;


public class Lenguaje {
	
	CharStream input;
	leddLexer lexer;
	CommonTokenStream tokens;
	leddParser parser;
	ParseTree tree;
	
	public Lenguaje(String text) {
		
		this.input = CharStreams.fromString(text);
		this.lexer = new leddLexer(input);
		this.tokens = new CommonTokenStream(lexer);
		this.parser = new leddParser(tokens);
		
	} 
	
	public void changeInput(String text) {
		this.input = CharStreams.fromString(text);
		this.lexer = new leddLexer(input);
		this.tokens = new CommonTokenStream(lexer);
		this.parser = new leddParser(tokens);
	}

	public void showTree(){
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),this.tree);
        viewer.setScale(1.5); // Scale a little
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
	
	public void resolve() {
		this.tree = this.parser.start();
		parser.removeErrorListeners();
		parser.addErrorListener(new leddErrorListener());
		//ERROR
		lexer.removeErrorListeners();
		lexer.addErrorListener(leddErrorListener.INSTANCE);
		parser.removeErrorListeners();
		parser.addErrorListener(leddErrorListener.INSTANCE);
		//LISTENER
		nLeddBaseListener nld = new nLeddBaseListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(nld,tree);
		System.out.println(leddErrorListener.INSTANCE.toString());		
	}
}
