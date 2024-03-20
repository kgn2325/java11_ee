package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class TCPServer {

	public static void main(String[] args) {
		ServerSocket server = null;// 서버용 소켓
		Socket socket = null;// 클라이언트용 소켓
		Scanner sc = new Scanner(System.in);//메시지 입력
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server = new ServerSocket(6000);
			System.out.println("서버포트 : 6000");
			socket = server.accept();
			System.out.println("[연결 대기]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			while(true)
			{
				//수신
				String inMessage = in.readLine();//클라이언트로 부터 온 메시지
				System.out.println("[From Client] : "+inMessage);
				if(inMessage.contains("quit")) break;
				
				//발신
				System.out.println("[Send to Message] : "); //클라이언트로 보낼 메시지 작성
				String outMessage = sc.next();
				
				
				out.println(outMessage); //송신 객체에 메시지 저장
				out.flush(); //클라이언트에게 송신 메시지 전달
				if(outMessage.contains("quit")) break;
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("[소켓 연결 시작 오류]");
		}finally {
			try {
				sc.close();
				socket.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
