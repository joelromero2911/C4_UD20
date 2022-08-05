package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.Border;

public class GraphicApp extends JFrame{
	
	// Attributes.
	private JPanel contentPane;
	public JToggleButton tempButton =  new JToggleButton();
	public int cardsShowed = 0;
	
	/**
	 * Default constructor for 'GraphicApp'.
	 */
	public GraphicApp() {
		
		// Parameters of the main window.
		setTitle("09");
		setBounds(400, 200, 479, 448);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Components
		JToggleButton toggle0 = new JToggleButton();
		toggle0.setBounds(21, 11, 99, 87);
		contentPane.add(toggle0);
		
		JToggleButton toggle1 = new JToggleButton();
		toggle1.setBounds(130, 11, 99, 87);
		contentPane.add(toggle1);
		
		JToggleButton toggle2 = new JToggleButton();
		toggle2.setBounds(239, 11, 99, 87);
		contentPane.add(toggle2);
		
		JToggleButton toggle3 = new JToggleButton();
		toggle3.setBounds(348, 11, 99, 87);
		contentPane.add(toggle3);
		
		JToggleButton toggle4 = new JToggleButton();
		toggle4.setBounds(21, 109, 99, 87);
		contentPane.add(toggle4);
		
		JToggleButton toggle5 = new JToggleButton();
		toggle5.setBounds(130, 109, 99, 87);
		contentPane.add(toggle5);
		
		JToggleButton toggle6 = new JToggleButton();
		toggle6.setBounds(239, 109, 99, 87);
		contentPane.add(toggle6);
		
		JToggleButton toggle7 = new JToggleButton();
		toggle7.setBounds(348, 109, 99, 87);
		contentPane.add(toggle7);
		
		JToggleButton toggle8 = new JToggleButton();
		toggle8.setBounds(21, 207, 99, 87);
		contentPane.add(toggle8);
		
		JToggleButton toggle9 = new JToggleButton();
		toggle9.setBounds(130, 207, 99, 87);
		contentPane.add(toggle9);
		
		JToggleButton toggle10 = new JToggleButton();
		toggle10.setBounds(239, 207, 99, 87);
		contentPane.add(toggle10);
		
		JToggleButton toggle11 = new JToggleButton();
		toggle11.setBounds(348, 207, 99, 87);
		contentPane.add(toggle11);
		
		JToggleButton toggle12 = new JToggleButton();
		toggle12.setBounds(21, 305, 99, 87);
		contentPane.add(toggle12);
		
		JToggleButton toggle13 = new JToggleButton();
		toggle13.setBounds(130, 305, 99, 87);
		contentPane.add(toggle13);
		
		JToggleButton toggle14 = new JToggleButton();
		toggle14.setBounds(239, 305, 99, 87);
		contentPane.add(toggle14);
		
		JToggleButton toggle15 = new JToggleButton();
		toggle15.setBounds(348, 305, 99, 87);
		contentPane.add(toggle15);
		
		JToggleButton[] toggleButtons = {toggle0, toggle1, toggle2, toggle3, toggle4, toggle5, toggle6, toggle7, toggle8, toggle9, toggle10, toggle11, toggle12, toggle13, toggle14, toggle15};
		Color[] colorsAssigned = new Color[16];
		Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.DARK_GRAY};
		System.out.print("0");

		asignColorsRandomly(colorsAssigned, colors);
		
		toggle0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle0 ,colorsAssigned[0]);
			}
		});
		
		toggle1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle1 ,colorsAssigned[1]);
			}
		});
		
		toggle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle2 ,colorsAssigned[2]);
			}
		});
		
		toggle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle3 ,colorsAssigned[3]);
			}
		});

		toggle4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle4 ,colorsAssigned[4]);
			}
		});
		
		toggle5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle5 ,colorsAssigned[5]);
			}
		});
		
		toggle6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle6 ,colorsAssigned[6]);
			}
		});
		
		toggle7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle7 ,colorsAssigned[7]);
			}
		});
		
		toggle8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle8 ,colorsAssigned[8]);
			}
		});
		
		toggle9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle9 ,colorsAssigned[9]);
			}
		});
		
		toggle10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle10 ,colorsAssigned[10]);
			}
		});

		toggle11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle11 ,colorsAssigned[11]);
			}
		});
		
		toggle12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle12 ,colorsAssigned[12]);
			}
		});
		
		toggle13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle13 ,colorsAssigned[13]);
			}
		});
		
		toggle14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle14,colorsAssigned[14]);
			}
		});
		
		toggle15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle15 ,colorsAssigned[15]);
			}
		});
	
	}
	
	/**
	 * PUT METHOD EXPLENATION <---------------------------------------
	 * @param colorsAsigned array of Colors that will have the colors assigned to the buttons 
	 * @param colors array with all the colors available
	 */
	public void asignColorsRandomly(Color[] colorsAssigned, Color[] colors) {
		
		int randomNum;
		
		for (int i = 0; i < colors.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				do {
					randomNum = (int) Math.floor(Math.random() * colorsAssigned.length);
				} while (colorsAssigned[randomNum] != null);
				
				colorsAssigned[randomNum] = colors[i]; 
			}
		}

	}
	
	/**
	 *Method that shows a button color  |[Quitar]  @joel <------- Funciona MAL (Los colores no desapracen a veces y A veces se hacen match cuando no tienen que hacerse)
	 * @param btn The button that will show the color
	 * @param colors Color of the btn
	 */	
	public void showColor (JToggleButton btn ,Color color) {
		
		btn.setSelected(false); //Deselect the button to show the real color
		btn.setBackground(color);
		
		if(tempButton.getBackground() == btn.getBackground()) { //Check if the background of the last button is the same as this
				
				JOptionPane.showMessageDialog(null, "Pareja Adivinada!!");
				//Set the carts showed to 0 and disables the buttons
				cardsShowed = 0;
				btn.setEnabled(false);
				tempButton.setEnabled(false);
				tempButton = new JToggleButton(); // reset of the tempbutton
		}
	
		cardsShowed ++;
		if(cardsShowed == 2 ) {//If are 2 cards shown in this point that would mean that the user haven't guess the two buttons with the same color so it hides them
			cardsShowed = 0;
			
			hideColor(btn);
		}else {
			tempButton = btn;
		}
	}
	
	/**
	 * Method that hide a button color
	 * @param btn The button that will hide it's color
	 */
	public void hideColor (JToggleButton btn) /*throws InterruptedException*/ {
//        Thread.sleep(1000);
		btn.setSelected(true);
		tempButton.setSelected(true);

	}
	
}
