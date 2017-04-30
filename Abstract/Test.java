import java.util.Scanner;

public class Test
{
	public static void main(String[] args){
		AbstractTest emp = new AbstractTest();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter OT RATE (BAHT/HR.) >>> ");
		float salary = scan.nextFloat();
		System.out.print("Enter OT HOUR >>> ");
		int hr = scan.nextInt();
		System.out.println("OT HOUR = " + hr + " HR.");
		emp.setOT(salary);
		System.out.println("TOTAL OT = " + emp.calOT(hr,salary) + " BAHT");

	}
}