package test02;

public class StudentInformation {
	
	private String name;
	private String university;
	private String phoneNumber;
	private String lesson;
	
	public StudentInformation (String name, String university, String phoneNumber, String lesson) {
		
		this.name = name;
		this.university = university;
		this.phoneNumber = phoneNumber;
		this.lesson = lesson;
		
		
	}
	
	public void getLessonInformation() {
		System.out.println(this.name + "���� " + this.phoneNumber + " �������� �޼����� �����մϴ�. ");
	}
	public void sendMessage(String message) {
		System.out.println(this.name + "���� ( " + this.phoneNumber + " ) " + message +"��� �����մϴ�. ");
	}
	

	public String getName() {
		return this.name;
	}
	public String getUniversity() {
		return this.university;
	}
	
	public void setUniversity(String university) {
		this.university = university;
		System.out.println(getName() + "����  �б��� " + getUniversity() + "�� ����Ǿ����ϴ�.");
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getLesson() {
		return this.lesson;
	}
	

	
	
	
	
	
}
