import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String [] args){
		pointyBois(10);
	house(10);
}
	public static void house(int x ){
		Robot e = new Robot(0,600);
		String u =JOptionPane.showInputDialog("how big would you like your houses");
		String color =JOptionPane.showInputDialog("what color would you like your houses");
		int a = 0;
		int b = 0;
		int c = 0;
		if(color.equals("red")){
			 a = 255;
			 b = 0;
			 c = 0;
		}if(color.equals("orange")){
			 a = 255;
			 b = 150;
			 c = 0;
		}if(color.equals("yellow")){
			 a = 255;
			 b = 255;
			 c = 0;
		}if(color.equals("green")){
			 a = 0;
			 b = 255;
			 c = 0;
		}if(color.equals("blue")){
			 a = 0;
			 b = 0;
			 c = 255;
		}if(color.equals("purple")){
			 a = 255;
			 b = 0;
			 c = 255;
		}
		int height = 0;
		if(u.equals("small")){
			height=60;
		}
		if(u.equals("medium")){
			height=120;
		}
		if(u.equals("large")){
			height=250;
		}
		for(int y = 0;y<x ;y++){
			
		e.setSpeed(10);
		e.setPenColor(a,b,c);
		e.penDown();
		e.move(height);
		e.turn(90);
		e.move(20);
		e.turn(90);
		e.move(height);
		e.turn(-90);
		e.setPenColor(0,255,0);
		e.move(20);
		e.turn(-90);
		e.setPenColor(a,b,c);}
		}	
		public static void pointyBois(int n){
		Robot l= new Robot(0,600);
		int a = 0;
		int b = 0;
		int c = 0;
		String color =JOptionPane.showInputDialog("what color would you like your houses");
		if(color.equals("red")){
			 a = 255;
			 b = 0;
			 c = 0;
		}if(color.equals("orange")){
			 a = 255;
			 b = 150;
			 c = 0;
		}if(color.equals("yellow")){
			 a = 255;
			 b = 255;
			 c = 0;
		}if(color.equals("green")){
			 a = 0;
			 b = 255;
			 c = 0;
		}if(color.equals("blue")){
			 a = 0;
			 b = 0;
			 c = 255;
		}if(color.equals("purple")){
			 a = 255;
			 b = 0;
			 c = 255;
		}
		for(int m=0;m<n ;m++){
		l.setSpeed(10);
		l.penDown();
		l.setPenColor(a,b,c);
		l.move(100);
		l.turn(45);
		l.move(20);
		l.turn(90);
		l.move(20);
		l.turn(45);
		l.move(100);
		l.turn(-90);
		l.setPenColor(0,255,0);
		l.move(20);
		l.turn(-90);
		}
		}
	}

