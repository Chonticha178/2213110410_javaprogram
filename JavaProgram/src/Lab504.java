import java.util.*;

public class Lab504 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. \n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' '); 
		String firstName = fullname.substring(0,space);	
		System.out.print(abbreviatName(fullname)+firstName);
	}
	public static String abbreviatName(String fullname) {
		String Fname = "";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				Fname = (Fname + fullname.charAt(i+1)).toUpperCase();
				Fname = Fname+".";
			}
		}
		return Fname;
	}
}
