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
		int op=1;
		int[] random;
		int menuop=-1;
		while(true) {
		System.out.print("단어 테스트:1 단어 삽입:2 종료:3>> ");
		
		menuop=scan.nextInt();
		
		if(menuop==2) {
			System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
			while(true) {
			String eng;
			String kor;
			
			System.out.print("영어 한글 입력 >> ");
			eng=scan.next();
			if(eng.equals("그만"))
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
						System.out.println("숫자를 입력하세요 !!");
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
