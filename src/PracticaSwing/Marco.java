package PracticaSwing;

//Importación de paquetes necesarios
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
		
		//Establecemos el array que pasaremos por parámetro al contructor de la Lámina
		String [] primero = {"Mensaje","Confirmar","Opción","Entrada"};
		
		//Creamos la lámina que hará de primera caja del BoxLayout
		laminaTipo = new Lamina("Tipo",primero);
		
		//Añadimos la lámina de la caja a la lámina principal
		laminaCuadricula.add(laminaTipo);
		
		//Añadimos la lámina principal
		add(laminaCuadricula);
		
	}
	
	private Lamina laminaTipo;
	
}
