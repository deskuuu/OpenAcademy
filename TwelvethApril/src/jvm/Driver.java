package jvm;

import java.util.ArrayList;

public class Driver {
	private Integer Max_Cars_Count = 2;

	private String name;
	private ArrayList<Car> cars;

	public Driver(String name) {
		setName(name);
		this.cars = new ArrayList<Car>(Max_Cars_Count);
	}

	public void setName(String name) {
		if (name instanceof String) {
			this.name = name;
		}
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public void PrintCars() {
		for (Car car : cars) {
			System.out.println(car.toString());
		}
	}
}
