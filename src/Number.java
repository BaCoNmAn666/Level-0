import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number implements ActionListener {

	
	public static void main(String[]args){
		Number j = new Number();
	j.start();
	}

	int h = 21;
	JButton bob = new JButton("UP");
	JButton jim = new JButton("DOWN");
	JButton joe = new JButton("RANDOM");
	JLabel n = new JLabel("" + h);
	JFrame p = new JFrame();
	JPanel f = new JPanel();
	Random r = new Random();
	
	void start(){
		p.setVisible(true);
		p.setSize(500, 500);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(f);
		f.add(bob);
		f.add(jim);
		f.add(joe);
		f.add(n);
		bob.addActionListener(this);
		jim.addActionListener(this);
		joe.addActionListener(this);
		bob.setSize(75, 50);
		jim.setSize(75, 50);
		joe.setSize(75, 50);
		n.setSize(100,100);
		bob.setLocation(50, 25);
		jim.setLocation(250, 25);
		joe.setLocation(350, 25);
		n.setLocation(250, 100);
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bob){
			h = h + 1;
			n.setText("" + h);
		}
		if(e.getSource() == jim){
			h = h - 1;
			n.setText("" + h);
		}
		if(e.getSource() == joe){
	h = r.nextInt();
	n.setText("" + h);
		}
		}
	}
