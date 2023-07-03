package ddit.chap07.sec02;
// (Person)
//	(name), (age)
//		(getName())

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
