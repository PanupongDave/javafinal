public class Student{
	private int student_id;
	private int year;
	private String name;

	public Student(String nm, int id, int y){
		name = new String(nm);
		student_id = id;
		year = y;
	}

	public String toString(){
		return "Student: " + name + ", "+
				student_id + ", " + year;
	}

	protected String getName(){
		return name;
	}

	protected void setName(String n){
		name = n;
	}

	public int year_group(){
		return year;
	}
}