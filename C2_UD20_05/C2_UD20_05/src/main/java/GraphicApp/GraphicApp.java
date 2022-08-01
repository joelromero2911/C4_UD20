package GraphicApp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GraphicApp extends JFrame{
	/*Attributes*/
	private JPanel contentPane;
	
	private JTextArea textArea;

	/*Constructor*/
	public GraphicApp() {
		
		/*Definition of the window */
		
		
		setTitle("Ventana con interaccion");//PopUp window title
		
		/* X Y coordinates of the application and its height and length */
		setBounds(700, 200, 563, 398);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Close the window  when the operation is close
		
		setVisible(true);//It allows the window to be visible
		
		/*Creation and added the panel to the window*/
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JButton btn = new JButton("Limpiar");

		btn.setBounds(223, 11, 89, 23);
		contentPane.add(btn);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(28, 45, 489, 303);
		contentPane.add(textArea);
		
		/*Creation of the button listener*/								
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});

//		textArea.setLineWrap(true); //Allows the wrap , commented because is no need it

		/*Creation of the textArea listener*/								
		textArea.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				String InputText = "·Se ha dejado de pulsar el ratón\n"+textArea.getText();
				textArea.setText(InputText);	
				}
			
			public void mousePressed(MouseEvent e) {
				String InputText = "·Se ha pulsado el textArea con el ratón\n" +textArea.getText();
				textArea.setText(InputText);

			}
			
			public void mouseExited(MouseEvent e) {
				String InputText = "·El ratón ha salido del textArea\n"+textArea.getText();
				textArea.setText(InputText);
			}
			
			public void mouseEntered(MouseEvent e) {
				String InputText = "·Ha entrado el ratón al textArea \n"+textArea.getText();
				textArea.setText(InputText);	

			}
			
			public void mouseClicked(MouseEvent e) {
				String InputText = "·Se ha clicado el textArea con el ratón\n"+textArea.getText();
				textArea.setText(InputText);	
			}
			
		});
		

	}
}
