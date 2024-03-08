package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenExam2 {

	public static void main(String[] args) {
		String[] email = {"kkt09072", "kbs@naver.com","kkt@gmail.com","kim@kr"};
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$");//이메일 패턴
		for(int i=0; i<email.length; i++)
		{
			Matcher m = p1.matcher(email[i]);
			if(m.matches())
			{
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		
		String[] phone = {"010-6659-5573", "010-3342-33","02-1234-1234","010-8284-3690","010-234-1234"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");//이메일 패턴
		for(int i=0; i<phone.length; i++)
		{
			Matcher m = p2.matcher(phone[i]);
			if(m.matches())
			{
				System.out.println("휴대폰 번호 형식이 맞습니다.");
				System.out.println(phone[i]);
			}
		}
		
		String[] jm = {"941207-1234567", "010203-678912","381425-1234567","851019-234567","780528-1456123"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");//이메일 패턴
		for(int i=0; i<jm.length; i++)
		{
			Matcher m = p3.matcher(jm[i]);
			if(m.matches())
			{
				System.out.println("주민번호  형식이 맞습니다.");
				System.out.println(jm[i]);
			}
		}
		//우편번호 패턴 : 100대(1xx-yy) ~700(7xx-yy)
		String[] post = {"123-123", "212-34","816-24","5434-54","683-39"};
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");//이메일 패턴
		for(int i=0; i<post.length; i++)
		{
			Matcher m = p4.matcher(post[i]);
			if(m.matches())
			{
				System.out.println("맞는 우편번호 입니다.");
				System.out.println(post[i]);
			}
		}


	}

}
