package pddit.chap07.sec09;

public class HttpServletExample {

	public static void main(String[] args) {
		init(new LoginServlet());
		
		init(new FileDownLoadServlet());

	}
	
	public static void init(HttpServlet servlet) {
		servlet.service();
	}

}
