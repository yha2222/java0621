package ddit.chap07.sec02;

//������ <= īī��-���Ӹ���-����
// ���� : �߽��ϴ� - �����ϴ� / ����

public class SendMessage {
	String sender;
	String receiver;
	String content;
	
	//������ �޼���
	SendMessage(String sender, String receiver, String content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	public void sendMessage() {
		System.out.println("�� " + receiver + "���� " + content + "�� ������");
	}
	
	public void reserveMessage() {
		System.out.println(receiver + "�� "+ sender +"�� ���� �� " + content + "�� �޴�");
	}
}
