package test04;

public class Omrcard {
//	OmrCard Ŭ����
//	�������� ������ ������ 1~5�����̴�.
//	������ ������ �� 5���̴�.
//	���й��� �̸��� �Է� �޴´�.
//	��������� ������ �Է¹޴� �޼ҵ带 �����.
	
	private String name ; 
	private String studentId;
	private int[] answer = new int [5];
	
	public Omrcard(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	public String getName() {
		return "�̸� : " + name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getStudentId() {
		return "�й� : " + studentId;
	}
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
//	
//	public int[] getAnswer() {
//		return  this.answer;
//	}
	
	public int getAnswer (int number) {
		return this.answer[number] ;
				
		}

	public void setAnswer(int number, int answer) {
		if(number < 0 || number > 5) {
			System.out.println("������ ������ ���� �ʽ��ϴ�. ");
			return;
		}
		if(answer < 1 || answer > 5) {
			System.out.println("������ ������ ���� �ʽ��ϴ�. ");
			return;
		}
		this.answer[number] = answer;
		
	}
	
	

}
