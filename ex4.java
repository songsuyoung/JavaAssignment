package example;
import java.util.*;
import java.lang.*;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int cir_x;
		int cir_y;
		int radius;
		int cir1_x;
		int cir1_y;
		int radius1;
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		cir_x=scan.nextInt();
		cir_y=scan.nextInt();
		radius=scan.nextInt();

		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		cir1_x=scan.nextInt();
		cir1_y=scan.nextInt();
		radius1=scan.nextInt();
		
		if(Math.sqrt(Math.pow(cir_x-cir1_x,2)+Math.pow(cir_y-cir1_y,2))<radius+radius1)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ��ġ�� �ʴ´�.");
		
		//�� �� ������ �Ÿ��� �� ���� �������� ���� ������ ������ �ο��� ���� ��ģ��.
		
	}

}
