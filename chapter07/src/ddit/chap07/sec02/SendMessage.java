package ddit.chap07.sec02;

public class SendMessage {
	String sender;
	String receiver;
	String content;
	
	SendMessage(String sender, String receiver, String content){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	public void sendMessage() {
		System.out.println(sender + " send "+ receiver + content);
	}
	
	public void receiveMessage() {
		System.out.println(receiver + " received " + content + " from " + sender);
	}
}
