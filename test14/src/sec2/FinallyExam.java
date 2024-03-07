package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyExam {
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		FileOutputStream ois = null;
		//finally : 예외사항이 try되어 성공 수행을 하게 되든 exception 되어 실패 수행을 하든 반드시 처리해야 하는 문장
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
			
		}finally {
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행");
		}
		try {
			ois = new FileOutputStream("b.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행");
		}
		System.out.println("예외 처리의 다음 문장");
	}

}
