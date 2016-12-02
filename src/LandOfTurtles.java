import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;


public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
int pi = 20;

// 1. Create a frame & make it visible
JFrame jim = new JFrame();
jim.setVisible(true);
		// 2. Add the panel to the frame
		jim.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);

		// 4. Instantiate a Turtle 
for(int i= 0; i < 50; i++){
Turtle bert = new Turtle();
bert.setX(pi += 30);
// 5. Add the turtle to the panel 
		panel.addTurtle(bert);
		// 6. Put 50 Turtles on the beach
}

	}
}
