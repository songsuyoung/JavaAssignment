package example;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		int num;
		num=scan.nextInt(); //정수형 입력받기
		
		int div=num/10;
		int mod=num%10;
		
		if(mod==3||mod==6||mod==9) {
			System.out.print("박수짝");
			if(div==3||div==6||div==9) {
				System.out.print("짝");
			}		
		}else {
			if(div==3||div==6||div==9) {
				System.out.print("박수짝");
			}
		}
	}
}
