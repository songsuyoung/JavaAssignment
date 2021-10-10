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
		age=30; //java에서 default는 public
		name="홍길동";
		height=175;
		//weight의 경우 오류남. Person의 고유 속성
		setWeight(99); //set함수 이용해서 설정
	}
}
public class ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.set();
		
	}

}
