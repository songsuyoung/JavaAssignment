package example;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] num=new int[3]; //배열을 생성자를 통해서 동적할당
		
		System.out.print("정수 3개 입력>>");
		for(int i=0;i<num.length;i++)
			num[i]=scan.nextInt(); //배열에 입력받기 
		
		Arrays.sort(num); //배열정렬 내장함수를 이용해서 크기 순으로 정렬
		System.out.print(num[num.length/2]); //가장 중간 크기의 수를 출력
		
	}

}
