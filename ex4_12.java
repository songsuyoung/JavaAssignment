package example;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate=r;
	}
}
public class ex4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>>");
		double rate=scan.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $"+CurrencyConverter.toDollar(1000000));
		System.out.println("$100�� "+CurrencyConverter.toKWR(100)+"���Դϴ�");
		scan.close();
	}

}
