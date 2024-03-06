package exam;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isVaild()
	{
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				if(day>=1&&day<=31)
				{
					return true;
				}else
					return false;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				if(day>=1&&day<=30)
				{
					return true;
				}else
					return false;
			}
			case 2 : 
			{
				if(day>=1&&day<=28)
				{
					return true;
				}else
					return false;
			}
			default : return false;
		}
	}	
	
	public void print()
	{
		if(this.isVaild())
		{
			System.out.println("유효한 날짜입니다.");
		}else
		{
			System.out.println("유효하지 않는 날짜입니다.");
		}
	}
}
