package ddit.chap07.sec02;

public class SendMessageExample {

	public static void main(String[] args) {
		KakaoSend ks = new KakaoSend("a@naver.com", "z.daum.net", "집에 일찍 가자...");
		ks.sendMessage();
		
		String s = "jslee@naver.com";
		String r = "ddit405@ddit.or.kr";
		
		EmailSend es = new EmailSend(s, r, "오늘 회식있습니다...", "회식공지");
		es.reserveMessage();
		
		LetterSend ls = new LetterSend(s, r, "오늘 회식 있습니다...");
		ls.reserveMessage();

	}

}
