package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
//		반복문을 이용해서 A~Z 까지 출력하세요
//		for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++ ) {
//			System.out.print(alphabet + " ");
//		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(65+i) + " ");
		}
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 출력하세요.
//		단, 합이 100이 넘으면 합을 중단하고 그때 까지의 합을 출력하세요.
		System.out.print("수를 입력하시오: ");
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 0; i <= number; i++) {
			if(sum >= 100) {
				System.out.println(sum);
				break;
			}
			sum += i;
		}
		
//		1 4 7 10 13 16 19 22 25 ... 은
//		1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
//		이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여
//		등차(차이가 같다의 한문 말) 수열이라고 한다.
		
		System.out.println("세개의 수를 입력하시오. : ");
		int start = scan.nextInt();
		int term = scan.nextInt();
		int number1 = scan.nextInt();
		
		sum = start;
		for (int i = 0; i < number1; i++ ) {
			sum += term;	
		}
		System.out.println(sum);
		System.out.println();
		
//		4. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//
//		수를 입력 받고 그 수가 소수(prime)인지 아닌지 출력하세요.
		System.out.println("수를 입력하시오: ");
	    int prime = scan.nextInt();
	   
	    //플래그 사용 (불을 사용해서 출력하는 방법)
//	    boolean isPrimeNumber =true;
//	    for(int i = 2; i < prime ; i++) {
//	    	if(prime % i == 0) {
//	    		System.out.println("소수가 아닙니다.");
//	    		isPrimeNumber = false;
//	    		break;
//	    	}
//	    }
//		
//	    if(isPrimeNumber) {
//	    	System.out.println("소수이다.");
//	    }
		
	    //i 활용하기
		int i; 
		for(i = 2; i < Math.sqrt(prime); i++) {
			if(prime % i == 0) {
	    		System.out.println("소수가 아닙니다.");
//	    		isPrimeNumber = false;
	    		break;
	    	}
		}
		if (i == number) {
			System.out.println("소수이다.");
		}
	}

}
