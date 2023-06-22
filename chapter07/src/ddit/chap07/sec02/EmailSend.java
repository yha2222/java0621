package ddit.chap07.sec02;

public class EmailSend extends SendMessage {
	String title;
	
	EmailSend(String sender, String receiver, String content, String title){
		super(sender, receiver, content);
		
		this.title = title;
	}
	
	public void sendEmail() {
		System.out.println("title: " + title);
		System.out.println("receive: " + receiver);
		System.out.println("content: " + content);
	}
	
	public void receiveEmail() {
		System.out.println("title: " + title);
		System.out.println("sender: " + sender);
		System.out.println("content: " + content);
	}

}
