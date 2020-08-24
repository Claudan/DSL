package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class Pila {
	Stack<Integer> stack;
	
	public Pila() {
		stack = new Stack<Integer>();
	}
	
	public void push(int val) {
		stack.push(val);
	}
	
	public void generaGrafico() {
		Object[] vals = stack.toArray();
    	try {
    		FileWriter myWriter = new FileWriter("./exportaciones/PILA.dot");
    		myWriter.write("digraph G {\nrankdir=LR;\nnode [shape=record];\n");
    		if(vals.length > 0) {
    			myWriter.append("p [label=\"");
    			int i=0;
    			for (int j = 0; j < vals.length; j++) {
					String posicion    = String.valueOf(i);
    				String valorActual = String.valueOf(stack.pop());
        			myWriter.append("<f"+posicion+">"+valorActual);
        			System.out.println(valorActual);
        			if(i < vals.length - 1 ) {
        				myWriter.append("|\n");
        			}
        			i++;
				}
    			myWriter.append("\"];\n");
    		}
    		myWriter.write("}\n");
			myWriter.close();
	    } 
    	catch (IOException e) {
	    	System.out.println("error");
	    	e.printStackTrace();
	    }
	}
}
