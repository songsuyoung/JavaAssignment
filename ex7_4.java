import java.util.*;

public class ex7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> precipitation=new Vector<Integer>();
		Scanner scan=new Scanner(System.in);
		int total=0;
		int input;
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			input=scan.nextInt();
			if(input==0)
				break;
			precipitation.add(input);
			
			for(int i=0;i<precipitation.size();i++)
			{
				System.out.print(precipitation.get(i)+" ");
				total+=precipitation.get(i);
			}
			System.out.println();
			System.out.println("현재 평균 "+total/precipitation.size());
			total=0;
		}
		
		scan.close();
	}

}
