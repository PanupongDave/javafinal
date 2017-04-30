public class TestStuds
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Jane Doe", 100,1);

		GradStudent gs1;
		gs1 = new GradStudent("John Smith", 200,4,"Pharmacy","Retail Thesis");

		System.out.println("Student s1");
		System.out.println(s1.toString());
		System.out.println("Year " + s1.year_group() + "\n");

		System.out.println("GradStudent gs1");
		System.out.println(gs1.toString());
		System.out.println("Year " + gs1.year_group() + "\n");

		System.out.println("------TestChangeName------");
		gs1.setName("Panupong");
		System.out.println("ChangeName-----> " + gs1.getName());
		System.out.println("GradStudent gs1");
		System.out.println(gs1.toString());
		System.out.println("Year " + gs1.year_group() + "\n");


	}
}