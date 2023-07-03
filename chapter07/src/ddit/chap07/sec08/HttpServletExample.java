package ddit.chap07.sec08;

public class HttpServletExample {
	public static void main(String[] args) {
		init(new LoginServlet());
		//HttpServlet servlet = new LoginServlet();
		//  => 추상클래스(HttpServlet) 객체 불가능임(=>new연산자 없음) => 기억장소에 타입만 선언한 거
		//인터페이스/추상클래스 => upcast 되어진 것
		//upcast하고 메소드 호출 => 재정의 하지 않는 이상 자식 고유 메소드 안되고 부모 메소드/변수만 가능
		//자식 클래스 생성 => 부모 클래스 타입으로 저장 => 얘가 참조하는 거 부모 것만
		//자식이 overring 해서 재정의할 때만 자식 거 실행할 수 있음 => 다형성
		init(new FileDownLoadServlet());
	}
	
	public static void init(HttpServlet servlet) {
		servlet.service(); //추상메서드로 정의해놓은 것
	}
}
