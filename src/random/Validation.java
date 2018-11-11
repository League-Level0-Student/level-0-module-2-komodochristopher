//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		
		
		
for(int i=0;i<10;i++) {
	int randomNumber = randomMaker.nextInt(5);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber==0) {
			
		// 2. Repeat all the code above 10 times
	  JOptionPane.showMessageDialog(null, "");
	 JOptionPane.showMessageDialog(null, "your pants are nice");
		// 3. Find someone to test out your program. They will like it :)
	}
		if(randomNumber==1) {
			 JOptionPane.showMessageDialog(null, "you're good at programming ");	
		}
		if(randomNumber==2) {
			 JOptionPane.showMessageDialog(null, " nice pants");	
		}
		if(randomNumber==3) {
			 JOptionPane.showMessageDialog(null, " nice shirt");	
		}
		if(randomNumber==4) {
			 JOptionPane.showMessageDialog(null, " nice shoes");	
        }
		
		
}		
}
}