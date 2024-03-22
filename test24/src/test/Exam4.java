package test;

import java.net.ServerSocket;
import java.net.Socket;

public class Exam4 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket();//ServerSocket server = new ServerSocket()의 구문에 포트번호가 지정되지 않아 서버 소켓이 생성되지 못하여 통신을 할 수 없다.
			Socket s = server.accept();
		}catch{
			
		}

	}

}
