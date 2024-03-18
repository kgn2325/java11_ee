package behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;
//Goat을 Map으로 선언하고, 키와 값들을 분리
public class GoatThread {
	public static final int MAX_GOTES = 100;//상수
	private int goatNum = 0;
	
	public static final HashMap<Integer,Goat> GOATS= new HashMap<>();

	public GoatThread() {
		super();
		int i;
		for(i=0;i<30;i++) {//0~29 => 30마리의 임의 GOATS MAP을 생성
			GOATS.put(i, new Goat());
		}
		goatNum = i;
	}
	
	public void addGoat() {
		if(GOATS.size() <= MAX_GOTES) {
			GOATS.put(++goatNum, new Goat());
		}
	}
	
	public void removeGoat() {
		if(GOATS.size()>0) {
			GOATS.remove(--goatNum);
		}
	}
	
	public Iterator<Integer> createIterator(){
		return GOATS.keySet().iterator();
	}
	
	public Iterator<Goat> goatIterator(){
		return GOATS.values().iterator();
	}

	
}
