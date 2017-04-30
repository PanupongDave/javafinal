public class GradStudent extends Student
{
	private String dept;
	private String thesis;

	public GradStudent(String nm, int id,
						int y, String d, String th)
	{
		super(nm, id, y);

		dept = new String(d);
		thesis = new String(th);
	}

	public String toString()
	{

		return "Grad" + super.toString() + ", " + dept + ", " + thesis;
	}


}