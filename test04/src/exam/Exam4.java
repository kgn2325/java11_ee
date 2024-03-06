package exam;

public class Exam4 {
	public static void main(String[] args)
	{
		for(int i =0; i<4; i++)
		{
			for(int j = 3; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k =0; k<2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
