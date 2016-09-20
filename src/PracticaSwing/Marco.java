package PracticaSwing;

//Importaci�n de paquetes necesarios
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
		
		//Ponemos t�tulo a la ventana
		setTitle("Prueba de Di�logos");
		
		//Establecemos el tama�o del marco
		setBounds(325,100,600,450);
		
		//Creamos la l�mina sobre la que ir�n el resto de elementos
		JPanel laminaCuadricula = new JPanel();
		
		//Establecemos el tipo de l�mina que queremos
		laminaCuadricula.setLayout(new GridLayout(2,3));
		
		//Creamos las l�minas que har�n de cajas del BoxLayout
		laminaTipo = new Lamina("Tipo",new String[]{
			
				"Mensaje",
				"Confirmar",
				"Opci�n",
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
		
		laminaOpciones = new Lamina("Opci�n",new String[]{
				
				"String[]",
				"Icon[]",
				"Object[]"				
				
		});
		
		laminaEntrada = new Lamina("Entrada",new String[]{
				
				"Campo de Texto",
				"Combo"				
				
		});
		
		//A�adimos las l�minas de las cajas a la l�mina principal
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensajes);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaConfirmar);
		laminaCuadricula.add(laminaOpciones);
		laminaCuadricula.add(laminaEntrada);
		
		//Creamos la l�mina inferior
		JPanel laminaMostrar = new JPanel();
		
		//Creamos el bot�n
		JButton botonMostrar = new JButton("Mostrar");
		
		botonMostrar.addActionListener(new AccionMostrar());
		
		//A�adimos el bot�n a la l�mina
		laminaMostrar.add(botonMostrar);
		
		//A�adimos la l�mina inferior, situ�ndola en la parte inferior
		add(laminaMostrar, BorderLayout.SOUTH);
		
		//A�adimos la l�mina principal y la colocamos en el centro
		add(laminaCuadricula, BorderLayout.CENTER);
				
	}
	
	//M�todo que nos devuelva el mensaje seleccionado
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
	
	//Clase privada que dar� funcionalidad al bot�n mostrar
	private class AccionMostrar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(laminaTipo.getSeleccion().equals("Mensaje")){
				
				JOptionPane.showMessageDialog(Marco.this, getMensaje(), "T�tulo", 0);
				
			}else if(laminaTipo.getSeleccion().equals("Confirmar")){
				
				JOptionPane.showConfirmDialog(Marco.this, getMensaje(), "T�tulo", 0,0);
				
			}else if(laminaTipo.getSeleccion().equals("Entrada")){
				
				JOptionPane.showInputDialog(Marco.this, getMensaje(), "T�tulo", 0);
				
			}else if(laminaTipo.getSeleccion().equals("Opci�n")){
				
				JOptionPane.showOptionDialog(Marco.this, getMensaje(), "T�tulo", 0, 0, null, null, null);
				
			}
			
		}
		
	}
	//Declaraci�n de variables de las distintas l�minas
	private Lamina laminaTipo, laminaTipoMensajes, laminaMensaje, laminaConfirmar, laminaOpciones, laminaEntrada;
	//Declaraci�n de variables a usar como par�metros
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src/bolazul.gif");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new LaminaEjemplo();
}
