package ddit.chap07.sec06;

public class BookExample {

	public static void main(String[] args) {
		//상속 되는 클래스 아님
		Book book = new Book();
		Book book1 = new Book("해저 2만리","계림출판사");
		
		 Book b = new Novel("해저 2만리","계림출판사","SF공상과학");
	     Book c = new MajorBook("Operating System Concepts 6/E", "JOHN WILEY & SONS INC",
	                               "Computer Science",15000);
	     //호출 가능 Novel -> getBookInfo() 호출
	     b.getBookInfo();
	     System.out.println("소유자 : "+b.owner);
	     //똑같은 이름 변수는 무조건 부모 클래스에 있는 거 호출(변수는 override 대상 아님-메소드만 다형성 적용)
	     
	     //자식 클래스 MajorBook getBookInfo() 호출
	     c.getBookInfo(); 
	     System.out.println("소유자 : "+c.owner); 

	     //자식 클래스 변수 가져오기
	     //객체 변수명 instanceof 객체 타입(클래스명)
	     if (b instanceof Novel) {
	       Novel n=(Novel) b;   					//downcast => 자식 클래스에게 고유하게 정의된 메소드나 변수 사용
	       System.out.println("소유자 : "+n.owner);	//이순신
	     } 

	     //cast 될 수 있는지 판단해줌
	     if (c instanceof MajorBook) {
	       MajorBook mb=(MajorBook) c;				//downcast => (MajorBook) b => 자식끼리는 모름
	       System.out.println("소유자 : "+mb.owner);
	     }
	}

}
