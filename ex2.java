package example;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scan = new Scanner(System.in);
		int num;
		num=scan.nextInt(); //������ �Է¹ޱ�
		
		int div=num/10;
		int mod=num%10;
		
		if(mod==3||mod==6||mod==9) {
			System.out.print("�ڼ�¦");
			if(div==3||div==6||div==9) {
				System.out.print("¦");
			}		
		}else {
			if(div==3||div==6||div==9) {
				System.out.print("�ڼ�¦");
			}
		}
	}
}
