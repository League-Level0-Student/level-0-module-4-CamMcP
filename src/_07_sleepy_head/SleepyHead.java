package _07_sleepy_head;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below \
		 *
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 * 
		 * 
		 * 
		 * /* Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!�? If it is a weekday, and we are on vacation, print
		 * “sleep in�?.
		 */
		int input = JOptionPane.showConfirmDialog(null, "Is it a weekend?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		System.out.println(input);
		int isvacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);
		System.out.println(isvacation);
		if (isvacation == 0) {
			int slep = JOptionPane.showConfirmDialog(null, "Sleep in?");
			if (slep == 0) {
				JOptionPane.showMessageDialog(null, "*SNORING ITENSEIFIES*");
			}
		} else if (input == 0) {
			int sleep = JOptionPane.showConfirmDialog(null, "Sleep in?");
			if (sleep == 0) {
				JOptionPane.showMessageDialog(null, "*SNORING ITENSEIFIES*");
			}
		} else if (input == 0 && isvacation == 0) {
			int sleeep = JOptionPane.showConfirmDialog(null, "Sleep in?");
			if (sleeep == 0) {
				JOptionPane.showMessageDialog(null, "*SNORING ITENSEIFIES*");
			}
			}
		else if (input == 1 && isvacation == 1){
			JOptionPane.showMessageDialog(null, "GET UP YOU PILE OF LAZYBONES!");
		}

	}

}
