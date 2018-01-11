//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Brian = ("X-ray vision");
String Kamron = ("superhuman strength");
String Elijah = ("super speed");
String Ian = ("Fire");
String Izzy = ("Ice");
	// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Enter your name, for superpower");

	// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("Izzy")) {
	JOptionPane.showMessageDialog(null, "your superpower is " + Izzy + " Izzy");
}
if (name.equals("Kamron")) {
	JOptionPane.showMessageDialog(null, "your superpower is " + Kamron + " Kamron");
}
if (name.equals("Ian")) {
	JOptionPane.showMessageDialog(null, "your superpower is " + Ian + " Ian");
}
if (name.equals("Elijah")) {
	JOptionPane.showMessageDialog(null, "your superpower is " + Elijah + " Elijah");
}
if (name.equals("Brian")) {
	JOptionPane.showMessageDialog(null, "your superpower is " + Brian + " Brian");	
}
	}
}

