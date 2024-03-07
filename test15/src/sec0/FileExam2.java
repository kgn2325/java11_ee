package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		//파일의 상대 경로 지정
		File f1 = new File("a.txt"); // 현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt");//현재 패키지(디렉토리)는 sec0인데 상위 디렉토리로 이동한 후 sec1
		//d:\\dongyeon\\java\\a.txt
		File f3 = new File("d:"+File.separator+"dongyeon"+File.separator+"java"+File.separator+"a.txt");
		//파일의 절대 경로 지정
		String path = "d:\\dongyeon\\java\\";
		File f4 = new File(path,"a.txt");
		File f5 = new File("d:\\dongyeon\\java\\","a.txt");

	}

}
