import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking(String acc,String pass,int money) {
		super(acc,pass);
		this.money = money;
	}
	public 	boolean checkBookBank() throws IOException{
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		while(read.hasNext()) {
			String acc = read.next();
			String pass = read.next();
			money = read.nextInt();
			
		}
		return false;
	}
	public void show() {
		
	}
}
