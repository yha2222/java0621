package ddit.chap07.sec02;

public class KakaoSend extends SendMessage {
	KakaoSend(String sender, String receiver, String content){
		super(sender, receiver, content);
	}
	
	@Override
	public void sendMessage() {
		System.out.println(receiver + "���� ī������ "+ content + "�� ������");
	}
	
	@Override
	public void reserveMessage() {
		System.out.println(sender + "�κ��� ī���� �޴�. ������ " + content);
	}
}
