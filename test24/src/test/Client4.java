package test;

import java.net.InetAddress;
import java.net.Socket;

public class Client4 {

	public static void main(String[] args) {
		try
		{
			String ip = InetAddress.getLocalHost().getHostAddress();
			Socket s = new Socket();//client 클래스의 Socket s = new Socket()의  서버소켓의 ip주소와 port가 지정되지 않아 통신이 불가능하다.
		}

	}

}
