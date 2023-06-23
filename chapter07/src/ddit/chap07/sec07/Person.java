package ddit.chap07.sec07;

public class Person {
	String name;
	int age;
	//사용자가 정의 안하면 생성자 메소드 없으면 기본 생성자 삽입(매개변수X, 중괄호 내 코드X)
	//하나라도 정의하면 안 만듦
	public void speak() {
		System.out.println("말소리를 내다.");
	}
}

class Dancer extends Person {
	int career;
	
	//이거 없으면 컴파일러가 기본 생성자 만들어줌 Dancer(){super();}
	Dancer(int career){
		super(); 
		//다른 모든 명령에 앞서서 기술 (this처럼)
		//부모 생성자 메소드부터 호출 - 아니면 부모 생성자 만들 방법 없음
		this.career = career;
	}
	
	public void dance() {
		System.out.println("춤을 추다");
	}
}
