public class InterfaceTest implements employee{
	public void setOT(float s){
		System.out.println("OT RATE = "+ s + " BAHT/HR.");
	}
	public float calOT(int h,float s){
		return h*s;
	}
	
}