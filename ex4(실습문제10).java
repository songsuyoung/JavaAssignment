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
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		cir_x=scan.nextInt();
		cir_y=scan.nextInt();
		radius=scan.nextInt();

		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		cir1_x=scan.nextInt();
		cir1_y=scan.nextInt();
		radius1=scan.nextInt();
		
		if(Math.sqrt(Math.pow(cir_x-cir1_x,2)+Math.pow(cir_y-cir1_y,2))<radius+radius1)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 겹치지 않는다.");
		
		//두 점 사이의 거리가 두 원의 반지름을 더한 값보다 작으면 두원은 서로 겹친다.
		
	}

}
