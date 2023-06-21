package ddit.chap07.sec02;

//공통점 <= 카카오-ㅇㅣ메일-편지
// 동작 : 발신하다 - 수신하다 / 내용

public class SendMessage {
	String sender;
	String receiver;
	String content;
	
	//생성자 메서드
	SendMessage(String sender, String receiver, String content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	public void sendMessage() {
		System.out.println("가 " + receiver + "에게 " + content + "를 보내다");
	}
	
	public void reserveMessage() {
		System.out.println(receiver + "가 "+ sender +"로 부터 온 " + content + "를 받다");
	}
}
