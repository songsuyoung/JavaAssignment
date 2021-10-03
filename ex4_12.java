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
		System.out.print("환율(1달러)>>");
		double rate=scan.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000));
		System.out.println("$100는 "+CurrencyConverter.toKWR(100)+"원입니다");
		scan.close();
	}

}
