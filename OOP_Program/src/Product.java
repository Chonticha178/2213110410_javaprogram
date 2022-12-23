
public class Product {

	private String id;
	private int unit;
	private double price;

	// method
	public void setID(String ID) {
		id = ID;
	}

	public String getId() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		double total = unit*price;
		return total;
	}

	public boolean checkunit() {
		return unit > 0;
	}

	public boolean checkprice() {
		return price > 0;
	}
}
