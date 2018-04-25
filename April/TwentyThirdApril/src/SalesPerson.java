
public class SalesPerson {
	private String firstName;
	private String lastName;
	private Department department;
	private int saledMonthStuff;
	private int monthProfit;

	public SalesPerson(String firstName, String lastName, Department department, int saledMonthStuff, int monthProfit) {
		setFirstName(firstName);
		setLastName(lastName);
		setDepartment(department);
		setSaledMonthStuff(saledMonthStuff);
		setmonthProfit(monthProfit);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.matches("[A-Z][a-zA-Z]*")) {
			this.firstName = firstName;
		} else {
			throw new Error();
		}
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {
			this.lastName = lastName;
		} else {
			throw new Error();
		}
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		if (department instanceof Department) {
			this.department = department;
		}
	}

	public int getSaledMonthStuff() {
		return this.saledMonthStuff;
	}

	public void setSaledMonthStuff(int saledMonthStuff) {
		if (saledMonthStuff > -1) {
			this.saledMonthStuff = saledMonthStuff;
		}
	}

	public int getmonthProfit() {
		return this.monthProfit;
	}

	public void setmonthProfit(int monthProfit) {
		this.monthProfit = monthProfit;
	}

	public double SalaryCaluclator() {
		if (saledMonthStuff > 200 && monthProfit == 3000) {
			return (30 * monthProfit) / 100;
		} else if (saledMonthStuff < 100 && monthProfit < 1000) {
			return (20 * monthProfit) / 100;
		} else {
			return 700;
		}
	}

	public String toString() {
		String info = new StringBuilder()
				.append(firstName + ", ")
				.append(lastName + ", ")
				.append(department + " department,")
				.append(saledMonthStuff + "k,")
				.append(monthProfit + "k")
				.toString();

		return info;
	}
}
