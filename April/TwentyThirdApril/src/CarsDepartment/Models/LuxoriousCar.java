package CarsDepartment.Models;

import CarsDepartment.Common.Car;
import CarsDepartment.Common.Types.CarType;
import CarsDepartment.Common.Types.ExtraType;

public class LuxoriousCar extends Car {

	private ExtraType extraType;

	public LuxoriousCar(String brand, String model, CarType type, String color, int number, String chassisNumber,
			String fuelConsumption, Double dayFee, int goneKms, ExtraType extraType) {
		super(brand, model, type, color, number, chassisNumber, fuelConsumption, dayFee, goneKms);
		setExtraType(extraType);
	}

	public ExtraType getExtraType() {
		return this.extraType;
	}

	public void setExtraType(ExtraType extraType) {
		if (extraType instanceof ExtraType) {
			this.extraType = extraType;
		}
	}

	@Override
	public Double CalculateGoneKmsCoeficient() {
		Double coeficient = 0d;
		if (goneKms >= 200) {
			coeficient = 0.4;
		} else {
			coeficient = 0.6;
		}

		return coeficient;
	}

	@Override
	public Double calculateDayFee() {
		return dayFee * CalculateGoneKmsCoeficient() * extraType.getNumVal();
	}
}
