package CarsDepartment.Common.Types;

public enum ExtraType {
	champagne(100), wine(50), chocolate(40);

	private int price;

	ExtraType(int price) {
		this.price = price;
	}

	public int getNumVal() {
		return price;
	}
}
