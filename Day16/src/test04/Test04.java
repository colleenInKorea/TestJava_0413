package test04;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntertainerApplicant me = new EntertainerApplicant("�̵���", "19950608", "���ͽ��Ǿ� - ���̾�", "anne-marie");
		JypEntertainment jyp = new JypEntertainment();
		
		
		jyp.findOutSinger(me);
		jyp.findOutActor(me);
		

	}

}
