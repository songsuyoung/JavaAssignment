package example;
import java.util.*;
public class ex5 {

	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����>>");
		String line = scan.nextLine(); //�������� �Է� �޾Ƽ� split �����Լ��� �̿��ؼ� " "�� �߽����� �ڸ���.
		String tmp[]=line.split(" ");
		
		num1=Integer.parseInt(tmp[0]); //�߶����� ������ 3��� �� ��� ���� op�̶�� �����Ͽ� �ۼ��Ͽ���.
		num2=Integer.parseInt(tmp[2]);
		
		switch(tmp[1]) {
		case "+":
			System.out.println(num1+"+"+num2+"�� ������� "+(num1+num2));
			break;
		case "-":
			System.out.println(num1+"-"+num2+"�� ������� "+(num1-num2));
			break;
		case "*":
			System.out.println(num1+"*"+num2+"�� ������� "+(num1*num2));
			break;
		case "/":
			if(num2!=0)
				System.out.println(num1+"/"+num2+"�� ������� "+(num1/num2));
			else
				System.out.println("0���� ������ �����ϴ�.");
			break;
		}
	}
}