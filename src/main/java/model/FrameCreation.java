package model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FrameCreation {
	 public JFrame createFrame(int width, int height, String name) 
	    {
	        JFrame frame = new JFrame(name);
	        frame.setVisible(true);
	        frame.setSize(width, height);
	        frame.setLayout(null);
	        return frame;
	    }

	    public JButton createButton(int width, int height, int xPos, int yPos, String text, Color nColor) 
	    {
	        JButton button = new JButton(text);
	        button.setBounds(xPos, yPos, width, height);
	        button.setBackground(nColor);
	        button.setForeground(new Color(250,250,250));

	        return button;
	    }

	    public JTextArea createTextArea(int width, int height, int xPos, int yPos)
	    {
	        JTextArea txt = new JTextArea();
	        txt.setVisible(true);
	        txt.setBounds(xPos, yPos, width, height);
	        
	        txt.setBackground(new Color(208,220,235));
	        txt.setForeground(new Color(68, 68, 68));
	        
	        //txt.setFont(txt.getFont().deriveFont(Font.BOLD, txt.getFont().getSize()));
	        Font font = txt.getFont();
	        float size = font.getSize() + 5.0f;
	        txt.setFont( font.deriveFont(size) );
	        
	        
	        return txt;
	    }
}
