package PracticaSwing;

//Importamos paquetes necesarios
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina extends JPanel{
	//Añadimos 2 parámetros al constructor
	public Lamina(String titulo, String [] opciones ){
		
		//Establecemos el tipo de borde de la lámina
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		
		//Establecemos la lámina como tipo BoxLayout
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		//Establecemos los botones como grupo para que solo pueda seleccionarse una opción
		ButtonGroup grupo = new ButtonGroup();
		
		//Iteramos para crear los botones según el parámetro que pasemos
		for (int i = 0; i < opciones.length; i++) {
			
			//Creación de Botones
			JRadioButton boton = new JRadioButton(opciones[i]);
			
			//Se añaden los botones creados en el paso anterior
			add(boton);
			
			//Se añaden los botones al ButtonGroup
			grupo.add(boton);
			
			//Se establece el foco en la primera opción del ButtonGroup
			boton.setSelected(i==0);
			
		}
	}
	
}
