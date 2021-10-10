package example;

abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
}
public class ex5_7 extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		
		double sum=0.;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex5_7 cal=new ex5_7();
		System.out.println(cal.add(2,3));
		System.out.println(cal.subtract(2,3));
		System.out.println(cal.average(new int[] {2,3,4}));
		
	}

}
