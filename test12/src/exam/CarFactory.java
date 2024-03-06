package exam;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance;
	HashMap<String, Car> carMap = new HashMap<>();
	
	public static CarFactory getInstance() {
		if(instance==null)
		{
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String s) { 
		if(carMap.containsKey(s))
		{
			return carMap.get(s);
		}
		Car car = new Car();
		carMap.put(s, car);
		return car;
	}

}
