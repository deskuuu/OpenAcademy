package Library;

public class Authour {
	private String firstName;
	private String lastName;
	private String nacionality;

	public Authour(String firstName, String lastName, String nacionality) {
		setFirstName(firstName);
		setLastName(lastName);
		setNacionality(nacionality);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		HelperCheck.checkForNull(firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		HelperCheck.checkForNull(lastName);
		this.lastName = lastName;
	}

	public String getNacionality() {
		return this.nacionality;
	}

	public String toString() {
		return this.firstName + " " + this.lastName;
	}

	public void setNacionality(String nacionality) {
		HelperCheck.checkForNull(nacionality);
		this.nacionality = nacionality;
	}
}
