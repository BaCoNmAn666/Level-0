import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyClass implements KeyListener {

	JFrame j = new JFrame("Window");
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
c.start();
	}
void start(){
	j.setVisible(true);
	j.addKeyListener(this);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyCode() == KeyEvent.VK_SPACE){
j.setSize(500, 400);
	}
	}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

	

	
}