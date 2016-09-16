package PracticaSwing;

import javax.swing.JFrame;

public class AplicacionDialogos {

	public static void main(String[] args) {
		
		//Creamos el Marco
		Marco miMarco = new Marco();
		
		//Establecemos que el programa dejará de ejecutarse al salir				
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Hacemos el marco visible
		miMarco.setVisible(true);

	}

}
