/**
 * 
 */

/**
 * @author Nick
 *
 */
import javax.swing.*;
public class WhatIsYourName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		name = JOptionPane.showInputDialog("Hello! What is your name?");
		JOptionPane.showMessageDialog(null, "Nice to meet you,\n "+name+"! <3");

	}

}
