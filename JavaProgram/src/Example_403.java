import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again : ");
			sentence = scan.nextLine();
		} 	
		System.out.println();
		int spanceofword=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				
			}
		}
		System.out.println("This sentence has "+spanceofword+" spacebar. ");
		System.out.println("This sentence has "+(spanceofword+1)+" words. ");*/
		
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again : ");
			
		}
		
	}
}