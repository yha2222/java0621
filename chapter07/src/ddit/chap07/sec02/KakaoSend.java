package ddit.chap07.sec02;

public class KakaoSend extends SendMessage {
	KakaoSend(String sender, String receiver, String content){
		super(sender, receiver, content);
	}
	
	@Override
	public void sendMessage() {
		System.out.println(receiver + "에게 카톡으로 "+ content + "를 보내다");
	}
	
	@Override
	public void reserveMessage() {
		System.out.println(sender + "로부터 카톡을 받다. 내용은 " + content);
	}
}
