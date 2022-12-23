import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		double total = 0;
		DecimalFormat fm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input prodcut Id :  ");
			productList[i].setID(scan.next());
			System.out.print("Input prodcut Unit :  ");
			productList[i].setUnit(scan.nextInt());
			while (!productList[i].checkunit()) {
				System.out.print("Input prodcut Unit :  ");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input prodcut Price :  ");
			productList[i].setPrice(scan.nextDouble());
			while (!productList[i].checkprice()) {
				System.out.print("Input prodcut Price :  ");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		for (Product PDL : productList) {
			System.out.println("Product ID : " + PDL.getId() + ", Total price = " + (PDL.calculate()));
		}
		for (int i = 0; i < productList.length; i++) {
			total = (productList[0].calculate() + productList[1].calculate() + productList[2].calculate()
					+ productList[3].calculate());
		}
		System.out.println("\nTotal price of all products is " + fm.format(total));

	}

}
