import javax.swing.*;
import java.awt.*;

public class ex9_4 extends JFrame{
	
	ex9_4(){
		setTitle("The Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1, 8);
		Container c = getContentPane();
		c.setLayout(grid);
		JButton bt=new JButton("1");
		bt.setBackground(Color.RED);
		c.add(bt);
		
		bt=new JButton("2");
		bt.setBackground(Color.ORANGE);
		c.add(bt);
		bt=new JButton("3");
		bt.setBackground(Color.YELLOW);
		c.add(bt);
		bt=new JButton("4");
		bt.setBackground(Color.GREEN);
		c.add(bt);
		bt=new JButton("5");
		bt.setBackground(Color.CYAN);
		c.add(bt);
		
		bt=new JButton("6");
		bt.setBackground(Color.BLUE);
		c.add(bt);
		
		bt=new JButton("7");
		bt.setBackground(Color.MAGENTA);
		
		c.add(bt);
		bt=new JButton("8");
		bt.setBackground(Color.PINK);
		
		c.add(bt);
		bt=new JButton("9");
		bt.setBackground(Color.GRAY);
		
		c.add(bt);
		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex9_4();
	}

}
