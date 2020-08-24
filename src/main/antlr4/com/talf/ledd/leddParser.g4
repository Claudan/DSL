parser grammar leddParser;

options { tokenVocab=leddLexer; }

//PARSER - GRAMÁTICA LIBRE DE CONTEXTO
start             : LLAVE_INICIAL sentenciaInicial sentencia* LLAVE_FINAL;
sentenciaInicial  : VARIABLE IGUAL estructuraDeDatos END ;
sentencia         : VARIABLE PUNTO metodo L_PARENTESIS num R_PARENTESIS END;

metodo            : PUSH 
	    		  | ADD  
	              | PUT 
	              ;
							  
estructuraDeDatos : ARBOL_BINARIO   
				  | LISTA_ENLAZADA 
				  | PILA          
				  | TABLA_HASH     
				  ;
num : NUMERO;


 