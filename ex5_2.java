package example;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}
class Student extends Person{
	void set() {
		age=30; //java���� default�� public
		name="ȫ�浿";
		height=175;
		//weight�� ��� ������. Person�� ���� �Ӽ�
		setWeight(99); //set�Լ� �̿��ؼ� ����
	}
}
public class ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.set();
		
	}

}
