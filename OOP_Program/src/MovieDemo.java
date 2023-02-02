import java.util.*;
public class MovieDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name : ");
		String dname = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dmail = scan.next();
		System.out.print("Input director gender : ");
		char gd = scan.next().toLowerCase().charAt(0);
		
		while (gd!='m'&& gd!='f') {
			System.out.print("Input director gender,again : ");
			gd = scan.next().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int no = scan.nextInt();
		while (no<1||no>15) {
			System.out.print("Please input 1-15 only : ");
			 no = scan.nextInt();
			
		}
		
		Theater theater = new Theater(id,name,new Director(dname,dmail,gd),no);
		System.out.println(theater);
		
		
		
		
	}

}
