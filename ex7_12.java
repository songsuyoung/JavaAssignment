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
		Word test;
		int testid;
		int op=1;
		int[] random=new int[4];
		while(true) {
			testid=(int)(Math.random()*word.size());
			test=word.get(testid);
			System.out.println(test.getEng()+"?");
			
			int count=0;
			for(int i=0;i<4;i++)
			{
				int ran=(int)(Math.random()*word.size());
				
				if(testid==ran) {
					ran=testid;
					count=0;
				}
				random[i]=ran;	
			}
			if(count==0) {
				int ran=(int)(Math.random()*word.size());
				random[ran]=testid;
			}
			System.out.println("(1)"+word.get(random[0]).getKor()+" (2)"+word.get(random[1]).getKor()+" (3)"+word.get(random[2]).getKor()+" (4)"+word.get(random[3]).getKor());
			
			try {
				op=scan.nextInt();
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���!!");
			}
			if(op==-1)
				break;	
		}
		}

}
