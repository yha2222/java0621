package ddit.chap07.sec02;

public class SendMessageExample {

	public static void main(String[] args) {
		KakaoSend ks = new KakaoSend("a@naver.com", "z.daum.net", "���� ���� ����...");
		ks.sendMessage();
		
		String s = "jslee@naver.com";
		String r = "ddit405@ddit.or.kr";
		
		EmailSend es = new EmailSend(s, r, "���� ȸ���ֽ��ϴ�...", "ȸ�İ���");
		es.reserveMessage();
		
		LetterSend ls = new LetterSend(s, r, "���� ȸ�� �ֽ��ϴ�...");
		ls.reserveMessage();

	}

}
