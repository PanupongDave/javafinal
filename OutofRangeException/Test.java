import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		OutOfRangeException x = new OutOfRangeException();
		final int MIN = 0, MAX = 30; int value = 0;

		try{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Score ");
			value = scan.nextInt();
			x.checkvalue(value,MIN,MAX);
		}
		catch(OutOfRangeException e){
			System.out.println(e + "\nError Range");
		}
		catch(Exception e){
			System.out.println(e + "\n Error Type");
		}

		finally{
			System.out.println("Score is " + value*100.f/MAX + "%");
		}

	}
}