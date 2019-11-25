package _06_test_scores;

import javax.swing.JOptionPane;

public class gwbvbhjvhkweyftg {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("INSERTt nsb kjz aAa   j auh fiush tTESTt  amh fjsho sSCOREe d wkhf knslk");
	double Input = Double.parseDouble(input);
	if (Input > 79 && Input < 100 ) {
		JOptionPane.showMessageDialog(null, "You passed");
	}
	else if (Input == 100 ) {
		JOptionPane.showMessageDialog(null, "Noice");
	}
	else {
		JOptionPane.showMessageDialog(null, "Dissapointing");
	}
}
}
