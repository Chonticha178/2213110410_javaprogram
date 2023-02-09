import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius : ");
		double radius = scan.nextDouble();
		System.out.print("Enter heigth : ");
		double heigth = scan.nextDouble();

		Circle circle = new Circle(radius, null);
		Cylinder cylinder = new Cylinder(radius, heigth);
		System.out.println("Circle[" + circle + "]");
		System.out.println("Circle[" + circle.getArea() + "]");
		System.out.println();
		System.out.println("Cylinder[" + cylinder + "]");
		System.out.println("Cylinder[area =" + cylinder.getArea() + "]");
		System.out.println("Cylinder[voluem =" + cylinder.getVolume() + "]");

	}

}
