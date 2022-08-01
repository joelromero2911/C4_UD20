package GraphicApp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
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
		
		
		setTitle("Ventana con interaccion");//PopUp window title
		
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
		btnChangeConversion.setBounds(286, 78, 89, 23);
		contentPane.add(btnChangeConversion);
		
		btnMakeConversion = new JButton("Euros a ptas");
		btnMakeConversion.setBounds(157, 78, 107, 23);
		contentPane.add(btnMakeConversion);
		
		/*Creation of the buttons listeners*/										
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
				Double r = 0.0;
				if(eurosPtas) {
					 r =	Double.parseDouble(textFieldInput.getText()) * 166.386;
				}else {
					r = Double.parseDouble(textFieldInput.getText()) / 166.386;
				}
			   
				DecimalFormat df = new DecimalFormat("#.####");
				String formatted = df.format(r); 
				textFieldResult.setText(formatted);
			}
		});
		
	}
}
