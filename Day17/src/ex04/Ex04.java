package ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(30);
		numbers.add(65);
		numbers.add(120);
		numbers.add(89);
		numbers.add(12);
		
		//�� ã�� 
		if (numbers.contains(30)) {
			System.out.println("�����մϴ�. ");
		}
		
		//����
		// ���� ��Ʈ, ��������, ���� ����, �� ��Ʈ .........
		//�����غ��� ���� ���� �ڵ�
		
		//���� �� ���� ���ʷ� 
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
		//�� ������, ū�� ���� ������ ������
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		numbers.clear();
		if (numbers.isEmpty()) {
			System.out.println("���� �Է��Ͻÿ�");
		}
	}

}
