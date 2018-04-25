package CarsDepartment.Common;

import java.security.InvalidParameterException;

import CarsDepartment.Common.Types.CarType;

public abstract class Car {
	private String brand;
	private String model;
	private CarType type;
	private String color;
	private int number;
	private String chassisNumber;
	private String fuelConsumption;
	protected Double dayFee;
	protected int goneKms;

	public Car(String brand, String model, CarType type, String color, int number, String chassisNumber,
			String fuelConsumption, Double dayFee, int goneKms) {
		setBrand(brand);
		setModel(model);
		setCarType(type);
		setColor(color);
		setNumber(number);
		setChassisNumber(chassisNumber);
		setFuelConsumption(fuelConsumption);
		setDayFee(dayFee);
		setGoneKms(goneKms);
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		checkForNull(brand, "Brand cannot be missing!");
		checkStringValidity(brand, 3, "Invalid brand!");
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		checkForNull(model, "Model cannot be missing!");
		checkStringValidity(model, 2, "Invalid model!");
		this.model = model;
	}

	public CarType getType() {
		return this.type;
	}

	public void setCarType(CarType type) {
		checkForNull(type, "Type is missing!");
		this.type = type;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		checkForNull(color, "Color is missing!");
		this.color = color;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		checkForNull(number, "Number cannot be null!");
		this.number = number;
	}

	public String getChassisNumber() {
		return this.chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		checkForNull(chassisNumber, "ChassisNumber cannot be null!");
		this.chassisNumber = chassisNumber;
	}

	public String getFuelConsumption() {
		return this.fuelConsumption;
	}

	public void setFuelConsumption(String fuelConsumption) {
		checkForNull(fuelConsumption, "FuelConsumption cannot be null!");
		this.fuelConsumption = fuelConsumption;
	}

	public Double getDayFee() {
		return this.dayFee;
	}

	public void setDayFee(Double dayFee) {
		checkForNull(dayFee,"Day fee is missing!");
		this.dayFee = dayFee;
	}

	public int getGoneKms() {
		return this.goneKms;
	}

	public void setGoneKms(int goneKms) {
		checkForNull(goneKms,"There are no gone kms!");
		this.goneKms = goneKms;
	}
	
	public abstract Double CalculateGoneKmsCoeficient();

	public abstract Double calculateDayFee();
	
	private void checkForNull(Object obj, String errorMessage) {
		if (obj == null) {
			throw new InvalidParameterException(errorMessage);
		}
	}

	private void checkStringValidity(String value, int min, String errorMessage) {
		if (value.length() < min) {
			throw new InvalidParameterException(errorMessage);
		}
	}
}
