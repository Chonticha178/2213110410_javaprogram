import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String full,first,last;
		full = scan.nextLine();
		int spaceber=full.indexOf(' ');
		if(spaceber==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			first=(full.substring(0,full.indexOf(" ")));
			last=(full.substring(full.indexOf(" ")));
			System.out.println("Frist Name: "+first.toUpperCase()+"\nLast Name: "+last.toLowerCase());
		}
	}

}
