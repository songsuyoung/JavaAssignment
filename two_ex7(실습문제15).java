package example;
import java.util.*;
public class ex7 { //Multiply 클래스 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n=scan.nextInt();
				int m=scan.nextInt();
				System.out.println(m+"*"+n+"="+m*n);
				break; //정수가 다 입력 되면 멈추라는 프로그램이였나봄.
			}catch(Exception e){
				System.out.println("실수는 입력하면 안됩니다.");
				scan.nextLine();
				// 실수 입력을 받았을시 그 값을 없애야함. 
				//그렇기 때문에 scan nextLine을 통해서 비워준다.
			}
		}
		scan.close();
	}
}
