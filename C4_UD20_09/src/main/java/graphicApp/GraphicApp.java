package graphicApp;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

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
		setTitle("09");
		setBounds(400, 200, 479, 448);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// Creating the Jpanel that will contain the components.
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Components
		JToggleButton toggle_A_01 = new JToggleButton();
		toggle_A_01.setBounds(21, 11, 99, 87);
		contentPane.add(toggle_A_01);
		
		JToggleButton toggle_B_01 = new JToggleButton();
		toggle_B_01.setBounds(130, 11, 99, 87);
		contentPane.add(toggle_B_01);
		
		JToggleButton toggle_C_01 = new JToggleButton();
		toggle_C_01.setBounds(239, 11, 99, 87);
		contentPane.add(toggle_C_01);
		
		JToggleButton toggle_C_02 = new JToggleButton();
		toggle_C_02.setBounds(348, 11, 99, 87);
		contentPane.add(toggle_C_02);
		
		JToggleButton toggle_E_01 = new JToggleButton();
		toggle_E_01.setBounds(21, 109, 99, 87);
		contentPane.add(toggle_E_01);
		
		JToggleButton toggle_F_01 = new JToggleButton();
		toggle_F_01.setBounds(130, 109, 99, 87);
		contentPane.add(toggle_F_01);
		
		JToggleButton toggle_G_01 = new JToggleButton();
		toggle_G_01.setBounds(239, 109, 99, 87);
		contentPane.add(toggle_G_01);
		
		JToggleButton toggle_H_01 = new JToggleButton();
		toggle_H_01.setBounds(348, 109, 99, 87);
		contentPane.add(toggle_H_01);
		
		JToggleButton toggle_E_02 = new JToggleButton();
		toggle_E_02.setBounds(21, 207, 99, 87);
		contentPane.add(toggle_E_02);
		
		JToggleButton toggle_B_02 = new JToggleButton();
		toggle_B_02.setBounds(130, 207, 99, 87);
		contentPane.add(toggle_B_02);
		
		JToggleButton toggle_A_02 = new JToggleButton();
		toggle_A_02.setBounds(239, 207, 99, 87);
		contentPane.add(toggle_A_02);
		
		JToggleButton toggle_F_02 = new JToggleButton();
		toggle_F_02.setBounds(348, 207, 99, 87);
		contentPane.add(toggle_F_02);
		
		JToggleButton toggle_D_01 = new JToggleButton();
		toggle_D_01.setBounds(21, 305, 99, 87);
		contentPane.add(toggle_D_01);
		
		JToggleButton toggle_G_02 = new JToggleButton();
		toggle_G_02.setBounds(130, 305, 99, 87);
		contentPane.add(toggle_G_02);
		
		JToggleButton toggle_H_02 = new JToggleButton();
		toggle_H_02.setBounds(239, 305, 99, 87);
		contentPane.add(toggle_H_02);
		
		JToggleButton toggle_D_02 = new JToggleButton();
		toggle_D_02.setBounds(348, 305, 99, 87);
		contentPane.add(toggle_D_02);
		
		JToggleButton[] toggleButtons = {toggle_A_01, toggle_B_01, toggle_C_01, toggle_C_02, toggle_E_01, toggle_F_01, toggle_G_01, toggle_H_01, toggle_E_02, toggle_B_02, toggle_A_02, toggle_F_02, toggle_D_01, toggle_G_02, toggle_H_02, toggle_D_02};
//		String[][] colorsAsigned = {{"red", "blue", "green", "green"}, {"brown", "yellow", "orange", "pink"}, {"brown", "blue", "red", "yellow"}, {"purple", "orange", "pink", "purple"}};
		String[] colorsAsigned = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
		Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.DARK_GRAY};
		
		asignColorsRandomly(toggleButtons, colorsAsigned, colors);

	}
	
	public void asignColorsRandomly(JToggleButton[] toggleButtons, String[] colorsAsigned, Color[] colors) {
		
		int randomNum;
		
		for (int i = 0; i < colors.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				do {
					randomNum = (int) Math.floor(Math.random() * colorsAsigned.length);
				} while (!colorsAsigned[randomNum].equals(""));
				
				colorsAsigned[randomNum] = "A";
				toggleButtons[randomNum].setBackground(colors[i]);
			}
		}
	}
	
}
