import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many stdent in classroom : ");
		int stu  = scan.nextInt();
		Student[] std = new Student[stu]; // define Array Object
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();// declare array object,call all of method Studenr()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again :");
				std[i].setScore(scan.nextInt());
				i++;
			}
			System.out.println();
		} // end of for()
		System.out.println();
		System.out.println("LIST OF STUDENT (>=50)");
		System.out.println("--------------------------------------");
		/*
		 * for(int i=0;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+"("+std[i].getScore()+")"); } }
		 */
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " (" + STD.findGrade() + ") ");
			}
		}
		
	}
	
}
