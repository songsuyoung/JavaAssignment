package example;

import java.util.*;
//2-14
public class two_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String course[]= {"java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		
		Scanner scan = new Scanner(System.in);
		String name;
		int n=-1;
		while(true) {

			System.out.print("���� �̸�>>");
			name=scan.next();
			
			for(int i=0;i<course.length;i++)
				if(course[i].equals(name)) {
					n=i;
				}
			if(n!=-1) {
				System.out.println(course[n]+"�� ������"+score[n]);
				n=-1;
			}else
				System.out.println("���� �����Դϴ�.");
			
			if(name.equals("�׸�"))
				break;
		}
		
		scan.close();
	}

}
