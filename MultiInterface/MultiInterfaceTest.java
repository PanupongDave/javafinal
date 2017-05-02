public class MultiInterfaceTest implements employee1,employee2{
	public float setOT(float s){
		return s/30;
	}

	public float calOT(float s,int h){
		return setOT(s)*h;
	}
}