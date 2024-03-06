package org.kh.app2;
// 중첩 for문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 	******
		 	******
		 	******
		 	******
		 */
		
		for(int i=0; i<4; i++)
		{
			for(int j = 0; j<6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i=0; i<6; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0; i<11; i++)
		{
			if(i<6)
			{
				for(int j = 0; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j = 11; j>i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		System.out.println();
		for(int i =0; i<11; i++)
		{
			if(i<6)
			{
				for(int j = 6; j>i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j = 4; j<i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		System.out.println();
		for(int i =0; i<11; i++)
		{
			if(i<6)
			{
				for(int j=5; j>i; j--)
				{
					System.out.print(" ");
				}
				for(int k=0; k<i+1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
				
			}else {
				for(int j=5; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int k=11; k>i;k--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<2*i+1; k++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 10; k>2*i+1; k--)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		System.out.println();
		for(int i = 0; i<9; i++)
		{
			if(i<5)
			{
				for(int j = 4; j>i; j--)
				{
					System.out.print(" ");
				}
				for(int k = 0; k<2*i+1; k++)
				{
					System.out.print("*");
				}
				System.out.println(); 
				
			}else {
				for(int j = 4; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int k = 18; k>2*i+1; k--)
				{
					System.out.print("*");
				}
				System.out.println(); 
			}
		}
		
		System.out.println();
		for(int i = 0; i<9; i++)
		{
			if(i<5)
			{
				for(int j = 5; j>i; j--)
				{
					System.out.print("*");
				}
				for(int k = 0; k<2*i+1; k++)
				{
					System.out.print(" ");
				}
				for(int j = 5; j>i; j--)
				{
					System.out.print("*");
				}
				System.out.println(); 
				
			}else {
				for(int j = 3; j<i; j++)
				{
					System.out.print("*");
				}
				for(int k = 18; k>2*i+1; k--)
				{
					System.out.print(" ");
				}
				for(int j = 3; j<i; j++)
				{
					System.out.print("*");
				}
				System.out.println(); 
			}
		}

		
		
	}

}
