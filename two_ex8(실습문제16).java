package example;
import java.util.*;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] computer = {"����","����","��"};
		Scanner scan =new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �Է��մϴ�.");
		
		while(true) {
			int ran=(int) ((Math.random()*3)%3);	
			System.out.print("���� ���� ��!>>");
			String input=scan.next();
			
			if(input.equals("�׸�"))
				break;
			
			if(computer[ran].equals(input))
				System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"�����ϴ�.");
			
			switch(input) {
			case "����":
				if(computer[ran].equals("��"))
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"����ڰ� �̰���ϴ�.");
				else
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"��ǻ�Ͱ� �̰���ϴ�.");
				break;
			case "����":
				if(computer[ran].equals("����"))
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"����ڰ� �̰���ϴ�.");
				else
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"��ǻ�Ͱ� �̰���ϴ�.");
				break;
			default:
				if(computer[ran].equals("����"))
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"����ڰ� �̰���ϴ�.");
				else
					System.out.println("����� = "+input+", ��ǻ�� = "+computer[ran]+","+"��ǻ�Ͱ� �̰���ϴ�.");
			}
		}
	}

}
