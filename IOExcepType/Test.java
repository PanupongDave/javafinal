import java.io.*;

public class Test{
	public static void main(String[] args){
		FileInputStream f_in = null;
		File fname = new File("c:\\ByteData.txt");

		try{
			f_in = new FileInputStream(fname);
			System.out.println("Read Data from File: " + fname);

			int c;
			while( (c = f_in.read()) != -1)
				System.out.println(c);
		}

		catch (IOException e){
			System.out.println(e+ "\nErro File");
		}
	}
}