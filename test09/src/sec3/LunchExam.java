package sec3;

public class LunchExam {

	public static void main(String[] args) {
		Lunch l ;
		l = new Korean();
		l.eating("된장찌개");
		
		l= new Chinese();
		l.eating("짜장면");
		
		l = new Japanese();
		l.eating("돈까스");

	}

}
