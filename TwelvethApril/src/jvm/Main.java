package jvm;

public class Main {
	public static void main(String[] args){
		Driver Desi = new Driver("Desi");
		Car amg = new Car("AMG", "GT S", "2018", 2000000);
		Car toyota = new Car("Toyota", "Yaris", "2009", 7800);

		Desi.addCar(amg);
		Desi.addCar(toyota);
		
		Desi.PrintCars();
	}
}
