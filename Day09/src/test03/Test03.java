package test03;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		정수 문자열 변환
//		아래와 같이 생년 월일이 저장된 정수 변수가 있다.
//		해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요.
		
		int year = 2000;
		int month = 11;
		int day = 15;
		
		String numberToString = String.valueOf(year);
		
		System.out.println(numberToString + month + day);
		
//		아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력 하세요 (한국나이)
//		String gradString = "1995";
		String gradString = "1995";
		
		int stringToNumber = Integer.valueOf(gradString);
		System.out.println("1995의 올해 나이는 " + (2022-stringToNumber));
		
//		 개수 세기
//		 아래 배열에 물품 목록이 저장되어 있다.
		
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
		int count = 0;
		String keyword = scan.nextLine()
		
		for (int i = 0; i < goods.length; i++) {
			if(goods[i].equals(keyword) ) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
