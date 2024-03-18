package sec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		
		Socket socket = null;
		
		Scanner scn = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.20.210", 6000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			while(true)
			{
				System.out.println("전송하기>>>");
				String outMsg = scn.nextLine();
				out.println(outMsg);
				out.flush();
				if("quit".equalsIgnoreCase(outMsg)) break;	
				
				String inMsg = in.readLine();
				System.out.println("[From server]"+inMsg);
				if("quit".equalsIgnoreCase(inMsg)) break;	
				}	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				scn.close();
				if(socket!=null)
				{
					socket.close();
					System.out.println("[서버 연결 종료]");
				}
			} catch (IOException e) {
				System.out.println("소켓통신 종료 오류");
				e.printStackTrace();
			}	
		}
	}

}
