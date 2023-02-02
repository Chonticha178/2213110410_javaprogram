public class Product1 {
	private int uint;
	
	public void setUnit(int unit) {
		this.uint=unit;
	}
	public int getUnit() {
		return uint;
	}
	public int getTotalprice() {
		return getUnit() *100;
	}
	public String toString() {
		return "You buy " +getUnit() +"units( "+getTotalprice()+")";
	}
}
