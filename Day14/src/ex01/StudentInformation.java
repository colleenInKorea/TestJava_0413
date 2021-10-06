package ex01;

public class StudentInformation extends PersonInformation {
	
	private String school;
	
//	public StudentInformation() {
//		System.out.println("�л�����");
//	}
	
	public StudentInformation (String name, String birth, String school) {
		super(name, birth);
		this.school = school;
	}
	
	//�żҵ� ������ 
	@Override
	public void greeting() {
		System.out.println("�ȳ��ϼ���. ���� " + this.school + "���л� " + this.getName() + "�Դϴ�.");
	}
	
	//�θ�żҵ� ���� �ڽ� �żҵ尡 �� ����. 
	// �������� ���� �ڽ� Ŭ������ �θ�Ŭ������ �����ϴ������̶�� ���� �ϸ� �ȴ�. 
	
	public String getSchool() {
		return this.school;
	}
	
}
