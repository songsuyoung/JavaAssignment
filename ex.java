package example;
import java.util.*;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num=-1;
		
		Scanner scan = new Scanner(System.in);
		
		num=scan.nextInt(); //���� �Է� 
		if(10<=num&&num<=99) {
			if(num%10==num/10)
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			else
				System.out.println("No, 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
	}
}
