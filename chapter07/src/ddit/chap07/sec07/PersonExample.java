package ddit.chap07.sec07;

public class PersonExample {

	public static void main(String[] args) {
		Person p = new Dancer(5);  //다형성
		p.speak();  //override 안됐으니까 부모클래스 메서드만 호출됨=>말소리를 내다.
		//p.dance(); - 오류! 업캐스팅 조회 X
	}

}
