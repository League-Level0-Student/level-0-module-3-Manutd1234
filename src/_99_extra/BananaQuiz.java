
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas = JOptionPane.showInputDialog("Do you like bananas");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(bananas.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		return;
		}
		
		//3. if they say yes
		else if(bananas.equals("yes")) {
			JOptionPane.showInputDialog("What is your favorite hobby");
		JOptionPane.showMessageDialog(null,bananas + " is much better with Bananas");
		}
		
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
		else {
			JOptionPane.showMessageDialog(null, "You are Bananas");
		}
	}

}
