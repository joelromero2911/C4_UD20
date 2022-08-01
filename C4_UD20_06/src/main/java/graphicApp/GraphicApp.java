package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class GraphicApp extends JFrame{
	
	// Attributes.
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	/**
	 * Default constructor for 'GraphicApp'.
	 */
	public GraphicApp() {
		
		// Parameters of the main window.
		setTitle("06");
		setBounds(400, 200, 496, 202);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// JLabel + JTextField -> 'Altura (metros)'.
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(30, 22, 105, 17);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(134, 20, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// JLabel + JTextField -> 'Altura (metros)'.
		JLabel lblPesokg = new JLabel("Peso (kg)");
		lblPesokg.setBounds(247, 22, 102, 17);
		contentPane.add(lblPesokg);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(327, 20, 86, 20);
		contentPane.add(textField_1);
		
		
		// JLabel + JTextField -> 'Altura (metros)'.
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(229, 64, 29, 14);
		contentPane.add(lblImc);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(278, 61, 86, 20);
		contentPane.add(textField_2);
		
		// Button 'Calcular IMC'.
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(95, 60, 102, 23);
		contentPane.add(btnNewButton);
		
		// Button listener, calculates the IMC with the values introduced in the others JTextField.
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double altura = Double.parseDouble(textField.getText());
				double peso = Double.parseDouble(textField_1.getText());
				double resultado = peso / (altura * altura);
				textField_2.setText(String.format("%.2f", resultado));
			}
		});
		
		
	}
}