public class OutOfRangeException extends Exception{
	void checkvalue(int value, int MIN, int MAX) throws OutOfRangeException{

		if(value < MIN || value > MAX){
			throw new OutOfRangeException();
		}
	}
}