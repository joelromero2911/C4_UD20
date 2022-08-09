package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GraphicApp extends JFrame{
	// Attributes.
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Default constructor for 'GraphicApp'.
	 */
	public GraphicApp() {
		
		// Parameters of the main window.
		setTitle("01");
		setBounds(400, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Definition of a border.
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		// Creation of a JLabel.
		JLabel label = new JLabel("Etiqueta!");
		label.setBounds(10, 11, 187, 52);
		label.setBorder(border);
		contentPane.add(label);
		
		// Width
		textField = new JTextField("187");
		textField.setBounds(111, 372, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ancho");
		lblNewLabel.setBounds(55, 375, 46, 14);
		contentPane.add(lblNewLabel);
		
		// Height
		textField_1 = new JTextField("52");
		textField_1.setColumns(10);
		textField_1.setBounds(319, 372, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblAlto = new JLabel("Alto");
		lblAlto.setBounds(263, 375, 46, 14);
		contentPane.add(lblAlto);
		
		// Action button
		JButton btnNewButton = new JButton("Cambiar");
		btnNewButton.setBounds(185, 403, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textField.getText());
				int y = Integer.parseInt(textField_1.getText());
				label.setBounds(10, 11, x, y);
			}
		});
	}
}