package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.FrameCreation;
import model.Lenguaje;

public class GUI {
	JFrame f= null;//creating instance of JFrame  
	JButton buttonParser;
	JButton buttonExport;
	ActionListener parserListener;
	ActionListener exportListener;
	JTextArea TA;
	Lenguaje lenguaje = null;
	
	public GUI(){
		FrameCreation mainFrame = new FrameCreation();
	    f = new FrameCreation().createFrame(492, 468, "Lenguaje gráfico de Estructuras de datos");
	    f.setResizable(false);
	    f.getContentPane().setBackground(new Color(255,255,255));
	    
	    this.TA = mainFrame.createTextArea(470, 333, 8, 8);
	    this.buttonExport = mainFrame.createButton(470, 40, 8, 347, "VALIDAR Y EXPORTAR",new Color(3,51,232));
	    this.buttonParser = mainFrame.createButton(470, 40, 8, 393, "PARSER TREE",new Color(255,122,89));
	    
	    f.add(this.TA);
	    f.add(buttonParser);
	    f.add(buttonExport);
	    setParserListener();
	    setExportListener();    
	}
	
	public void setParserListener() {
		
		buttonParser.removeActionListener(this.parserListener);
		this.parserListener = new ActionListener() {

			@Override
            public void actionPerformed(ActionEvent e) {
            	String texto = TA.getText();
            	ayuwoki(texto);
                //JOptionPane.showMessageDialog(buttonParser,texto);
            }
        };
		buttonParser.addActionListener(parserListener);
	}
	
	public void setExportListener() {
		buttonExport.removeActionListener(this.exportListener);
		this.exportListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String texto = TA.getText();
            	setLenguaje(texto);
                //JOptionPane.showMessageDialog(buttonExport,texto);
            }
        };
		buttonExport.addActionListener(exportListener);
	}
	
	public void setLenguaje(String text) {
		this.lenguaje = new Lenguaje(text);
		this.lenguaje.resolve();
	}
	
	public void ayuwoki(String text) {
		this.lenguaje = new Lenguaje(text);
		this.lenguaje.resolve();
		this.lenguaje.showTree();
	}
	
	public void show() {
		f.setVisible(true);//making the frame visible  
	}
	
}
