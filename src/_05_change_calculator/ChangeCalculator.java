package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		// Ask the user how many nickels they have
String nickles = JOptionPane.showInputDialog("How many nickels do thy have?")
;		// Convert their answer to an int using Integer.parseInt()
int nickle = Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do thy have?")
;		
int dime = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("How many quarters do thy have?")
;		
int quarter = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
String pennies = JOptionPane.showInputDialog("How many penny do thy have?")
;		
int penny = Integer.parseInt(pennies);
		// Tell the user how much money they have
int i = nickle * 5;
int ii = dime * 10;
int iii = quarter * 25;
int h = penny * 1;
int money = i + ii + iii + h;
double mone = money / 100.0;
JOptionPane.showMessageDialog(null, money + " cents, or " + mone + " dollars");
	}
}

