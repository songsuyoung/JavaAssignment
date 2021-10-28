import java.util.*;

class Word{
	private String Eng;
	private String Kor;
	
	Word(String Eng,String Kor){
		this.Eng=Eng;
		this.Kor=Kor;
	}
	
	String getEng() {
		return Eng;
	}
	String getKor() {
		return Kor;
	}
	
}
public class ex7_12 {
	
	public static int[] rand(int size,int testid) {
		int[] random=new int[4];
		Random r= new Random();
		
		for(int i=0;i<4;i++)
		{
			random[i]=r.nextInt(size);
			for(int j=0;j<i;j++) {
				if(random[i]==random[j])
					i--;
			}
		}
		int count=-1;
		for(int i=0;i<4;i++) {
			if(random[i]==testid)
				count++;
		}
		if(count==-1) {
			int i=r.nextInt(3);
			random[i]=testid;
		}
		
		return random;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Word> word=new Vector<Word>();
		word.add(new Word("bear","��"));
		word.add(new Word("painting","�׸�"));
		word.add(new Word("eye","��"));
		word.add(new Word("picture","�׸�"));
		word.add(new Word("society","��ȸ"));
		word.add(new Word("human","�ΰ�"));
		word.add(new Word("purchase","����"));
		
		
		System.out.println("\"��ǰ�ܾ�\"�� �ܾ��׽�Ʈ�� �����մϴ�. -1�� �Է��Ͻø� �����մϴ�.");
		System.out.println("���� "+word.size()+"���� �ܾ ��� �ֽ��ϴ�.");
		Scanner scan=new Scanner(System.in);
		int op=1;
		int[] random;
		int menuop=-1;
		while(true) {
		System.out.print("�ܾ� �׽�Ʈ:1 �ܾ� ����:2 ����:3>> ");
		
		menuop=scan.nextInt();
		
		if(menuop==2) {
			System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
			while(true) {
			String eng;
			String kor;
			
			System.out.print("���� �ѱ� �Է� >> ");
			eng=scan.next();
			if(eng.equals("�׸�"))
				break;
			kor=scan.next();
			
			word.add(new Word(eng,kor));
			}
		}
		if(menuop==3)
			break;
		
		if(menuop==1) {
			while(true) {
					
					int testid=(int)(Math.random()*word.size());
					Word test=word.get(testid);
					System.out.println(test.getEng()+"?");
					
					random=rand(word.size(),testid);
					
					System.out.print("(1)"+word.get(random[0]).getKor()+" (2)"+word.get(random[1]).getKor()+" (3)"+word.get(random[2]).getKor()+" (4)"+word.get(random[3]).getKor()+" :>");
					
					try {
						op=scan.nextInt();	
						if(op==-1)
							break;
		
					}catch(Exception e) {
						String temp=scan.next();
						System.out.println("���ڸ� �Է��ϼ��� !!");
					}
					if(word.get(testid).getKor().equals(word.get(random[op-1]).getKor()))
						System.out.println("Excellent !!");
					else {
						while(random[op-1]!=testid) {
							System.out.println("No. !!");
							System.out.println("fault?");
							System.out.print("(1)"+word.get(random[0]).getKor()+" (2)"+word.get(random[1]).getKor()+" (3)"+word.get(random[2]).getKor()+" (4)"+word.get(random[3]).getKor()+" :>");
							op=scan.nextInt();
						}
					}
					
				}
			}
		}
	}

}
