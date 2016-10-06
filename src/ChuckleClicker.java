import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[]args){
	ChuckleClicker Jim = new ChuckleClicker();
	Jim.makebuttons();	
	}
JFrame Bob = new JFrame();
JPanel Toby = new JPanel();
JButton Albert = new JButton();
JButton Bert = new JButton();
void makebuttons(){
	Bob.add(Toby);
	Bob.setVisible(true);
	Bob.setSize(250, 59);
	Toby.setVisible(true);
	Toby.setSize(200, 200);
	Toby.add(Albert);
	Toby.add(Bert);
	Albert.addActionListener(this);
	Bert.addActionListener(this);
	Albert.setText("Joke");
	Bert.setText("Puchline");
	Toby.setBackground(Color.green);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == Bert){
	JOptionPane.showMessageDialog(null, "He was lucky it was a soft drink.");
	}
	if(e.getSource() == Albert){
		JOptionPane.showMessageDialog(null, "Did you hear about the guy who got hit in the head with a can of soda?");
	}
	}
}
