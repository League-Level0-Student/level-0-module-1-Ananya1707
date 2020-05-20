package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What is greater than god, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle1.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}

		// 6. Add some more riddles
		String riddle2 = JOptionPane.showInputDialog("What tastes better than it smells?");
		if(riddle2.equals("A tongue")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		
		String riddle3 = JOptionPane.showInputDialog("I am an odd number. Take away a letter I become even. What number am I?");
		if(riddle3.equals("seven")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		
		

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
	}
}

