package PracticaSwing;

//Importamos paquetes necesarios
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina extends JPanel{
	//A�adimos 2 par�metros al constructor
	public Lamina(String titulo, String [] opciones ){
		
		//Establecemos el tipo de borde de la l�mina
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		
		//Establecemos la l�mina como tipo BoxLayout
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		//Establecemos los botones como grupo para que solo pueda seleccionarse una opci�n
		ButtonGroup grupo = new ButtonGroup();
		
		//Iteramos para crear los botones seg�n el par�metro que pasemos
		for (int i = 0; i < opciones.length; i++) {
			
			//Creaci�n de Botones
			JRadioButton boton = new JRadioButton(opciones[i]);
			
			//Se a�aden los botones creados en el paso anterior
			add(boton);
			
			//Se a�aden los botones al ButtonGroup
			grupo.add(boton);
			
			//Se establece el foco en la primera opci�n del ButtonGroup
			boton.setSelected(i==0);
			
		}
	}
	
}
