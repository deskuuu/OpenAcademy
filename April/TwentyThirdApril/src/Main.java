
public class Main {
	public static void main(String[] args) {
		SalesPerson first = new SalesPerson("Ani", "Antonova", Department.Accounting, 700, 1234);

		Double salary = first.SalaryCaluclator();
		
		System.out.println(first.toString());
		System.out.println("Salary :" + salary);

	}
}
