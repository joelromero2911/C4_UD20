package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GraphicApp extends JFrame{
	// Attributes.
	private JPanel contentPane;
	
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
		label.setBounds(60, 20, 187, 52);
		label.setBorder(border);
		label.addComponentListener(new ComponentAdapter() 
		{ 
		        public void componentResized(ComponentEvent evt) {
		        	label.setBounds(getY(), getX(), getWidth(), getHeight());
		        }
		});
		
		contentPane.add(label);
	}
}