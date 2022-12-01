import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input some must end with full stop point : " );
			sentence = scan.next();
		}
		int spance=0;
		int i;
		for(i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(sentence.substring(spance,i));
				spance=i+1;
			}		
		}
		System.out.println(sentence.substring(spance,i));
	}
}
