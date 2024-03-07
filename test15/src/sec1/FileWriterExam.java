package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		BufferedWriter fw= new BufferedWriter(new FileWriter(file, true));
		
		fw.write("자바 프로그래밍");
		fw.newLine();
		fw.write("공부하기 싫다.");
		fw.newLine();
		fw.write("집에 갈래");  //버퍼에만 들어갔다 -> 
		fw.flush();//해줘야 실제 적용
		fw.close();
		
	}

}
