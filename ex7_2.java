import java.util.*;
public class ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> grade = new ArrayList<Character>();
		double total=0.;
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		Scanner scan=new Scanner(System.in);
		char input;
		for(int i=0;i<6;i++) {
			grade.add(scan.next().charAt(0));
		}
		
		for(char store:grade)
		{
			if(store=='A')
				total+=4.0;
			else if(store=='B')
				total+=3.0;
			else if(store=='C')
				total+=2.0;
			else if(store=='D')
				total+=1.0;
			else
				total+=0.0;
		}
		System.out.println(total/6.0);
	}
}

	