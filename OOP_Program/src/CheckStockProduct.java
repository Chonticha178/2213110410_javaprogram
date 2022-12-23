import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int stock = scan.nextInt();
		Product[] check = new Product[stock];
		for (int i = 0; i < check.length; i++) {
			check[i] = new Product();
			System.out.print("Input product Id : ");
			check[i].setID(scan.next());
			System.out.print("Input product Unit : ");
			check[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product n 'LOW' status.");
		System.out.println("-----------------------------------");
		for (Product chk : check) {
			if (chk.getUnit() < 5) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product n 'NORMAL' status.");
		System.out.println("-----------------------------------");
		for (Product chk : check) {
			if (chk.getUnit() >= 5 && chk.getUnit() < 50) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("List of product n 'HIGH' status.");
		System.out.println("-----------------------------------");
		for (Product chk : check) {
			if (chk.getUnit() >= 50) {
				System.out.println(">> " + chk.getId() + " has " + chk.getUnit() + " units");
			}
		}
	}

}
