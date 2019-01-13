package co.tellmehow.factory;

import co.tellmehow.dp.Car;
import co.tellmehow.dp.Honda;
import co.tellmehow.dp.Maruti;
import co.tellmehow.dp.Mercedese;


public class CarFactory {
	
	public Car getCar(String str) {
		
		if(str.equals("mostluxury")) {
			return new Mercedese();
		}
		if(str.equals("luxury")) {
			return new Honda();
		}
		else {
			return new Maruti();
		}
				
	}

}
