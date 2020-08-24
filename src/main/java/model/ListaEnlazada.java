package model;

import java.io.FileWriter;
import java.io.IOException;

import edu.emory.mathcs.backport.java.util.LinkedList;

public class ListaEnlazada {
	LinkedList ll; 
	
	public ListaEnlazada() {
		ll = new LinkedList();
	}
	
	public void add(int val) {
		ll.add(val);
	}

	public void generaGrafico() {
    	try {
    		FileWriter myWriter = new FileWriter("./exportaciones/LISTA_ENLAZADA.dot");
    		myWriter.write("digraph G {\nrankdir=LR;\nnode [shape=record];\n");
    		for (int i = 0; i < ll.size(); i++) {  
                myWriter.append(String.valueOf(i)+" [label=\"{ <data> " + String.valueOf(ll.get(i)) );
                myWriter.append(" | <ref> }\"];\n");
            }  
    		for (int i = 0; i < ll.size(); i++) {  
    			String actual    = String.valueOf(i);
    			String siguiente = String.valueOf(i+1); 
    			String ultimo    = String.valueOf(ll.size()-1);
    			if(actual.equals(ultimo)) {
    				myWriter.append(actual+":ref:"+ultimo+" -> ");
    				myWriter.append("null \n[arrowhead=vee, arrowtail=dot, dir=both, tailclip=false];\n");
    			}
    			else {
    				myWriter.append(actual+":ref:"+ultimo+" -> "+siguiente);
    				myWriter.append(":data \n[arrowhead=vee, arrowtail=dot, dir=both, tailclip=false];\n");
    			}
    		}
    		myWriter.write("}\n");
			myWriter.close();
	    } 
    	catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
    }
}
