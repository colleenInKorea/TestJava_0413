package test01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
//	�ζ� ��ȣ�� �������� �޾Ƽ� �����Ѵ�.
//	�ζ� ��ȣ�� �ڵ����� �����ؼ� ���� �Ѵ�
	 
	//��ȣ
	private int[] lottoNumber ;
	
	public Lotto() {
		lottoNumber = new int[6];
	}
	
	//����
	public void manual(int number1, int number2, int number3, int number4, int number5, int number6 ) {
		lottoNumber[0] = number1;
		lottoNumber[1] = number2;
		lottoNumber[2] = number3;
		lottoNumber[3] = number4;
		lottoNumber[4] = number5;
		lottoNumber[5] = number6;
	}
	
	//�ڵ�
	public int getLottoNumber(int number) {
		return lottoNumber[number];
	} 
	
	Random rand = new Random();
	//Ư�� ���ڰ� �ٸ� ���ڿ� �ߺ� ���� �Ǻ�
	private boolean checkDuplicate (int number) {
		for (int i = 0; i < lottoNumber.length; i++) {
			if (number == lottoNumber[i]) {
				return true;
			}
		}
		return false;
	}
	// ���� �ڵ����� ���ڸ� �̾� ����. 
	public void randomLottoNumber() {
		for (int i = 0; i < 6; i++) {
		    int randomNumber = rand.nextInt(45)+ 1;
		   if(this.checkDuplicate(randomNumber)) {
			   i--;
			   continue;
		   }
		   this.lottoNumber[i] = randomNumber ;
		}
		System.out.println(Arrays.toString(lottoNumber));

	}
	
}
