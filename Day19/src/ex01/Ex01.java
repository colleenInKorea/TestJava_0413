package ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		//Hash ��  �ǹ� 
		/* Ư���� ���� Hash function�� �̿��ϸ� 16������ �ߺ� ���� �ʴ� ���� ��ȯ�Ѵ�.
		 * ������ ���ϰ� ���� ������ ã�� ��쿡 ���� �̿��Ҽ� �ִ�. 
		 * *hashing�� ���ؼ��� ���� �� ���� �ϴ� ���� �� ����. 
		 */
		
		//����
		Map<String, String> ids = new HashMap<>();
		
		ids.put("hagulu", "���α�");
		ids.put("yu", "���缮");
		
		System.out.println(ids);
		
		//�ϳ��ϳ� �� ��������
		System.out.println(ids.get("hagulu"));
		
		//�� �ٲٱ�
		ids.put("yu", "�ڸ��");
		System.out.println(ids.get("yu"));
		
		//Ű ���� ���� Ȯ��
		if(ids.containsKey("yu")) {
			System.out.println(ids.get("yu"));
		}
		
		//value ���� ���� �ϴ� �� Ȯ�� 
		if(ids.containsValue("���α�")) {
			System.out.println(" ���� �մϴ�. ");
		}
		
		//�� �߰� 
		//�ٸ� �ʿ� �ִ� ��� �� �߰� 
		Map<String, String> newMap = new HashMap<>();
		newMap.put("lee", "��ȿ��");
		newMap.put("rain", "������");
		
		ids.putAll(newMap);
		
		System.out.println(ids);
		
		//�� ����� 
		ids.remove("hagulu");
		System.out.println(ids);
		
		//�ݺ����� ���� ����
		//��� Ű ���� ���� .
		 Set<String> keys = ids.keySet();
		 
		 
		 //���� for��
		 for (String id : keys) {
			System.out.println(id + " : " + ids.get(id));
		}
		 
		 //Iterator
		 Iterator<String> iter = ids.keySet().iterator();
		 while (iter.hasNext()) {
			String id =  iter.next();
			
			System.out.println(id + " : " + ids.get(id));
		}
		
		
	
	}

}
