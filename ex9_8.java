import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Close"));
		add(new JButton("Exit")); 
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*250);
			int y=(int)(Math.random()*250);
		
			JLabel la = new JLabel("*");
			la.setLocation(x,y); 
			la.setSize(10, 10);
			la.setOpaque(true);
			add(la);
		}
	}
}
class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JButton("Integer Input"));
		add(new TextField(15));
	}
}
public class ex9_8 extends JFrame{

	ex9_8(){
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(300,300);
		
		add(new NorthPanel(),BorderLayout.NORTH);
		add(new CenterPanel(),BorderLayout.CENTER);
		add(new SouthPanel(),BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ex9_8();

	}

}
