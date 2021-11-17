package ha;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ha.ClickAndDoubleClickEx.MyMouseListener;

public class ex10_2 extends JFrame{

	JPanel c;
	ex10_2(){
		setTitle("µå·¹±ëµ¿¾È YELLOW");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = new JPanel();
		setContentPane(c);
		c.addMouseMotionListener(new MyMotionListener());
		c.setBackground(Color.green);
		setSize(300,200);
		setVisible(true);
	}
	class MyMotionListener implements MouseMotionListener {
		
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.yellow);
		}
		
		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.green);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex10_2();
	}

}
