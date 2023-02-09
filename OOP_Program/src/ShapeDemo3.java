import java.util.*;

import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		double[] radius = new double[5];
		double[] heigth = new double[5];
		String[] input = new String[5];
		for (int i = 0; i < 5; i++) {
			input[i] = JOptionPane.showInputDialog(null, "Input radius and heigth");
			String[] split = input[i].split(" ");
			radius[i] = Double.parseDouble(split[0]);
			heigth[i] = Double.parseDouble(split[1]);
			cylinder[i] = new Cylinder(radius[i], heigth[i]);
		}
		String out = "";
		int i = 1;
		for (Cylinder _cylin : cylinder) {
			out += "Cylinder " + i + ", " + "volume = " + _cylin.getVolume() + "\n";
			i++;
		}
		JOptionPane.showMessageDialog(null, out);
	}

}
