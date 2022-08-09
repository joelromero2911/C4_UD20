package graphicApp;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.Border;

public class GraphicApp extends JFrame{
	
	// Attributes.
	private JPanel contentPane;
	private JToggleButton tempButton =  new JToggleButton();
	private int cardsShowed = 0;
	private int guessedPairs = 0;
	private int tries =0;
	private JLabel lblTriesCounter;	
	private JLabel lblNewLabel;
	/**
	 * Default constructor for 'GraphicApp'.
	 */
	public GraphicApp() {
		
		// Parameters of the main window.
		setTitle("Juego de formar Parejas");
		setBounds(400, 200, 479, 473);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Components
		/*Creation, definition of dimensions and added to the panel of the JTogglebuttons*/		
		JToggleButton toggle0 = new JToggleButton();
		toggle0.setBounds(18, 36, 99, 87);
		toggle0.setSelected(true);
		contentPane.add(toggle0);
		
		JToggleButton toggle1 = new JToggleButton();
		toggle1.setBounds(127, 36, 99, 87);
		toggle1.setSelected(true);
		contentPane.add(toggle1);
		
		JToggleButton toggle2 = new JToggleButton();
		toggle2.setBounds(236, 36, 99, 87);
		toggle2.setSelected(true);
		contentPane.add(toggle2);
		
		JToggleButton toggle3 = new JToggleButton();
		toggle3.setBounds(345, 36, 99, 87);
		toggle3.setSelected(true);
		contentPane.add(toggle3);
		
		JToggleButton toggle4 = new JToggleButton();
		toggle4.setBounds(18, 134, 99, 87);
		toggle4.setSelected(true);
		contentPane.add(toggle4);
		
		JToggleButton toggle5 = new JToggleButton();
		toggle5.setBounds(127, 134, 99, 87);
		toggle5.setSelected(true);
		contentPane.add(toggle5);
		
		JToggleButton toggle6 = new JToggleButton();
		toggle6.setBounds(236, 134, 99, 87);
		toggle6.setSelected(true);
		contentPane.add(toggle6);
		
		JToggleButton toggle7 = new JToggleButton();
		toggle7.setBounds(345, 134, 99, 87);
		toggle7.setSelected(true);
		contentPane.add(toggle7);
		
		JToggleButton toggle8 = new JToggleButton();
		toggle8.setBounds(18, 232, 99, 87);
		toggle8.setSelected(true);
		contentPane.add(toggle8);
		
		JToggleButton toggle9 = new JToggleButton();
		toggle9.setBounds(127, 232, 99, 87);
		toggle9.setSelected(true);
		contentPane.add(toggle9);
		
		JToggleButton toggle10 = new JToggleButton();
		toggle10.setBounds(236, 232, 99, 87);
		toggle10.setSelected(true);
		contentPane.add(toggle10);
		
		JToggleButton toggle11 = new JToggleButton();
		toggle11.setBounds(345, 232, 99, 87);
		toggle11.setSelected(true);
		contentPane.add(toggle11);
		
		JToggleButton toggle12 = new JToggleButton();
		toggle12.setBounds(18, 330, 99, 87);
		toggle12.setSelected(true);
		contentPane.add(toggle12);
		
		JToggleButton toggle13 = new JToggleButton();
		toggle13.setBounds(127, 330, 99, 87);
		toggle13.setSelected(true);
		contentPane.add(toggle13);
		
		JToggleButton toggle14 = new JToggleButton();
		toggle14.setBounds(236, 330, 99, 87);
		toggle14.setSelected(true);
		contentPane.add(toggle14);
		
		JToggleButton toggle15 = new JToggleButton();
		toggle15.setBounds(345, 330, 99, 87);
		toggle15.setSelected(true);
		contentPane.add(toggle15);
		
		/*Definition of dimensions and added to the panel of the labels*/		
		lblNewLabel = new JLabel("Intentos:");
		lblNewLabel.setBounds(192, 9, 59, 14);
		contentPane.add(lblNewLabel);
		
		lblTriesCounter = new JLabel("0");
		lblTriesCounter.setBounds(245, 9, 46, 14);
		contentPane.add(lblTriesCounter);
		
		// Arrays that will be used along the code.
		JToggleButton[] toggleButtons = {toggle0, toggle1, toggle2, toggle3, toggle4, toggle5, toggle6, toggle7, toggle8, toggle9, toggle10, toggle11, toggle12, toggle13, toggle14, toggle15};
		Color[] colorsAssigned = new Color[16];
		Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.DARK_GRAY};

