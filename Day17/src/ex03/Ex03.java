package ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03 {
	
	public static void main(String[] args) {
		//�����̸� ����Ʈ
		List<String> fruits = new ArrayList<>();
		fruits.add("apfel");
		fruits.add("anana");
		fruits.add("banana");
		
		//�ݺ������� �����̸������ϱ� 
		//�ε��� ���
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i)+ " ");
			
			String elements = fruits.get(i);
			if (elements.startsWith("b")) {
				fruits.remove(i);
			}
		}
		System.out.println();
		
		//���� for�� : for each / for in
		
		for (String element : fruits) {
			System.out.print(element + " ");
			if (element.startsWith("b")) {
				fruits.remove(element);
			}
		}
		System.out.println();
		
		//Iterator
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.print(element + " ");
			if (element.startsWith("b")) {
				fruits.remove(element);
			}
			
		}
		System.out.println();
		
	}

}
