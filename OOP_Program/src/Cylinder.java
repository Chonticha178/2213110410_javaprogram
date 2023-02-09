
public class Cylinder extends Circle {
	private double heigth;

	public Cylinder(double radius, double heigth) {
		super(radius, null);
		this.heigth = heigth;
	}

	public double getHeigth() {
		return this.heigth;
	}

	public double getVolume() {
		return super.getArea() * getHeigth();
	}

	public double getArea() {
		return 2 * Math.PI * (super.getRadius() + getHeigth());
	}

	public String toString() {
		return "heigth = " + getHeigth() + " radius " + getRadius();
	}
}
