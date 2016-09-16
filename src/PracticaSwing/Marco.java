package PracticaSwing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco extends JFrame {
	
	public Marco(){
		//Ponemos título a la ventana
		setTitle("Prueba de Diálogos");
		
		//Establecemos el tamaño del marco
		setBounds(325,100,600,450);
		
		//Creamos la lámina sobre la que irán el resto de elementos
		JPanel laminaCuadricula = new JPanel();
		
		//Establecemos el tipo de lámina que queremos
		laminaCuadricula.setLayout(new GridLayout(2,3));
		
		//Añadimos la lámina al marco
		add(laminaCuadricula);
		
	}
	
}