		asignColorsRandomly(toggleButtons, colorsAssigned, colors); // Asigns colors from a list of colors, until there is 2 buttons of each color.
		
		// Adding the action of calling 'showColor(JToggleButton btn)' method to all the JToggleButtons.
		toggle0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle0);
			}
		});
		
		toggle1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle1);
			}
		});
		
		toggle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle2);
			}
		});
		
		toggle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle3);
			}
		});

		toggle4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle4);
			}
		});
		
		toggle5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle5);
			}
		});
		
		toggle6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle6);
			}
		});
		
		toggle7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle7);
			}
		});
		
		toggle8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle8);
			}
		});
		
		toggle9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle9);
			}
		});
		
		toggle10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle10);
			}
		});

		toggle11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle11);
			}
		});
		
		toggle12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle12);
			}
		});
		
		toggle13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle13);
			}
		});
		
		toggle14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle14);
			}
		});
		
		toggle15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showColor(toggle15);
			}
		});
	
	}
	
	/**
	 * Asigns colors from a list of colors, until there is 2 buttons of each color.
	 * 
	 * @param toggleButtons 
	 * @param colorsAsigned array of Colors that will have the colors assigned to the buttons 
	 * @param colors array with all the colors available
	 */
	public void asignColorsRandomly(JToggleButton[] toggleButtons, Color[] colorsAssigned, Color[] colors) {
		
		int randomNum;
		
		for (int i = 0; i < colors.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				do {
					randomNum = (int) Math.floor(Math.random() * colorsAssigned.length);
				} while (colorsAssigned[randomNum] != null);
				
				colorsAssigned[randomNum] = colors[i];
				toggleButtons[randomNum].setBackground(colors[i]);
			}
		}

	}
	
	/**
	 * Method that shows the color asigned to the button, compares buttons when 2 clicked, to take the necessary action.
	 * 
	 * @param btn -> The button that will show the color.
	 * @param colors -> Color of the btn.
	 */	
	public void showColor (JToggleButton btn) {
		
		if(!tempButton.toString().equals(btn.toString())) {
			
			btn.setEnabled(false);
			
			// Checks if the background of the previous button is the same of the actual one, preventing the user from clicing the same button 2 times.
			if(tempButton.getBackground() == btn.getBackground() && !tempButton.toString().equals(btn.toString())) {
					
					JOptionPane.showMessageDialog(null, "Pareja Adivinada!!");
					guessedPairs++;
					
					// If the used got all the pairs, a pop up will show telling that the game is finished.
					if(guessedPairs == 8) {
						JOptionPane.showMessageDialog(null, "Has acabado el juego en "+tries+" intentos!!");
					}

					btn.setVisible(false); // Makes disappear the guessed pair && the tries counter labels.
					tempButton.setVisible(false);
					lblTriesCounter.setVisible(false);
					lblNewLabel.setVisible(false);
			}
			cardsShowed ++;
			
			// When 2 buttons have been selected the following block of code its triggered.
			if(cardsShowed == 2) {
				
				//Add 1 try to the tries counter and reflects it on the screen
				tries++; 
				lblTriesCounter.setText(String.valueOf(tries));
				
				// Disable all buttons to prevent the user from bugging the GraphicApp.
				for (Component c : contentPane.getComponents()) {
					if(c instanceof JToggleButton) {
						c.setEnabled(false);
					}
				}
				
				// Start a timer to give the user some time to watch the color of the selected buttons.
				Timer timer = new Timer(800, new ActionListener(){
					public void actionPerformed( ActionEvent e ){
						cardsShowed = 0;
						btn.setSelected(true); // Hides the color of the button again.
						tempButton.setSelected(true);
						tempButton = new JToggleButton(); // Reset of the tempButton.
						
						// Reenable all buttons to continue the game.
						for (Component c : contentPane.getComponents()) {
							if(c instanceof JToggleButton) {
								c.setEnabled(true);
							}
						}
					}
				});
				timer.setRepeats(false);
				timer.start();
				
			}else {
				tempButton = btn; // Saves the button when its the 1st selected of the pair to compare it with the next one clicked.
			}
		}
	}
}
