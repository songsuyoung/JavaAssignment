import java.io.*;
import java.util.*;

public class ex8_6 {

	public static void main(String[] args) {
		FileInputStream f1,f2;
		FileOutputStream f3;
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		s1=sc.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		s2=sc.next();
		try {
			f1=new FileInputStream(s1);
			f2=new FileInputStream(s2);
			f3=new FileOutputStream(new File("appended.txt"));
			
			byte buff[]=new byte[1024];
			while(true) {
				int n=f1.read(buff);
				f3.write(buff,0,buff.length);
				if(n<buff.length) break;
			}
			while(true) {
				int n=f2.read(buff);
				f3.write(buff,0,buff.length);
				if(n<buff.length) break;
			}
			
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����߽��ϴ�.");
			f1.close();
			f2.close();
			f3.close();
			
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
