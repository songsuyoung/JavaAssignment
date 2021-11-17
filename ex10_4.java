package ha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_4 extends JFrame{
	JPanel c = new JPanel();
	JLabel label;
	String message=new String("Love Java");
	int i=0;
	ex10_4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setTitle("<Left> 키를 이용한 문자 회전");
		setContentPane(c);
		
		label=new JLabel(message);
		c.addKeyListener(new MyKeyEvent());
		c.add(label);
		
		setVisible(true);
		c.requestFocus();
	}
	
	class MyKeyEvent extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT)  i++;
				message=message.substring(i)+message.substring(0,i);
				label.setText(message);
			if(i==message.length())
				i=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex10_4();
	}

}
