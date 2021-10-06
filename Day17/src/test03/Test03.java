package test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
//		 id �ߺ� üũ
//		 �Ʒ��� ���� ȸ�� ���Ե� id ����� �־�����.
//		 ["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		 id �� �Է� �ް�, id �� �ߺ� �ɰ�� "�ߺ��Դϴ�", �ߺ��� ���� ���� ��� "��밡��" �� ��� �ϼ���.
		 
		List<String> idList = new ArrayList<>();
		idList.add("hagulu");
		idList.add("happy");
		idList.add("google");
		idList.add("bts");
		idList.add("iu");
		idList.add("cuteboy");
		
		System.out.println(idList);
		
		String id = scan.next();
		
//		for (int i = 0; i < idList.size(); i++) {
//			if(id.equals(idList.get(i))) {
//				System.out.println("�ߺ��Դϴ�. ");
//			}
//		}
		
		if (idList.contains(id)) {
			System.out.println("�ߺ��Դϴ�.");
		}
		
//		ü�� ��� ��� ����
//		ü�� ��⿡�� �Ʒ��� ���� �ɻ����� ������ ���� �Ǿ����ϴ�.
//		�ְ����� �������� ������ ������ ������ ����� ���ϼ���.
//		for������ ������ ��
		
		List<Integer> countList = new ArrayList<>();
		countList.add(8);
		countList.add(7);
		countList.add(6);
		countList.add(10);
		countList.add(9);
		countList.add(4);
		
		countList.sort(Comparator.naturalOrder());
		countList.remove(5);
		countList.remove(0);
		
		int sum = 0;
		
		Iterator<Integer> iter = countList.iterator();
		while(iter.hasNext()) {
			int score = iter.next();
			sum += score;
		}
		
//		int sum = 0;
//		for (int i = 0; i < countList.size(); i++) {
//			sum += countList.get(i);
//		}
		System.out.println("�ְ����� �������� ������ ����� "+ (sum /(double)countList.size()));
		
//		�ζ� ��ȣ
//		Random Ŭ������ �̿��ؼ� 1~45 ������ 6���� �ߺ� ���� �ʴ� ���ڸ� ����Ʈ�� ���� �ϼ���.
//		����� ���ڸ� ���� �������� �����ؼ� ��� �ϼ���.
		
		List<Integer> lottoNumberList = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			int randomNumber = rand.nextInt(45)+ 1;
			if(lottoNumberList.contains(randomNumber)) {
				   i--;
				   continue;
			   }
			lottoNumberList.add(randomNumber); 
		}
		
		lottoNumberList.sort(Comparator.naturalOrder());
		System.out.println(lottoNumberList);
		
//		ȸ�� �߰��ϱ�
//		ȸ������ ����Ʈ�� �����.
//
//		[���, ����, ���, ����, �κ�]
//		���� �Է��� �̸��� ���� ����Ʈ�� �߰��Ѵ�.
//		���� ���������� ���� ��� ȸ���� �ڿ� ���ڸ� ���δ�.
//		(���� �Է��� �̸����� �ٸ� ����Ʈ�� �־�ΰ� �����ϱ�)
		
		List<String> nameList = new ArrayList<>();
		nameList.add("���");
		nameList.add("����");
		nameList.add("���");
		nameList.add("����");
		nameList.add("�κ�");
		
		List<String> newMembers = new ArrayList<>();
		newMembers.add("����Ű");
		newMembers.add("����");
		newMembers.add("����");
		newMembers.add("�κ�");
		newMembers.add("����");
		
		for (int i = 0; i < newMembers.size(); i++) {
			String newMember = newMembers.get(i);
			int count = 1;
			while(nameList.contains(newMember)) {
				newMember = newMembers.get(i) + count;
				count++;
			}
			nameList.add(newMember);
		}
 		
		System.out.println(nameList);
		
	}
	
	

}
