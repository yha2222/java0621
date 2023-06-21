package ddit.chap07.sec02;
//문제) 부모클래스 - 사람클래스(Person)
//		속성 : 이름(name), 나이(age)
//		매서드 : 생성자 및 이름을 출력하는 메서드(getName())

public class Person {
	String name;
	int age;
	
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getName(){
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
