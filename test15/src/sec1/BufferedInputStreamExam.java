package sec1;
//BufferedInputStream : 바디트 단위
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExam {

	public static void main(String[] args) throws IOException {
		BufferedInputStream input = null;
		try {
			input = new BufferedInputStream(new FileInputStream("a.txt"));
			while(input.available()>0) {
				System.out.println((char)input.read());
			}
		}catch (Exception e) {
			System.out.println("파일 읽기 실패");
		}finally {
			if(input !=null)
			{
				try {
					input.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
