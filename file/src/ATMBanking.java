import java.util.*;
import java.io.*;
import java.text.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0-000-000-00-0");
		System.out.print("Enter account number : ");
		String num = console.next();
		while(num!=f.format(num)) {
			System.out.print("Input wrong type, Enter account number");
			num= console.nextLine();
		}
		
		
		

	}

}
