package com.talf.ledd;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.talf.ledd.leddParser.StartContext;

import model.ArbolBinario;
import model.ListaEnlazada;
import model.Pila;

public class nLeddBaseListener implements leddListener {
	
	ArbolBinario  ab;
	ListaEnlazada ll; 
	Pila 		  p;
	
	int valorTemporal;
	String estructura;
	String metodo;

	@Override 
	public void exitEveryRule( ParserRuleContext ctx) { 

		if(ctx.getParent() == null) {
			String variable;
			String metodo;
			String valor;
			String identificador;
			int numeroHijos = ctx.getChildCount();
			for(int i=1; i<numeroHijos-1; i++) {
				identificador = ctx.getChild(i).getChild(1).getText();
				if(identificador.equals("=")) {
					variable = ctx.getChild(i).getChild(0).getText();
					valor    = ctx.getChild(i).getChild(2).getText();
					asignaEstructura(variable,valor);
				}
				if(identificador.equals(".")) {
					metodo = ctx.getChild(i).getChild(2).getText();
					valor    = ctx.getChild(i).getChild(4).getText();
					accion(metodo,valor);
				}
			}
			generaGrafico();
		}
	}

	public void asignaEstructura(String variable, String est) {
		this.estructura = est;
		if(est.equals("ARBOL_BINARIO")){
			this.ab = new ArbolBinario();
		}
		else if(est.equals("LISTA_ENLAZADA")){
			this.ll = new ListaEnlazada();
		}
		else if(est.equals("PILA")){
			this.p = new Pila();
		}
		else if(est.equals("TABLA_HASH")){
				
		}
	}
	
	public void accion(String met, String val) {
		int valor = Integer.parseInt(val); 
		if(this.estructura.equals("ARBOL_BINARIO")){
			if(met.equals("add")){
				this.ab.add(valor);
	    	}	
		}
		else if(this.estructura.equals("LISTA_ENLAZADA")){
			if(met.equals("add")){
				this.ll.add(valor);
	    	}
		}
		else if(this.estructura.equals("PILA")){
			if(met.equals("push")){
				this.p.push(valor);
	    	}
		}
		else if(this.estructura.equals("TABLA_HASH")){
				
		}
	}
	
	public void generaGrafico( ){
		if(this.estructura.equals("ARBOL_BINARIO")){
			this.ab.generaGrafico();
		}
		else if(this.estructura.equals("LISTA_ENLAZADA")){
			this.ll.generaGrafico();
		}
		else if(this.estructura.equals("PILA")){
			this.p.generaGrafico();		
		}
		else if(this.estructura.equals("TABLA_HASH")){
				
		}
	} 
	
	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterStart(StartContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitStart(StartContext ctx) {
		// TODO Auto-generated method stub
		
	}
}