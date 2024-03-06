package exam;

public class Exam2 {

	public static void main(String[] args) {
		for(int i = 2; i<10; i++)
		{
			
			for(int j =1; j<10; j++)
			{
				if(i%2==1)
				{
					continue;
				}else
				{
					
					System.out.print(i +" * "+j +" = "+ i*j+"\t");
				}
			}
			System.out.println();
		}
		for(int i = 2; i<10; i+=2)
		{
			
			for(int j =1; j<10; j++)
			{
				
				System.out.print(i +" * "+j +" = "+ i*j+"\t");

			}
			
			System.out.println();
		}

	}

}
