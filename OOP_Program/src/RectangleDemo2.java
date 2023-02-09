import java.util.*;

public class RectangleDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter width : ");
		double width = scan.nextDouble();
		System.out.print("Enter length : ");
		double length = scan.nextDouble();

		Rectangle2 rec = new Rectangle2(width, length);
		System.out.println(rec);
		System.out.println("Area of Rectangle is " + rec.getArea());

	}
}
