package ddit.chap07.sec02;

import ddit.chap07.sec01.Prac02;
import ddit.chap07.sec01.Prac03;
import ddit.chap07.sec01.Prac04;

public class SendMessageExample {

	public static void main(String[] args) {
				//KakaoSend
				KakaoSend kakao = new KakaoSend("muji", "lion", "안녕히 가세요");
				kakao.sendMessage();
				kakao.receiveMessage();
				System.out.println();
				
				//EmailSend
				String sen = "asd@asdgf.com";
				String rec = "qwer@asdf.com";
				
				EmailSend email = new EmailSend(sen, rec, "안녕하세요", "감사해요");
				email.receiveEmail();
				email.sendEmail();
				System.out.println();
				
				//LetterSend
				LetterSend letter = new LetterSend(sen, rec, "안녕하세요");
				letter.receiveMessage();
				letter.sendMessage();
				System.out.println();

	}

}
