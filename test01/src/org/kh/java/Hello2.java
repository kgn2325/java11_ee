package org.kh.java;

import java.util.Scanner;


public class Hello2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");

		int a = scn.nextInt();
		int num= 2*a - 1;
		
		if(a<1)
		{
			System.out.println("1이상의 수를 입력하세요.");
		}else {
			for(int i=0; i<num; i++){
				if(i<num/2+1) {
					for(int j=num/2; j>i; j--) {
						System.out.print(" ");
					}
					for(int k = 0; k<2*i+1;k++) {
						System.out.print("*");
					}
					System.out.println();
				}else{
					for(int j1=num/2; j1<i; j1++)
					{
						System.out.print(" ");
					}
					for(int k = 2*num; k>2*i+1;k--) {
						System.out.print("*");
					}
					System.out.println();
				}
				
			}
		}
		
	}

}
