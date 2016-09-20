package PracticaSwing;

//Importación de paquetes necesarios
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		//Creamos las láminas que harán de cajas del BoxLayout
		laminaTipo = new Lamina("Tipo",new String[]{
			
				"Mensaje",
				"Confirmar",
				"Opción",
				"Entrada"				
				
		});
		
		laminaTipoMensajes = new Lamina("Tipo de Mensaje",new String[]{
			
				"ERROR_MESSAGE",
				"INFORMATION_MESSAGE",
				"QUESTION_MESSAGE",
				"PLAIN_MESSAGE"				
				
		});
		
		laminaMensaje = new Lamina("Mensaje",new String[]{
				
				"Cadena",
				"Icono",
				"Componente",
				"Otros",
				"Object[]"
				
		});
		
		laminaConfirmar = new Lamina("Confirmar",new String[]{
				
				"DEFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"
				
		});
		
		laminaOpciones = new Lamina("Opción",new String[]{
				
				"String[]",
				"Icon[]",
				"Object[]"				
				
		});
		
		laminaEntrada = new Lamina("Entrada",new String[]{
				
				"Campo de Texto",
				"Combo"				
				
		});
		
		//Añadimos las láminas de las cajas a la lámina principal
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensajes);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaConfirmar);
		laminaCuadricula.add(laminaOpciones);
		laminaCuadricula.add(laminaEntrada);
		
		//Creamos la lámina inferior
		JPanel laminaMostrar = new JPanel();
		
		//Creamos el botón
		JButton botonMostrar = new JButton("Mostrar");
		
		botonMostrar.addActionListener(new AccionMostrar());
		
		//Añadimos el botón a la lámina
		laminaMostrar.add(botonMostrar);
		
		//Añadimos la lámina inferior, situándola en la parte inferior
		add(laminaMostrar, BorderLayout.SOUTH);
		
		//Añadimos la lámina principal y la colocamos en el centro
		add(laminaCuadricula, BorderLayout.CENTER);
				
	}
	
	//Método que nos devuelva el mensaje seleccionado
	public Object getMensaje(){
		
		String s = laminaMensaje.getSeleccion();
		
		if (s.equals("Cadena")) {
			
			return cadenaMensaje;
			
		}else if (s.equals("Icono")){
			
			return iconoMensaje;
			
		}else if (s.equals("Componente")){
			
			return componenteMensaje;
			
		}else if (s.equals("Otros")){
			
			return objetoMensaje;
			
		}else if (s.equals("Object[]")){
			
			return new Object[]{
					
				cadenaMensaje,
				iconoMensaje,
				componenteMensaje,
				objetoMensaje
				
			};
			
		}else{
			
			return null;
			
		}
		
	}
	
	//Clase privada que dará funcionalidad al botón mostrar
	private class AccionMostrar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(laminaTipo.getSeleccion().equals("Mensaje")){
				
				JOptionPane.showMessageDialog(Marco.this, getMensaje(), "Título", 0);
				
			}else if(laminaTipo.getSeleccion().equals("Confirmar")){
				
				JOptionPane.showConfirmDialog(Marco.this, getMensaje(), "Título", 0,0);
				
			}else if(laminaTipo.getSeleccion().equals("Entrada")){
				
				JOptionPane.showInputDialog(Marco.this, getMensaje(), "Título", 0);
				
			}else if(laminaTipo.getSeleccion().equals("Opción")){
				
				JOptionPane.showOptionDialog(Marco.this, getMensaje(), "Título", 0, 0, null, null, null);
				
			}
			
		}
		
	}
	//Declaración de variables de las distintas láminas
	private Lamina laminaTipo, laminaTipoMensajes, laminaMensaje, laminaConfirmar, laminaOpciones, laminaEntrada;
	//Declaración de variables a usar como parámetros
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src/bolazul.gif");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new LaminaEjemplo();
}
