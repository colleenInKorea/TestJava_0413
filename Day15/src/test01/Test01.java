package test01;

import ex01.Cat;
import ex01.Dog;

public class Test01 {
	public static void main(String[] args) {
//		�Ʒ��� ���� Ư���� ������ ���� ����� Class �� ���� �ϼ���.
//		���� ���̸� "�ȳ�" �ϰ� �԰�, "�۸�" �ϰ� ���, "���� ������" ���� ���⸦ �մϴ�.
//		����̴� ���̸� "�ȳ�" �ϰ� �԰�, "�߿�" �ϸ� ���, "��¦��¦" �׷���� �մϴ�.
//		��, Animal �̶�� Class �� �θ�� ������ Animal Class �� ���� Class �� ���� �ϼ���.
//		Animal �迭�� ��ü�� ��Ƽ� ��ĳ����, �ٿ�ĳ������ ����ؼ� �Ʒ��� ���� ��� �ϼ���.
		
		 Animal[] animals = new Animal[2];
		 animals[0] = new test01.Cat("����");
		 animals[1] = new test01.Dog("�����");
		   
		   for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			animals[i].eat();
			
			//������ ����ġ�� 
			// �ٿ��ɽ���
			if (animals[i] instanceof test01.Dog) {
				test01.Dog white = (test01.Dog)animals[i];				
				white.wagsItsTail();
			}
			
			//����� �׷��
			if (animals[i] instanceof test01.Cat) {
				test01.Cat butterfly = (test01.Cat) animals[i];
				butterfly.grooming();
			
				
			}
		}
		 

		
		
	}
}
