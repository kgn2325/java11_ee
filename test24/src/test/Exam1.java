package test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class Exam1 {

	public static void main(String[] args) {
		output1();

	}
	public static void output1() {
		FileWriter fos = null;//FileOutputStream클래스는은 바이트단위 전송이므로 바이트 전송이 이뤄진다. 하지만 한글은 문자형이므로 문자는 손상되어 나타난다.. =>fileWriter로 변경해야한다.
		try {
			fos = new FileWriter("test.txt");
			String str = "안녕하세요!";
			
			fos.write(str);//charAt는 바이트단위로 출력하는 것이다. 그래서 한글이 깨진다.

		}catch(IOException e)
		{
			e.printStackTrace();
		}finally { // 사용한 파일자원은 닫아서 반환해야하는데 이 과정이 없다. 닫지 않으면 다른곳에서 이 파일을 사용할 수 없다. 그러므로 예외발생 유무와 관계없이 사용한 자원은 반환되어야 하는데 처리하는 구절이 없다. close()해줘야한다. 
			if(fos!=null)
			{
				try {
					fos.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
