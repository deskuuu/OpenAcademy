package CarsDepartment.Models;

import CarsDepartment.Common.Car;
import CarsDepartment.Common.Types.CarType;

public class FamilarCar extends Car {

	public FamilarCar(String brand, String model, CarType type, String color, int number, String chassisNumber,
			String fuelConsumption, Double dayFee, int goneKms) {
		super(brand, model, type, color, number, chassisNumber, fuelConsumption, dayFee, goneKms);
	}

	@Override
	public Double CalculateGoneKmsCoeficient() {
		Double coeficient = 0d;
		if (goneKms >= 500) {
			coeficient = 0.4;
		} else {
			coeficient = 0.7;
		}

		return coeficient;
	}
	
	@Override
	public Double calculateDayFee() {
		return dayFee * CalculateGoneKmsCoeficient();
	}
}
