import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JokeTeller  implements ActionListener {
	
JFrame b = new JFrame("Jestro the Jester");

JButton c = new JButton("Joke");

JPanel e = new JPanel();

JButton f = new JButton("Punchline");

public static void main(String[]args){

JokeTeller kys = new JokeTeller();

kys.setup();

}

void setup() {

b.setVisible(true);

b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		JOptionPane.showMessageDialog(null, "What really is school?");
	}
	if(e.getSource() == f){
		JOptionPane.showMessageDialog(null, "AN UNDERCOVER NAZI CONCENTRATION CAMP");
	}
}

}