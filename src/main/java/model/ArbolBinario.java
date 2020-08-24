package model;

import java.io.FileWriter;
import java.io.IOException;

class Nodo { 
    int key; 
    Nodo izq, der; 
  
    public Nodo(int item) { 
        key = item; 
        izq = null; 
        der = null;
    } 
} 
  
public class ArbolBinario { 
    
    Nodo raiz; 
  
    // Constructor
    ArbolBinario(int key) { 
    	raiz = new Nodo(key); 
    } 
  
    public ArbolBinario() { 
    	raiz = null; 
    	System.out.println("Arbol Binario inicializado!");
    } 
    
    Nodo insertaNodo(Nodo nodo, int key) {
    	if( nodo == null ) {
    		nodo = new Nodo(key);
    	}
    	else if( key < nodo.key ){
    		nodo.izq = insertaNodo(nodo.izq, key);
    	}
    	else {
    		nodo.der = insertaNodo(nodo.der, key);
    	}
    	return nodo;
    }
    
    public void add( int key ) {
    	raiz = insertaNodo(raiz, key);
    	System.out.println("insertando: "+ key); 	
    }
    
    public void generaGrafico() {
    	System.out.println("graficando: ");
    	if(raiz != null) {
    		try {
        		FileWriter myWriter = new FileWriter("./exportaciones/ARBOL_BINARIO.dot");
        		myWriter.write("digraph G {\n");
        		recorreBfs(raiz, myWriter);
        		myWriter.write("}\n");
    			myWriter.close();
    	    } 
        	catch (IOException e) {
    	    	System.out.println("An error occurred.");
    	    	e.printStackTrace();
    	    }
    	}
    }
    
    void recorreBfs(Nodo nodo, FileWriter myWriter) {
    	if( nodo != null ) {
    		String strKey = String.valueOf(nodo.key);
    		try {
    			if(nodo.izq != null) {
    				myWriter.append(strKey+"->"+nodo.izq.key+"\n");
    				recorreBfs(nodo.izq, myWriter);
    			}
	    		if(nodo.der != null) {
	    			myWriter.append(strKey+"->"+nodo.der.key+"\n");
		    		recorreBfs(nodo.der, myWriter);
	    		}
    		} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
 
} 