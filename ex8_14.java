import java.io.*;
import java.util.*;
public class ex8_14 {

	ex8_14(){
		File f=null;
		File fl[];
		Scanner sc;
		try {
			sc=new Scanner(System.in);
			f=new File("c:\\");
			System.out.println("***** ���� Ž�����Դϴ�. *****");
			while(true) {
				String nowD=f.getName();
				System.out.println("["+nowD+"]");
				fl=f.listFiles();
				for(int i=0;i<fl.length;i++) {
					String dir;
					if(fl[i].isDirectory()) dir="dir";
					else dir="file";
					
					System.out.println(dir+"\t"+fl[i].length()+"����Ʈ\t"+fl[i].getName());
				}
				System.out.print(">>");
				String line=sc.nextLine();
				StringTokenizer st=new StringTokenizer(line," ");
				String op=st.nextToken();
				
				if(op.equals("�׸�")) break;
				
				if(op.equals("..")) {
					if(f.getParent()==null) continue;
					else {
						f=new File(f.getParent());
					}
				}
				else {
					if(op.equals("rename")) {
						String v1,v2;
						try {
							v1=st.nextToken();
							v2=st.nextToken();
							File on=new File(f,v1);
							File rn=new File(f,v2);
							if(rn.exists()) {
								System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
							}
							else {
								on.renameTo(rn);
							}
							
						}catch(Exception e) {
							System.out.println("�ΰ��� ���ϸ��� �־����� �ʾҽ��ϴ�.");
						}
					}
					else if(op.equals("mkdir")) {
						try {
							String dname=st.nextToken();
							File newD=new File(f,dname);
							if(newD.exists()) System.out.println("�̹� �����ϴ� �����̳� ���丮�Դϴ�.");
							else {
								System.out.println(dname+" ���͸��� �����Ͽ����ϴ�.");
								newD.mkdir();
							}
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("������ ���丮 ���� �־����� �ʾҽ��ϴ�.");
						}						
					}
					else {
						if(new File(f,op).isDirectory()) {
							f=new File(f,op);
						}
						else {
							System.out.println("���丮�� �ƴմϴ�.");
						}
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ex8_14();
	}

}
