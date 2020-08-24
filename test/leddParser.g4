parser grammar leddParser;

options { tokenVocab=leddLexer; }

@header {
	import model.ArbolBinario;
	import model.ListaEnlazada;
	import model.Pila;
}
@members {
	
	ArbolBinario  ab    = null;
	ListaEnlazada ll    = null; 
	Pila 		  p 	= null;
	/*TablaHash    th    = null;   */
	
	int valorTemporal;
	String estructura;
	String metodo;
	
	private void insertaEnEstructura( int valor ) {
    	if(estructura == "ARBOL_BINARIO"){
			if(metodo == "ADD"){
	    		ab.add(valor);
	    	}	
		}
		else if(estructura == "LISTA_ENLAZADA"){
			if(metodo == "ADD"){
	    		ll.add(valor);
	    	}
		}
		else if(estructura == "PILA"){
			if(metodo == "PUSH"){
	    		p.push(valor);
	    	}
		}
		else if(estructura == "TABLA_HASH"){
				
		}
	} 
	private void generaGrafico( ){
		if(estructura == "ARBOL_BINARIO"){
			ab.generaGrafico();
		}
		else if(estructura == "LISTA_ENLAZADA"){
			ll.generaGrafico();
		}
		else if(estructura == "PILA"){
			p.generaGrafico();		
		}
		else if(estructura == "TABLA_HASH"){
				
		}
	} 
}

//PARSER - GRAMÁTICA LIBRE DE CONTEXTO
start             : LLAVE_INICIAL sentenciaInicial sentencia* LLAVE_FINAL { generaGrafico(); };
sentenciaInicial  : VARIABLE IGUAL estructuraDeDatos END ;
sentencia         : VARIABLE PUNTO metodo L_PARENTESIS refNum = num R_PARENTESIS END { 
						insertaEnEstructura($refNum.valor);
					};
metodo returns [String valor] : PUSH { metodo = "PUSH"; }
							  | ADD  { metodo = "ADD";  }
							  | PUT  { metodo = "PUT";  };
							  
estructuraDeDatos : ARBOL_BINARIO  { ab = new ArbolBinario() ; estructura = "ARBOL_BINARIO"; } 
				  | LISTA_ENLAZADA { ll = new ListaEnlazada(); estructura = "LISTA_ENLAZADA";   }
				  | PILA           { p = new Pila()          ; estructura = "PILA"; }
				  | TABLA_HASH     { estructura = "TABLA_HASH"; };
				  
num returns [int valor]: NUMERO {$valor = Integer.parseInt($NUMERO.text);};


 