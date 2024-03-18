package behavioral.templatemethod;

public class TemplateMethodPattern {

	public static void main(String[] args) {
		HouseTemplate house1 = new WoodHouse();

		HouseTemplate house2 = new GlassHouse();
		
		house1.buildHouse();
		System.out.println();
		house2.buildHouse();

	}

}
