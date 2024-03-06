package exam;

public class Exam1 {

	public static void main(String[] args) {
		char[] arr = {'M','e','r','r','y',' ','C','h','r','i','s','m','a','s'};
		char a2 =(char)((int)arr[2]-32);
		System.out.println(a2);
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>90)
			{
				arr[i]=(char)(arr[i]-32);
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		int[] a = new int[5];
		int cnt = 0;
		int sum =0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) 			{
				a[cnt] = i;
				cnt++;
			}
		}
		for(int i = 0; i<a.length; i++)
		{
			sum += a[i];
		}
		System.out.println(sum);
	}
}
