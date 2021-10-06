package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//������ ���հ� ���� ģ�� = set
		//�ߺ��� ��� ���� �ʰ� ������ ���� �ٱ��� �Ǵ� �ָӴ϶�� ���� �ϸ� ����.
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(5);
		set1.add(15);
		
		System.out.println( set1);
		
		set1.add(10);
		System.out.println(set1);
		System.out.println(set1.add(19));
		if(!set1.add(10)) {
			System.out.println("�ߺ��Ǿ����ϴ�. ");
		}
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(40);
		set2.add(10);
		set2.add(5);
		set2.add(35);
		
		System.out.println(set2);
		//������
//		set1.retainAll(set2);
//		System.out.println(set1);
		//������
		set1.addAll(set2);
		System.out.println(set1);
		//����
		set1.remove(19);
		System.out.println(set1);
		
		//Ʈ����
		//������ �⺻�� ���̴�. �׷��� ������ ���� ���� ���� ����. 
		//������ �ؽ��� ���� �ӵ��鿡�� ���� ���� ���� �ִ�. 
		
		Set<Integer> set3 = new TreeSet<>();
		set3.add(1);
		set3.add(16);
		set3.add(4);
		set3.add(8);
		set3.add(12);
		
		System.out.println(set3);
		
		for(Integer number : set3) {
			System.out.print(number + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> iter = set2.iterator();
		while (iter.hasNext()) {
			Integer number = iter.next();
			System.out.print(number + " ");
			
		}
 	}

}
