package ex01;

public class PersonInformation {
	//�̸� ������� ���� ����
	
	private String name;
	private String birth;
	private String gender;
	
	public PersonInformation () {
		System.out.println("����Ű�");
	}
	 public PersonInformation (String name, String birth, String gender) {
		this();
		
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		
		//�� ��ȿ�� �˻�
		if(gender.equals("����") || gender.equals("����")) {
			this.gender = gender;
		}else {
			System.out.println("������ �� �� �Է��Ͽ����ϴ�.");
		}
	}
	 public String getName() {
		return "Ms." + this.name;
		
	}
	 public String getBirth() {
		 return this.birth;
		 
	 }
	 public String getGender() {
		 return this.gender;
		 
	 }
	 
	 public void setName(String name) {
		this.name = name;
	}

}
