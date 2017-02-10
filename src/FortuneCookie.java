import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    
    public static void main(String[] args) {
        FortuneCookie cookie = new FortuneCookie();
        cookie.showButton();
    }
    
    public FortuneCookie() {
        frame = new JFrame();
        frame.setSize(300, 100);

        panel = new JPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton();
        button.setText("Click for fortune!");
        panel.add(button);
        
        button.addActionListener(this);
    }
    
    public void showButton() {
        frame.setVisible(true);
    }
    
    public void showFortune() {
        String message;
        switch (new Random().nextInt(4)) {
            case 0:
                message = "You are going to make lots of money";
                break;
            case 1:
                message = "You will have many great healthy kittens";
                break;
            case 2:
                message = "Love is appearing after football games";
                break;
            case 3:
                message = "You colleagues have great respect for you";
                break;
            default:
                message = "<Blank>";
                break;
        }
        JOptionPane.showMessageDialog(frame, message);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(button)) {
            showFortune();
        }
    }
}
