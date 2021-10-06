package ex02;

public class PersonInfor {
	private String name;
	private int age;
	
	public PersonInfor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String result = this.name +" �� " + this.age +" �� �Դϴ�.";
		return result;
	}
	
	public boolean equals(Object obj) {
		PersonInfor person = (PersonInfor)obj;
		//�̸��� ���� ���̰� ������ ���� ������� �ν�
		
		if(this.age == person.age && this.name.equals(person.name)) {
			return true;
		}
		return false;
	}
	
}
