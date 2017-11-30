import javax.imageio.ImageTypeSpecifier;
import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		if(score == 2);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String question = JOptionPane.showInputDialog(null,"Man. He crawls on all fours as a baby, then walks on two feet as an adult, and then walks with a cane as an old man.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (question.equals("man")) {
	 JOptionPane.showMessageDialog(null,"CORRECT");
score ++ ;
} else {
	JOptionPane.showMessageDialog(null,"WRONG");
	score -- ;
}
		// 5. Otherwise, say "wrong" and tell them the answer
String question2 = JOptionPane.showInputDialog(null,"Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");

		// 6. Add some more riddles
if (question2.equals("meat")) {
	 JOptionPane.showMessageDialog(null,"CORRECT");
score ++ ;
} else {
	JOptionPane.showMessageDialog(null,"WRONG");
	score -- ;
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null,score);	
	}
}

