package exam;

public class CardExam {

	public static void main(String[] args) {
		Card c = new Card();
		System.out.println("카드 번호"+ c.getCardNumber());
		
		CardCompany com = CardCompany.getInstance();
		CardCompany org = CardCompany.getInstance();
		
		Card c1 = com.createCard();
		Card c2 = com.createCard();
		Card c3 = com.createCard();
		Card c4 = org.createCard();
		Card c5 = org.createCard();
		
		System.out.println(c1.getCardNumber());
		System.out.println(c2.getCardNumber());
		System.out.println(c3.getCardNumber());
		System.out.println(c4.getCardNumber());
		System.out.println(c5.getCardNumber());

	}

}
