package ex01;

public class PersonInformation {
	
	protected String name;
	protected String birth;
	
//	public PersonInformation() {
//		System.out.println("��������");
//	}
	
	public PersonInformation (String name, String birth) {
		this.name = name;
		this.birth = birth;

	}
	
	public String getName() {
		return name;
	}
	
	public void greeting() {
		System.out.println("�ȳ��ϼ��� ���� " + this.name +" �Դϴ�. ");
	}

}
