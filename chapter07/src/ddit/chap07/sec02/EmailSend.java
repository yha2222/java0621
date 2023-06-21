package ddit.chap07.sec02;

public class EmailSend extends SendMessage {
	String title;
	EmailSend(String sender, String receiver, String content, String title){
		super(sender, receiver, content);
		this.title = title;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("제목: " + title);
		System.out.println("받는 이 주소: " + receiver);
		System.out.println("내용: " + content);
	}
	
	@Override
	public void reserveMessage() {
		System.out.println("제목: " + title);
		System.out.println("보낸 이 주소: " + receiver);
		System.out.println("내용: " + content);
	}
}
