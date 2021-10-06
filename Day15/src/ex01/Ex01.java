package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		Dog dog = new Dog("������");
		Cat cat = new Cat("�ٴ�");
		
		cat.cry();
		dog.cry();
		
		cat.eat();
		dog.eat();
		
		dog.fishTail();
		cat.grooming();
		
		//���ɽ���
		Animal animal = new Dog("�˵���");
		animal.cry();
		animal.eat();
		
		Animal animal2 = new Cat("�ٴ�");
		animal2.cry();
		animal2.eat();
		
		cryAnimal(animal);
		cryAnimal(animal2);
		
		//���� �迭�� ���� ���� ������ �����Ѵ�. 
		
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			animals[i].eat();
			
			//������ ����ġ�� 
			// �ٿ��ɽ���
			if (animals[i] instanceof Dog) {
				
				Dog nu = (Dog) animals[i];
				nu.fishTail();
			}
			
			//����� �׷��
			if (animals[i] instanceof Cat) {
				Cat sea = (Cat) animals[i];
				sea.grooming();
				
			}
			
			
		
		}
		
		
		
	}
	//�Ķ���ͷ� ���� ������ ��� �Ѵ�. 
	
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}
	
}
