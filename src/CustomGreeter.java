import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustomGreeter implements ActionListener {
	JFrame b = new JFrame("Greeting Machine");

	JButton c = new JButton("Enter Name");

	String p;
	
	JPanel e = new JPanel();

	JButton f = new JButton("Get Greeting");

	public static void main(String[]args){
		CustomGreeter cg = new CustomGreeter();
		cg.setup();
	}
	void setup(){
		b.setVisible(true);
		
		b.add(e);
		e.add(c);
		e.add(f);
		b.pack();
		f.addActionListener(this);
		c.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == c){
		p = JOptionPane.showInputDialog("Enter your name");
		}
if(e.getSource() == f){
	JOptionPane.showMessageDialog(null, "Hello " + p + "  Welcome to Aushwitz.  I mean school.");
}
	}


}
