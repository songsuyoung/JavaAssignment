import java.io.*;
public class ex8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\");
		File [] files = file.listFiles();
		
		long bigSize = 0;
		File bigFile =null;
		for(int i=0; i<files.length; i++) {
			File f = files[i];
			if(!f.isFile())
				continue;
			
			long size = f.length();
			if(bigSize < size) {
				bigSize = size;
				bigFile = f;
			}
		}

		if(bigFile == null) 
			System.out.println("파일은 없습니다");
		else
			System.out.println("가장 큰 파일은 " + bigFile.getPath() + " " + bigSize + "바이트");
	}

}
