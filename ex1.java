package example;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] num=new int[3]; //�迭�� �����ڸ� ���ؼ� �����Ҵ�
		
		System.out.print("���� 3�� �Է�>>");
		for(int i=0;i<num.length;i++)
			num[i]=scan.nextInt(); //�迭�� �Է¹ޱ� 
		
		Arrays.sort(num); //�迭���� �����Լ��� �̿��ؼ� ũ�� ������ ����
		System.out.print(num[num.length/2]); //���� �߰� ũ���� ���� ���
		
	}

}
