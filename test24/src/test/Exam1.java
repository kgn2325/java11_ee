package test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		output1();

	}
	public static void output1() {
		//FileOutputStream fos = null;
		FileWriter fos1 = null;
		try {
			fos1 = new FileWriter("test.txt");
			String str = "점심 뭐 먹어?";
			fos1.write(str);		
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			if(fos1!=null)
			{
				try {
					fos1.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
