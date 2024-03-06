package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "김기태";
		String name2 = new String("김기태");
		Integer su1 = 1004;
		String su2 ="1004";
		//String su3 = new String(su1);
		String su3 = String.valueOf(su1);
		
		System.out.println(su1.equals(su2));
		System.out.println(su2.equals(su3));
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지";
		String[] names = new String[6];
		names = str.split("/");
		for(String s : names)
		{
			System.out.println(s);
		}
		
		String str2="";
		for(int i = 0; i<names.length; i++)
		{
			if(i==0)
			{
				str2=names[i];
			}else
			{
				str2 = str2.concat("/");
				str2 = str2.concat(names[i]);
			}
		}
		System.out.println(str2);
		
		String data ="	iveE\'s beaUty grOup\nnewJeans is girlGroup Top ";
		
		
		char ten = data.charAt(9);//10번째 문자(인덱스가 9인 문자)
		System.out.println("10번째 문자(인덱스)가 9인 문자 : "+ten);
		String trimData = data.trim(); //앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println("앞 뒤의 공백읠 제거 : "+trimData.length()+"글자, "+trimData);
		int size =data.trim().length();//글자수를 size에 저장
		System.out.println("앞 뒤의 공백을 제거한 글자수 : "+ size);
		int n =data.indexOf('n'); // n의 글자 위치(인덱스)를 n에 저장
		int n1 =data.lastIndexOf('n');
		System.out.println("첫번째 n의 글자 위치(인덱스)를 n에 저장 : " + n);
		String up =data.toUpperCase();//모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환하여 up에 저장 : "+up);
		String down =data.toLowerCase();//모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환하여 down에 저장 : "+down);
		String sub1 = data.substring(20, 29);//공백을 제거하고, 20번째 글자 부터 28번째만 추출하여 sub1에 저장 괄호안의 숫자가 한개인 경우 해당 숫자의 인덱스부터 끝까지 출력
		System.out.println("공백을 제거하고, 20번째 글자 부터 27번째만 추출하여 sub1에 저장 : "+sub1);
		String sub2 = data.replace("newJeans", "Kepler");//newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		byte[] girl = data.getBytes();//문자열을 girl 문자배열로 변환하여 저장
		System.out.println("글자 수 : "+girl.length);
		for(byte b:girl)
		{
			char k = (char) b;
			System.out.print(k);
		}
		System.out.println();
		System.out.println("연습 : "+data.substring(data.lastIndexOf('g'), data.lastIndexOf('g')+9));//girlGroup 가져오는 방법
		
		//문자(byte)배열을 문자열(String)으로 변환하여 출력
		String str4 = new String(girl);
		System.out.println(str4);
		
	}

}
