package ex02;

public class Ex02 {
	public static void main(String[] args) {
		
		ScoreDate korean = new ScoreDate();
		
		korean.name = "����";
		korean.score = 95;
		korean.ranking =15;
		
		System.out.println(korean.name);
		System.out.println(korean.score);
		System.out.println(korean.ranking);
		
		ScoreDate[] dates = new ScoreDate[2];
		//���� 1
		dates[0] = new ScoreDate();
		//���� 2
		for (int i = 0; i < dates.length; i++) {
			dates[i] = new ScoreDate();
		}
		
		dates[0].name = "korean";
		dates[0].score = 95;
		dates[0].ranking = 10;
		
		dates[1].name = "math";
		dates[1].score = 99;
		dates[1].ranking = 1;
		
		//����3 
		//���� ������� ����ϴ� ����̴�. 
		ScoreDate english = new ScoreDate();
		english.name = "english";
		english.score = 90;
		english.ranking =12;
		
		dates[0] = english;
		
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i].name);
			System.out.println(dates[i].score);
			System.out.println(dates[i].ranking);
		}
		
		
	}

}