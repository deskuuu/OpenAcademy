package CarsDepartment.Common;

import CarsDepartment.Common.Types.CarType;
import CarsDepartment.Common.Types.ExtraType;
import CarsDepartment.Models.FamilarCar;
import CarsDepartment.Models.LuxoriousCar;

public class Main {
	public static void main(String[] args) {
		Car familarCar = new FamilarCar("Mercedes", "AMG", CarType.Combi, "red", 1891, "545f", "100-7", 70d, 230);

		System.out.println(familarCar.getBrand());
		System.out.println(familarCar.calculateDayFee());
		System.out.println(familarCar.CalculateGoneKmsCoeficient());

		Car luxoriousCar = new LuxoriousCar("BMW", "X6", CarType.Combi, "red", 1891, "545f", "100-7", 700d, 90, ExtraType.champagne);

		System.out.println(luxoriousCar.getBrand());
		System.out.println(luxoriousCar.calculateDayFee());
		System.out.println(luxoriousCar.CalculateGoneKmsCoeficient());
	}
}
