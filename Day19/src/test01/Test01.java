package test01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> grad = new HashMap<>();
		
		grad.put("����", 90);
		grad.put("����", 85);
		grad.put("����", 90);
		grad.put("��ȸ", 80);
		grad.put("����", 100);
		
		System.out.println(grad);
		
		grad.put("��ȸ", 85);
		
		System.out.println(grad);
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("��ȸ �� ������� �Է��Ͻÿ� : ");
		String subject = scan.next();
		
		if(grad.containsKey(subject)) {
			System.out.println(subject + " : " + grad.get(subject));
		}else {
			System.out.println("�ڷ� ����");
		}
	
		Set<String> keys = grad.keySet();
		Set<String> subjects = new HashSet<>();
		
		Iterator<String> iter = grad.keySet().iterator();
		while (iter.hasNext()) {
			String  key = iter.next();
			
			if(grad.get(key) >= 90) {
				subjects.add(key);
			}
		}
		
		System.out.println( subjects);
		
		if(grad.containsValue(100)) {
			System.out.println("���󰡴�");
		}
	
	}

}
