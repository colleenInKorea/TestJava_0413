package test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	 public static final Map<String, String> capitalMap = new HashMap<String, String>() {
	        {
	            put("���ѹα�", "����");
	            put("����ũ", "�����ϰ�");
	            put("����", "������");
	            put("���þ�", "��ũ��");
	            put("���⿡", "���");
	            put("�����", "���������");
	            put("������", "����Ȧ��");
	            put("������", "����");
	            put("������", "���帮��");
	            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
	            put("����Ʈ", "ī�̷�");
	            put("�̶�", "�����");
	            put("��Ż����", "�θ�");
	            put("�Ϻ�", "����");
	            put("�ʸ���", "���Ҷ�");
	            put("�ɶ���", "���Ű");
	            put("������", "�ĸ�");
	            put("��Ű", "��ī��");
	            put("ĳ����", "��Ÿ��");
	            put("�ݷҺ��", "����Ÿ");
	        }
	    };
	
	public static void main(String[] args) {
		
		Map<String, String> names = new HashMap<>();
		names.put("���缮", "X");
		names.put("�ڳ���", "X");
		names.put("������", "X");
		names.put("������", "X");
		names.put("�̱���", "X");
		
		System.out.println(names);
		
		Set<String> name = names.keySet();
		
		Iterator<String> iter = names.keySet().iterator();
		while (iter.hasNext()) {
			String naam = iter.next();
			if(naam.startsWith("��")) {
				names.put(naam, "O");
			}		
		}
		
		System.out.println(names);
		
		/*
		 *  �������� ���� ������ ���� �̸��� ���ߴ� ����
			����-������ ����ִ� 20���� ���� �־�����.
			�� �� �������� 5���� ������ �־�����, ����ڷκ��� ���� �ش��ϴ� ������ �Է� �޴´�.
			�������� �ƴ��� ������ �Է��� ��� ����Ѵ�.
			��� Ǯ�� ���� ����(100�� ����)�� ��µȴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
        // TODO: �����ϱ�
        
        int count = 0;
        for(int i = 0 ; i < 5; i++) {
        	int number = rand.nextInt(20);
        	System.out.println(keyList.get(number) + "�� ������ �̸��� ?");
        	String answer = scan.next();
        	
        	if(capitalMap.containsValue(answer)) {
        		System.out.println("����");
        		count += 20;
        	}else {
        		System.out.println("��");
        	}
        }
		
        System.out.println("��������  " + count );
	}

}
