package test04;

public class OmrCardReader {
//	OmrCardReader Ŭ����
//	����ü ���� �� ���� 5���� �Է¹޾� ���� �迭�� �����صд�.
//	��OmrCard ��ü�� �޾Ƽ� ���� �迭�� OmrCard ī�� ��ü�� ����� ���Ͽ�, ������ ����ϼ��� (100�� ����)
	
	private String subjectName;
	private int[] answer = new int[5];
	
	//getter
	
	
	//setter
	public void subjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	//ä�� ���
	
	public int scoring(Omrcard omrcard) {
		int score = 100;
		for (int i = 0; i < this.answer.length; i++) {
			if(this.answer[i] != omrcard.getAnswer(i)) {
				score -= 20;
			}
		}
		return score;
		
	}
	
	
	
}
