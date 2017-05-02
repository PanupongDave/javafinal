import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		try{
			System.out.print("Enter X: ");
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();

			System.out.print("Enter Y: ");
			int y = scan.nextInt();
			System.out.println(x/y);
		}

		catch (ArithmeticException e1){
			System.out.println(e1 + "\nError by Zero");
		}

		catch (Exception e2){
			System.out.println(e2 + "\nError by type");
		}
	}
}