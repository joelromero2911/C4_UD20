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
//		label.addComponentListener(new ComponentAdapter() 
//		{ 
//		        public void componentResized(ComponentEvent evt) {
//		        	label.setBounds(getY(), getX(), getWidth(), getHeight());
//		        }
//		});
		label.addMouseListener(new MouseListener() {
			
			public void isLeftMouseButton(MouseEvent anEvent) {
				label.setBounds(60, 20, 200, 70);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(label);
		
		// Creation of a JSlider for control the JLabel.
		JSlider slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(1);
		slider.setValue(1);
		slider.setMaximum(5);
		slider.setBounds(60, 342, 356, 26);
//		slider.addChangeListener(new ChangeListener() {
//			public void stateChanged(ChangeEvent e) {
//				System.out.println("Slider2: " + slider2.getValue());
//			}
//		});
		contentPane.add(slider);
	}
}