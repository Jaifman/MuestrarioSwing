package PracticaSwing;

//Importaci�n de paquetes necesarios
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
		
		//Establecemos el array que pasaremos por par�metro al contructor de la L�mina
		String [] primero = {"Mensaje","Confirmar","Opci�n","Entrada"};
		
		//Creamos la l�mina que har� de primera caja del BoxLayout
		laminaTipo = new Lamina("Tipo",primero);
		
		//A�adimos la l�mina de la caja a la l�mina principal
		laminaCuadricula.add(laminaTipo);
		
		//A�adimos la l�mina principal
		add(laminaCuadricula);
		
	}
	
	private Lamina laminaTipo;
	
}
