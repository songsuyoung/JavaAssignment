package example;
import java.util.*;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num=-1;
		
		Scanner scan = new Scanner(System.in);
		
		num=scan.nextInt(); //정수 입력 
		if(10<=num&&num<=99) {
			if(num%10==num/10)
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("No, 10의 자리와 1의 자리가 다릅니다.");
		}
	}
}
