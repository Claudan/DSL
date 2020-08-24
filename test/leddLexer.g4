lexer grammar leddLexer;

//LEXER - EXPRESIONES REGULARES
ARBOL_BINARIO  : 'ARBOL_BINARIO';
LISTA_ENLAZADA : 'LISTA_ENLAZADA';
PILA           : 'PILA';
TABLA_HASH     : 'TABLA_HASH';

PUSH           : 'PUSH'          | 'push';   
ADD            : 'ADD'           | 'add';
PUT            : 'PUT'           | 'put';

IGUAL         :   '=';
END	          :   ';';
PUNTO         :   '.';
L_PARENTESIS  :   '(';
R_PARENTESIS  :   ')';
LLAVE_INICIAL :   '{';
LLAVE_FINAL   :   '}';

NUMERO       :   [0-9]*;

WS           : [ \t\r\n]+ ->    skip;     

VARIABLE     : [a-zA-Z]*;

fragment
NameStartChar
            :   [:a-zA-Z]
            |   '\u2070'..'\u218F'
            |   '\u2C00'..'\u2FEF'
            |   '\u3001'..'\uD7FF'
            |   '\uF900'..'\uFDCF'
            |   '\uFDF0'..'\uFFFD';

       