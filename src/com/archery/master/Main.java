package com.archery.master;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) throws Exception {
        try {
            new Game().StartGame();
	} catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,
            "We are sorry about that!\nError: " + e.getMessage(),
            "Opps!! Something went wrong!", JOptionPane.ERROR_MESSAGE);
	} catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,
            "We are sorry about that!\nError: " + e.getMessage(),
            "Opps!! Something went wrong!", JOptionPane.ERROR_MESSAGE);
	}
    }
}