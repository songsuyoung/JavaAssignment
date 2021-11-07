import javax.swing.*;
import java.awt.*;

public class ex9_6 extends JFrame{

	ex9_6(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<20;i++) {
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
		
			JLabel la = new JLabel("");
			la.setBounds(x, y, 10, 10); 
			la.setOpaque(true);
			la.setBackground(Color.BLUE);
			c.add(la);
		}
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex9_6();
	}

}
