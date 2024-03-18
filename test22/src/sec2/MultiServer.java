package sec2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;



public class MultiServer {

	public static void main(String[] args) {
		
		MultiServer multi = new MultiServer();
		multi.start();

	}
	
	public void start() {
		InetAddress local=null;
		String addr="";
		try {
			local = InetAddress.getLocalHost();
			addr = local.getHostAddress();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ServerSocket server =null;
		Socket socket = null;
		
		try {
			server = new ServerSocket(8000);
			while(true)
			{
				System.out.println(addr+"[Server 실행] : Client 연결 대기중입니다.");
				socket = server.accept();
				ReceiveThread receiveThread = new ReceiveThread(socket);
				receiveThread.start();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(server!=null)
			{
				try {
					server.close();
					System.out.println("[서버 종료]");
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("[서버 소켓 통신 오류]");
				}
			}
		}
	}

}
