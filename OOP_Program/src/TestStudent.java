
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString()
		Student jirapat = new Student("Jirapat Anantasiri", "1 Happy Ave");
		System.out.println(jirapat);

		// Test setters and Getters
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());

		// Test addCourseGrade(),printGrade(), and getAverageGrade()
		jirapat.addCourseGrade("INT107", 25);
		jirapat.addCourseGrade("INT108", 79);
		jirapat.addCourseGrade("MSC202", 69);
		jirapat.printsGrade();

		System.out.printf("THe average grade is %.2f%n", jirapat.getAverageGrade());

	}

}
