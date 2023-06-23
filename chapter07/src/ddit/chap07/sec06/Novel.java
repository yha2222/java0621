package ddit.chap07.sec06;

public class Novel extends Book {
	private String genre;
    String owner="이순신"; 
    Novel(String title, String publisher, String genre){
        super(title, publisher); //사용
        this.genre=genre;
    }
    @Override
    void getBookInfo(){
        System.out.println("장르 : " +genre);
        System.out.println("제목 : "+title);
        System.out.println("출판사 : "+publisher);
    }
}
