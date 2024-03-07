package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : 파일의 내용일 바이트 단위로 쓰기 위한 클래스
public class FileOutputStreamExam {

	public static void main(String[] args) throws IOException {
		File file = new File("b.txt");
		if(file.createNewFile())
		{
			System.out.println("파일 생성 성공");
		}
		else {
			System.out.println("이미 파일이 존재합니다.");
		}
		
		String data = "Hello Java";
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes()); //getBytes()는 String을 byte 단위로 배열로 변경
		fos.close();
	}

}
