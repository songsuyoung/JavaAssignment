import java.io.*;
import java.util.*;

public class ex8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini")); // 파일로부터 읽기 위한 목적
			int lineNumber = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%4d", lineNumber++);
				System.out.println(": "+line);
			}
			fScanner.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}

}
