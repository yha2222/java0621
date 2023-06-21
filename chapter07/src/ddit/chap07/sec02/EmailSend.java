package ddit.chap07.sec02;

public class EmailSend extends SendMessage {
	String title;
	EmailSend(String sender, String receiver, String content, String title){
		super(sender, receiver, content);
		this.title = title;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("����: " + title);
		System.out.println("�޴� �� �ּ�: " + receiver);
		System.out.println("����: " + content);
	}
	
	@Override
	public void reserveMessage() {
		System.out.println("����: " + title);
		System.out.println("���� �� �ּ�: " + receiver);
		System.out.println("����: " + content);
	}
}
