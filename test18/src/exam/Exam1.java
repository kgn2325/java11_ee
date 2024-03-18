package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList=new ArrayList<IPInfo>();//ipInfoList는 ArrayList로 생성해야 하지만, null로 
		boolean b = false;
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8","김동연"));//Ipinfo 클래스에서 매개변수 하나만 전달받는 생성자는 없으므로 IPInfo의 객체를 생성할수 없다.
		ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++)
		{
			if(ipInfoList.get(i).getIp().equals(ip))//ipInfoList.get(i)는 특정 번째의 IPInfo 클래스의 객체이고, ip는 String 변수이므로, 
			{
				System.out.println(ipInfoList.get(i).getIp());
				b=true;
				break;
			}
		}
		
		if(!b)
		{
			System.out.println("일치하는 ip 사용자가 없습니다.");
		}

	}

}
