import java.io.*;
import java.util.*;

public class ex8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini")); // ���Ϸκ��� �б� ���� ����
			int lineNumber = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%4d", lineNumber++);
				System.out.println(": "+line);
			}
			fScanner.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}

}
