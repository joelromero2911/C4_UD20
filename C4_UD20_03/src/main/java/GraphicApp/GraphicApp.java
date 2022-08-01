package GraphicApp;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;



public class GraphicApp extends JFrame {

	//Panel de la aplicacion
		private JPanel contentPane;
		protected JLabel textField;
	
		private int count=0;
		private int count2=0;
		public JLabel txt1;
		public JLabel txt2;
		
		
	public GraphicApp(){
		

	setTitle("Ventana con mas interacción");

	//Coordenadas X Y /   LONG    ALTURA
	setBounds(400, 200, 350, 200);

	//Indicamos que cuando se cierre la ventana se acaba la app
	setDefaultCloseOperation (EXIT_ON_CLOSE);

	//Hacer visible la ventana
	setVisible(true);

	//Creamos el panel
	contentPane = new JPanel();
	contentPane.setBackground(SystemColor.control);

	//Indicamos su diseño
	contentPane.setLayout (null);

	//asigno el panel de la ventana
	setContentPane (contentPane);
	
	//==========CREACION DE COMPONENTES============
	
	
	
	
	//TEXT BOX 1
	txt1 = new JLabel("Botón 1: "+count+" veces");
	txt1.setBounds(60, 20, 250, 20);
	contentPane.add(txt1);
	
	//TEXT BOX 2
	txt2 = new JLabel("Botón 2: "+count+" veces");
	txt2.setBounds(180, 20, 250, 20);
	contentPane.add(txt2);
	
	
	//ADD BUTTON 1
	JButton btn1 = new JButton("Botón 1");
	btn1.setBounds(60, 70, 100, 20);
	contentPane.add(btn1);
	btn1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
	
	//ADD BUTTON 2
	JButton btn2 = new JButton("Botón 2");
	btn2.setBounds(180, 70, 100, 20);
	contentPane.add(btn2);
	btn2.setBorder(new LineBorder(new Color(0, 0, 0), 0));
	
	

	
	/*Creation of the button listeners*/				
	btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			System.out.println(count);
			txt1.setText("Botón 1: "+count+" veces");
			
			
        }
		});
	
	/*Creation of the button listeners*/				
	btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count2++;
			System.out.println(count2);
			txt2.setText("Botón 2: "+count2+" veces");
		}
		});
	
	}
	
}
