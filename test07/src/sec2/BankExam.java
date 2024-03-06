package sec2;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		Bank[] b = new Bank[10];
		Scanner scn = new Scanner(System.in); 
	/*	b[0] = new Bank(0, 100000, "농협은행","김동연");
		b[1] = new Bank(0, 200000, "기업은행","김기태");
		b[2] = new Bank(0, 150000, "국민은행","양현종");
		b[3] = new Bank(0, 300000, "국민은행","박상현");
		b[4] = new Bank(0, 400000, "농협은행","정윤종");
		b[5] = new Bank(0, 230000, "기업은행","이창민");
		b[6] = new Bank(0, 550000, "기업은행","박영준");
		b[7] = new Bank(0, 220000, "농협은행","김영수");
		b[8] = new Bank(0, 330000, "국민은행","하재현");
		b[9] = new Bank(0, 410000, "농협은행","이정후");*/
		
		while(true)
		{
			System.out.print("[0~4]입력 : ");
			int a = scn.nextInt();
			if(a==0)
			{
				break;
			}else if(a==1)
			{
				for(int i = 0; i < b.length; i++)
				{
					b[i] = new Bank();
					System.out.print("계좌번호 입력 : ");
					b[i].setAccount(scn.nextInt());
					System.out.print("잔액 입력 : ");
					b[i].setMoney(scn.nextInt());
					scn.nextLine();
					System.out.print("은행 입력 : ");
					b[i].setBankName(scn.nextLine()); 
					System.out.print("이름 입력 : ");
					b[i].setName(scn.nextLine()); 
				}
			}else if(a==2)
			{
				int j=0;
				System.out.print("계좌번호 입력 : ");
				int account1 = scn.nextInt();
				for(Bank i : b)
				{
					if(i.getAccount()==account1)
					{
						j++;
					}
				}
				
				if(j==1)
				{
					System.out.print("입금액 입력 : ");
					int putmoney = scn.nextInt();
					for(Bank i : b)
					{
						if(i.getAccount()==account1)
						{
							i.setMoney(i.getMoney()+putmoney);
						}
					}
				}else
				{
					System.out.println("없은 계좌번호입니다. 처음으로 돌아갑니다");
					continue;
				}
				
			}else if(a==3)
			{
				int j=0;
				System.out.print("계좌번호 입력 : ");
				int account1 = scn.nextInt();
				for(Bank i : b)
				{
					
					if(i.getAccount()==account1)
					{
						j++;
					}
				}
				
				if(j==1)
				{
					System.out.print("출금액 입력 : ");
					int withdrawalmoney = scn.nextInt();
					for(Bank i : b)
					{
						if(i.getAccount()==account1)
						{
							i.setMoney(i.getMoney()-withdrawalmoney);
						}
					}
				}else
				{
					System.out.println("없은 계좌번호입니다. 처음으로 돌아갑니다");
					continue;
				}	
			}else if(a==4)
			{
				int j=0;
				System.out.print("계좌번호 입력 : ");
				int account1 = scn.nextInt();

				for(Bank i : b)
				{
					
					if(i.getAccount()==account1)
					{
						j++;
					}
				}
				
				if(j==1)
				{
					for(Bank i : b)
					{
						if(i.getAccount()==account1)
						{
							System.out.println(i.toString());
						}
					}
				}else
				{
					System.out.println("없은 계좌번호입니다. 처음으로 돌아갑니다");
					continue;
				}	
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요 : ");
				continue;
			}
		}

	}

}
