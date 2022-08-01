package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GraphicApp extends JFrame{
	// Attributes.
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Default constructor for 'GraphicApp'.
	 */
	public GraphicApp() {
		
		// Parameters of the main window.
		setTitle("04");
		setBounds(400, 200, 501, 277);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Definition of a border.
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		// Creation of a JLabel.
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel);
		
		// Creation of a TextArea.
		JTextArea textArea = new JTextArea("Texto Inicial");
		textArea.setBounds(79, 11, 396, 137);
		textArea.setEditable(false);
		textArea.setBorder(border);
		contentPane.add(textArea);
		
//		textArea.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseEntered(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				textArea.setText("Mouse Entered\n" + textArea.getText());
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				textArea.setText("Mouse Exited\n" + textArea.getText());
//			}
//
//			@Override
//			public void mousePressed(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				textArea.setText("Mouse Pressed\n" + textArea.getText());
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				textArea.setText("Mouse Released\n" + textArea.getText());
//			}
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				textArea.setText("Mouse Clicked\n" + textArea.getText());
//			}
//		});
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				textArea.setText("Window Closing\n" + textArea.getText());
			}
			
			public void windowClosed(WindowEvent e){
				textArea.setText("Window Closed\n" + textArea.getText());
			}
			
			public void windowActivated(WindowEvent e){
				textArea.setText("Window Activated\n" + textArea.getText());
			}
			
			public void windowDeactivated(WindowEvent e){
				textArea.setText("Window Deactivated\n" + textArea.getText());
			}
			
			public void windowDeiconified(WindowEvent e){
				textArea.setText("Window Deiconified\n" + textArea.getText());
			}
			
			public void windowIconified(WindowEvent e){
				textArea.setText("Window Iconified\n" + textArea.getText());
			}
			
			public void windowOpened(WindowEvent e){
				textArea.setText("Window Opened\n" + textArea.getText());
			}
		});
		

	}
}