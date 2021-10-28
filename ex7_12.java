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
		word.add(new Word("bear","곰"));
		word.add(new Word("painting","그림"));
		word.add(new Word("eye","눈"));
		word.add(new Word("picture","그림"));
		word.add(new Word("society","사회"));
		word.add(new Word("human","인간"));
		word.add(new Word("purchase","구매"));

		
		System.out.println("\"명품단어\"의 단어테스트를 시작합니다. -1을 입력하시면 종료합니다.");
		System.out.println("현재 "+word.size()+"개의 단어가 들어 있습니다.");
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
				System.out.println("숫자를 입력하세요!!");
			}
			if(op==-1)
				break;	
		}
		}

}
