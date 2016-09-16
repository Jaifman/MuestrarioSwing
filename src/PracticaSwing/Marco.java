package PracticaSwing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame {
	
	public Marco(){
		//Ponemos t�tulo a la ventana
		setTitle("Prueba de Di�logos");
		
		//Establecemos el tama�o del marco
		setBounds(325,100,600,450);
		
		//Creamos la l�mina sobre la que ir�n el resto de elementos
		JPanel laminaCuadricula = new JPanel();
		
		//Establecemos el tipo de l�mina que queremos
		laminaCuadricula.setLayout(new GridLayout(2,3));
		
		//A�adimos la l�mina al marco
		add(laminaCuadricula);
		
	}
	
}
