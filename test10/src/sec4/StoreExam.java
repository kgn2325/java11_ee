package sec4;

public class StoreExam {

	public static void main(String[] args) {
		Inventory store;
		store = new Store();
		store.invertory();
		
		Pay pay;
		pay = new Pay();
		pay.invertory();
		pay.pay();
		
		pay = new Store();
		pay.invertory();
		pay.pay();

	}

}
