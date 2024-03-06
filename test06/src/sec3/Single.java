package sec3;

public class Single {
	private static Single sin;
	private Single() {}
	public static synchronized Single getInstance(){ // getInstance() 호출시 생성
		if(sin == null) sin = new Single();
		return sin;
	}
	
}
