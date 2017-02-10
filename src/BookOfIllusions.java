import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame b = new JFrame();
	private void createBook() {
		// 2. make the frame visible
		b.setVisible(true);
		// 3. set the size of the frame
		b.setSize(750, 750);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String heck = ("Illusion.jpg");
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel l = loadImageFromComputer(heck);
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		b.add(l);
		// 9. call the pack() method on the frame
		b.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
	b.addMouseListener(this);
	b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
		b.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		String pop = "Trippy.jpg";
		JLabel p = loadImageFromComputer(pop);
		b.add(p);
		// 14. pack the frame
		b.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
