public class Test{
	public static void main(String[] args){
		int x[] = {0,1,2,3};

		try{
			System.out.println(x[x.length]);
		}

		catch (Exception e){
			System.out.println(e+" Error OutofBounds");
		}
	}
}