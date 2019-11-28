package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	
	
	
	
	public static void main(String[] args) {
		
	
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want?");
		JOptionPane.showMessageDialog(null, "You chose a cat.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	if (happinessLevel < 200) {
		for (int i = 0; happinessLevel < 200; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Play with it", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Name it", "Feed it", "Play with it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	int Name = JOptionPane.showOptionDialog(null, "What do you want to name your pet?", "You don't have a choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"John", "Spots", "Otis"}, null);
if (Name == 2 ) {
	happinessLevel = happinessLevel + 50;
	JOptionPane.showMessageDialog(null, "You chose to name your pet Otis.");
}

else {
		 JOptionPane.showMessageDialog(null, "Your friend decided it should be named Otis, as you were taking to long.");
}
}
else if (task == 1) {
	int Food = JOptionPane.showOptionDialog(null, "What do you want to feed your pet?", "Otis Brans", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"Chocolate", "Cat food", "Otis Brans"}, null);
if (Food == 2) {
	happinessLevel = happinessLevel + 50;
	JOptionPane.showMessageDialog(null, "You decided to get Otis Brans.");
}
else {
	JOptionPane.showMessageDialog(null, "Your sister tells you should feed your cat Otis Brans, so you do.");
}
}
else {
	int toy = JOptionPane.showOptionDialog(null, "What toy do you want to get?", "Otis", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"A bone", "A ball", "A small toy cat named Otis"}, null);
if (toy == 2) {
	happinessLevel = happinessLevel + 50;
	JOptionPane.showMessageDialog(null, "You got the Otis toy, and your cat has a fun time with it.");
}
else {
	JOptionPane.showMessageDialog(null, "You decide to get the cheapest one, which is the Otis toy.");
}
}
	


			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel == 200) {
	JOptionPane.showMessageDialog(null, "ØTÍS LOVES YOU");
	break;
}
else {
	
}
		}
	}
	}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	
	


	