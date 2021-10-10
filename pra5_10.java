package example;

abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key,String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{

	static int count=0;
	static int valuecount=0;
	Dictionary(int x){
		keyArray=new String[x];
		valueArray=new String[x];
	}
	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
			if(keyArray[i].equals(key))
				return valueArray[i];
		return null;
	}

	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
			if(keyArray[i].equals(key)) {
				valueArray[i]=value;
				return;
			}
		
		keyArray[count]=key;
		valueArray[count]=value;
		count++;
	}

	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<count;i++)
			if(keyArray[i].equals(key))
			{
				for(int j=0;j<count-1;j++)
				{
					keyArray[j]=keyArray[j+1];
					valueArray[j]=valueArray[j+1];
				}
				count--;
				return null;
			}
		return "����";
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return count;
	}
	
}
public class pra5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dictionary dic=new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}

}
