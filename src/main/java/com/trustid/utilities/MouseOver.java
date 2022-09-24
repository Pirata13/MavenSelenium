package com.trustid.utilities;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class MouseOver extends Frame implements ActionListener {
	
	// Java program to move a mouse from the initial
	// location to a specified location

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		// Frame
		static JFrame f;

		// textField
		static TextField x, y;

		// default constructor
		MouseOver()
		{
		}

		// main function
		@SuppressWarnings("deprecation")
		public static void main(String args[]) {
			// object of class
			MouseOver rm = new MouseOver();

			// create a frame
			f = new JFrame("robomouse");

			// set the frame to close on exit
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// create textfield
			x = new TextField(7);
			y = new TextField(7);

			// create a button
			Button b = new Button("OK");

			// add actionListener
			b.addActionListener(rm);

			// create a panel
			Panel p = new Panel();

			// add items to panel
			p.add(x);
			p.add(y);
			p.add(b);

			f.add(p);

			// setsize of frame
			f.setSize(300, 300);

			f.show();
		}
		

	@Override
	public void actionPerformed(ActionEvent e) {
			try {
			
	

				    Robot hal = new Robot();
				    Random random = new Random();
				    while(true){
				      hal.delay(1000 * 60);
				      int x = random.nextInt() % 640;
				      int y = random.nextInt() % 480;
				      hal.mouseMove(x,y);
				      System.out.println("Moving the cursor...");
				      
				      Thread.sleep(30);
				      
				    }
				  
				}catch (Exception evt) {
					System.err.println(evt.getMessage());
				}
			
		}
}
