package GraphicApp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class GraphicApp extends JFrame{
	
	/*Attributes*/
	private JPanel contentPane;
	
	private JTextArea textArea;
	private JTextField textFieldInput;
	private JTextField textFieldResult;
	private JButton btnMakeConversion ;
	private static boolean eurosPtas = true;
	

	/*Constructor*/
	public GraphicApp() {
		
		/*Definition of the window */
		
		
		setTitle("Calculadora cambio de monedas");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(700, 200, 518, 181);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		/*Creation, definition of dimensions and added to the panel of the labels*/		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(34, 35, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(278, 35, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		/*Creation, definition of dimensions and added to the panel of the textfields*/		
		textFieldInput = new JTextField();
		textFieldInput.setBounds(157, 32, 100, 20);
		contentPane.add(textFieldInput);
		textFieldInput.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(347, 32, 100, 20);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		/*Creation, definition of dimensions and added to the panel of the buttons*/		
		JButton btnChangeConversion = new JButton("Cambiar");
		btnChangeConversion.setBounds(270, 78, 89, 23);
		contentPane.add(btnChangeConversion);
		
		btnMakeConversion = new JButton("Euros a ptas");
		btnMakeConversion.setBounds(157, 78, 107, 23);
		contentPane.add(btnMakeConversion);
		
		
		JButton btnClean = new JButton("Borrar");
		btnClean.setBounds(365, 78, 80, 23);
		contentPane.add(btnClean);
		
		/*Creation of the buttons listeners*/	
		
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldInput.setText(null);
				textFieldResult.setText(null);
			
			}
		});
		
		
		
		btnChangeConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //Change the text of the textfield 
				
				if(eurosPtas) { 
					btnMakeConversion.setText("Ptas a euros");
				}else {
					btnMakeConversion.setText("Euros a ptas");	
				}
				eurosPtas =! eurosPtas;		
			}
		});
		
	
		
		btnMakeConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Converts and save the result in the result textfield in a specific format
				
				try { 
					Double r = Double.parseDouble(textFieldInput.getText());
					
					if(eurosPtas) {
						 r  *= 166.386;
					}else {
						r /= 166.386;
					}
					DecimalFormat df = new DecimalFormat("#.####");
					String formatted = df.format(r); 
					textFieldResult.setText(formatted);
					
				}catch(NumberFormatException e1) { //If the user introduces another thing that is not a number the app shows the next message and carry on executing
					JOptionPane.showMessageDialog(null,"Se ha introducido un formato erroneo no se puede convertir!");
					System.out.println(e1);
				}
				
			}
		});
	
		
	}
}
