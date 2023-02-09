import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		double[] radius = new double[5];
		double[] heigth = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter radius and heigth : ");
			radius[i] = scan.nextDouble();
			heigth[i] = scan.nextDouble();
			cylinder[i] = new Cylinder(radius[i], heigth[i]);
		}
		int i = 1;
		for (Cylinder _cylin : cylinder) {
			System.out.println("Cylinder " + i + ", " + "volume = " + _cylin.getVolume());
			i++;
		}

	}

}
