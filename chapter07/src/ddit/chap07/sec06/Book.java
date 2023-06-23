package ddit.chap07.sec06;

public class Book {
	//public 아니어도 상관은 없음
	public String title;
    public String publisher; 
    public String owner="홍길동"; 
    
    Book(){ }
    //new 연산자에 의해서 기술한 생성자 메소드-똑같은 매개변수 가진 메소드 호출
    Book(String title, String publisher){
        this.title = title;
        this.publisher = publisher;
    }
    
    void getBookInfo(){
        System.out.println("제목 : "+title);
        System.out.println("출판사 : "+publisher);
    }
}
