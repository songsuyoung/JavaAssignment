import java.io.*;
import java.util.*;

public class ex8_12 {

	ex8_12(){
		FileReader fr=null;
		Vector<String> v;
		Scanner fsc,sc;
		try {
			sc=new Scanner(System.in);
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("��� ���ϸ� �Է�>> ");
			String fileN=sc.next();
			
			fr=new FileReader(new File(fileN));
			v=new Vector<String>();
			fsc=new Scanner(fr);
			String line="";
			while(fsc.hasNext()) {
				line=fsc.nextLine();
				v.add(line);
			}
			
			while(true) {			
				System.out.print("�˻��� �ܾ ����>> ");
				String findN=sc.next();
				boolean find=false;
				if(findN.equals("�׸�")) break;
				for(int i=0;i<v.size();i++) {
					String temp=v.get(i);
					if(temp.indexOf(findN)!=-1) {
						find=true;
						System.out.println(i+": "+temp);
					}
				}
				if(!find) System.out.println("�߰��� �� ����.");
			}
			System.out.println("���α׷��� �����մϴ�.");
			sc.close();
			fr.close();
			fsc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
 	public static void main(String[] args) {
		new ex8_12();
	}
}