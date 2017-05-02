import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		MultiInterfaceTest emp = new MultiInterfaceTest();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter OT RATE>>> ");
		float salary = scan.nextFloat();
		System.out.print("Enter OT HOUR>>> ");
		int hr = scan.nextInt();

		System.out.println("OT HOUR = " + hr + " HR.");
		System.out.println("OT RATE = " + emp.setOT(salary) + " BAHT/HR.");
		System.out.println("TOTAl OT = " + emp.calOT(salary,hr)  + " BAHT");
	}
}