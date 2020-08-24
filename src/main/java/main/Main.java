
package main;
import java.io.IOException;

import controller.WindowController;
import view.GUI;

public class Main {


	public static void main(String[] args) throws IOException {
		GUI view = new GUI();
		WindowController controller = new WindowController(view);
		controller.show();
	}

}
