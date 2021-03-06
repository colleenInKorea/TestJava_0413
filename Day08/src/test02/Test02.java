package test02;

public class Test02 {
	public static void main(String[] args) {
		
		
		
//		아래 배열은 5명의 10과목 시험 성적을 정리 해놓은 것이다.
//		이 배열을 이용해서 아래 문제를 풀어 보세요
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		각 학생의 평균을 각각 구해서 출력 하세요.
		for (int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//			System.out.println(sum/(double)scores[i].length);
			double result = getAverage(scores[i]);
			System.out.println("평균은 " + result);
			
			//이중으로 쓰지 않고 이중으로 쓸 친구를 함수로 빼서 사용한다. 
			
		}
		
//		각 학생의 최고 점수를 구해서 출력 하세요.
		
		for (int i = 0; i < scores.length; i++) {
			int max = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if(max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			System.out.println((i + 1) + "번째 학생의 최고점은 " + max);
		}
		
		
		
//		평균이 가장 높은 학생의 평균점수와 몇번째 학생인지 출력하세요.
//		평균은 소수점 첫째 자리 까지만 출력 하세요.
		 double max = 0;
		 int order= 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				average = sum / 10.0;
			}
			if(max < (average)) {
				max = average;
				order = i+1;
			}
		}
		System.out.println("평균이 가장 높은 학생의 평균은 " + max + ", "+ order + "번째이다.");
		
//		index 4번째 과목의 최고 성적의 학생이 몇번째 학생인지 출력 하세요.
		int[] forthSubjects = new int [5];
		max = 0;
		order =0;
		for (int i = 0; i < scores.length; i++) {
			forthSubjects[i] = scores[i][3];
			if(max < forthSubjects[i]) {
				max = forthSubjects[i];
				order = i + 1;
			}
		}
		System.out.println("4번째 과목의 최고성적자는 "+ order + "번째 학생");
		System.out.println("점수 : " + max);
		
//		시험과목 index 3 ~ 7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//		평균은 소수점 첫째 자리 까지만 출력 하세요.
		
		max = 0;
		order = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double average = 0;
			for (int j = 2; j < 7; j++) {
				sum += scores[i][j];
				average = sum / 10.0;
				
			}
			if(max < average) {
				max = average;
				order = i+1;
			}
		}
		
		System.out.println("평균이 가장 높은 학생의 평균은 " + max + ", "+ order + "번째이다.");
		
		
	}
	
	//학생의 점수 배열을 받아 평균값 정하기 
	public static double getAverage(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return(sum/(double)scores.length);
		
	}

}
