package GraphicApp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraphicApp extends JFrame{
	/*Attributes*/
	private JPanel contentPane;
	private JLabel lbl;
	/*Constructor*/
	
	public GraphicApp() {
		
		/*Definition of the window */
		
		
		setTitle("Ventana con interaccion");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(700, 200, 508, 143);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		/*Creation, definition of dimensions and added to the panel of the label*/		
		lbl = new JLabel("Has pulsado: Ningun Botón");
		lbl.setBounds(49, 26, 172, 14);
		contentPane.add(lbl);

		/*Creation, definition of dimensions and added to the panel of the buttons*/		
		JButton btn1= new JButton("Boton 1");

		btn1.setBounds(213, 22, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(327, 22, 89, 23);
		contentPane.add(btn2);
		
		/*Creation of the buttons listeners*/						
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Has pulsado: Botón 1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Has pulsado: Botón 2");				
			}
		});
	
	}
}
