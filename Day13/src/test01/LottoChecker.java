package test01;

import java.util.Arrays;
import java.util.Random;

public class LottoChecker {
	
	private int[] realLottoNumber = new int [6];
	
// �ζ� �������� ���ڸ� �̴� �Ϳ� ���� ������ ���� ������ ���� �Ѵ�. 
	Random rand = new Random();
	
	private boolean checkDuplicate (int count) {
		for (int i = 0; i < realLottoNumber.length; i++) {
			if (count == realLottoNumber[i]) {
				return true;
			}
		}
		return false;
	}
	
	public void randomLottoNumber() {
		for (int i = 0; i < 6; i++) {
		    int randomNumber = rand.nextInt(45)+ 1;
		   if(this.checkDuplicate(randomNumber)) {
			   i--;
			   continue;
		   }
		   this.realLottoNumber[i] = randomNumber ;
		}
		System.out.println(Arrays.toString(realLottoNumber));

	}
	
	//���� ���� ���ڿ� LottoŬ������ ���� ���ڸ� ���ؼ� ��� �´� �� Ȯ���Ѵ�. 
	public void lottoChecker(Lotto lottoNumber) {
		
		int count = 0;
		for (int i = 0; i < this.realLottoNumber.length; i++) {
			for (int j = i+1; j < realLottoNumber.length; j++) {
				if(realLottoNumber[i] == lottoNumber.getLottoNumber(j)) {
					count++;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("1��");
			
		}else if(count == 5) {
			System.out.println("2��");
			
		}else if (count ==4) {
			System.out.println("3��");
			
		}else if (count == 3) {
			System.out.println("4��");
		}else if (count == 2) {
			System.out.println("5��");
		}else {
			System.out.println("��");
		}
		
		
	}
	

}
