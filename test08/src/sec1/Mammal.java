package sec1;
//Animal(부모 클래스 = super), Mammal(자식클래스 = sub)
public class Mammal extends Animal {//Animal 로부터 모든 멤버를 상속받은 Mammal 클래스
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}


	public String print() {
		return "Mammal [leg=" +leg+"], name=["+super.getName()+"]";//super -> 부모 것
	}
	
}
