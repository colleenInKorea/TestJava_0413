package test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//����Ʈ �����
		List<Integer> integerList = new ArrayList<>();
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
		//�ּڰ� ã��
		Integer element = integerList.get(0);
		for (int i = 1; i < integerList.size(); i++) {
			if(element > integerList.get(i)) {
				element = integerList.get(i);
			}
		}
		System.out.println(element);
		// �� �� ���ϱ� 
		Iterator<Integer> iter = integerList.iterator();
		
		int sum = 0;
		
		while(iter.hasNext()) {
			element = iter.next();
			sum += element;
		}
		System.out.println(sum);
		
		
		//¦���� ���� ���� 
		iter = integerList.iterator();
		while(iter.hasNext()) {
			element = iter.next();
			
			if(element % 2 == 0) {
				iter.remove();
			}
		}
		
		System.out.println(integerList);
		
	}

}
