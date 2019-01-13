package co.tellmehow.dp;

import co.tellmehow.factory.CarFactory;

public class CarApp {
	
	public static void main(String[] args) {
		
		CarFactory cf = new CarFactory();
		Car car = cf.getCar("luxury");
		car.drive();
		
	}

}
