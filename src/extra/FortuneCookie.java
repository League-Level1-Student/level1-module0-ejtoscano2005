package extra;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	

	
public void showButton(){
	System.out.println("Button clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton( "CLICK FOR FORTUNE");
	 frame.add(button);
	 frame.pack(); 
	 button.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	 int rand = new Random().nextInt(5);
	 if(rand==0){
		 JOptionPane.showMessageDialog(null, "A beautiful, smart, and loving person will be coming into your life.");
	 }
	 if(rand==1){
		 JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage.");
	 }
	 if(rand==2){
		 JOptionPane.showMessageDialog(null, "A faithful friend is a strong defense.");
	 }
	 if(rand==3){
		 JOptionPane.showMessageDialog(null, "A feather in the hand is better than a bird in the air.");
	 }
	 if(rand==4){
		 JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
	 }
	 JOptionPane.showMessageDialog(null, "Woohoo");
}
}
