package ddit.chap07.sec02;
//����) �θ�Ŭ���� - ���Ŭ����(Person)
//		�Ӽ� : �̸�(name), ����(age)
//		�ż��� : ������ �� �̸��� ����ϴ� �޼���(getName())

public class Person {
	String name;
	int age;
	
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getName(){
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
}
