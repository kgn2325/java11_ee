package sec2;

public class StringBuilderExam {

	public static void main(String[] args) {
		//
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append(11);
		sb.append(" Programmer");
		sb.insert(6, " Web"); //중간에 끼워넣기
		sb.insert(0,"KH ");
		
		System.out.println(sb);
	}

}
