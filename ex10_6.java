package ha;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
 
public class ex10_6 extends JFrame{
    private JLabel la = new JLabel("C");
    
    public ex10_6(){
        super("Ŭ�� ���� �� �������α׷�");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Container c = getContentPane();
        c.setLayout(null);
 
        c.add(la);
        la.setLocation(100, 100);
        la.setSize(30, 30); // ���̾ƿ� null�϶��� �� ����� ������� �Ѵ�.
 
        la.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int x = (int)(Math.random()*(c.getWidth()-50));
                int y = (int)(Math.random()*(c.getHeight()-50));
                la.setLocation(x, y);
            }
        });
 
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new ex10_6();
    }
}
