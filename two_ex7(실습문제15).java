package example;
import java.util.*;
public class ex7 { //Multiply Ŭ���� �ۼ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n=scan.nextInt();
				int m=scan.nextInt();
				System.out.println(m+"*"+n+"="+m*n);
				break; //������ �� �Է� �Ǹ� ���߶�� ���α׷��̿�����.
			}catch(Exception e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scan.nextLine();
				// �Ǽ� �Է��� �޾����� �� ���� ���־���. 
				//�׷��� ������ scan nextLine�� ���ؼ� ����ش�.
			}
		}
		scan.close();
	}
}
