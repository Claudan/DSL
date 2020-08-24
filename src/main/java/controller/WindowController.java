package controller;

import model.Lenguaje;
import view.GUI;

public class WindowController {
	GUI vista;
	Lenguaje leng;

	public WindowController(GUI view){
		this.vista = view;
		
   }
	public void show() {
		vista.show();
	}
	
}
