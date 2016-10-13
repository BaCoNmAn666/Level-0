 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
String benny;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String paul = "http://brewminer.com/photos/1441184974_91cfb179ce_m.png";
		// 2. create a variable of type "Component" that will hold your image
Component jim;
		// 3. use the "createImage()" method below to initialize your Component
jim = createImage(paul);
		// 4. add the image to the quiz window
quizWindow.add(jim);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
benny = JOptionPane.showInputDialog("What brand of beer is he drinking?  Coors Light or Budwieser");
		// 7. print "CORRECT" if the user gave the right answer
if(benny.equalsIgnoreCase("Coors Light")){
	JOptionPane.showMessageDialog(null, "CORRECT!!");
}
		// 8. print "INCORRECT" if the answer is wrong
if(benny.equalsIgnoreCase("Budwieser")){
	JOptionPane.showMessageDialog(null, "INCORRECT IDIOT!");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(jim);
		// 10. find another image and create it (might take more than one line of code)
String rip = "http://2.bp.blogspot.com/-MA5uONRybFs/UUwkE1P0P5I/AAAAAAAAOrg/4iV-qVB8BFY/s1600/Funny+Cat+Drinking+Beer_7.jpg";
Component albert;
	albert = createImage(rip);
		// 11. add the second image to the quiz window
quizWindow.add(albert);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String hell;
hell = JOptionPane.showInputDialog("What is his head in, a beer glass or a bowl?");
		// 14+ check answer, say if correct or incorrect, etc.
if(hell.equalsIgnoreCase("Beer Glass")){
	JOptionPane.showMessageDialog(null, "CORRECT!!");
}
if(!(hell.equalsIgnoreCase("Bowl"))){
JOptionPane.showMessageDialog(null, "INCORRECT IDIOT!");	
}
JOptionPane.showMessageDialog(null, "Quiz over");
}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}