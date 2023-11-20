package Variable;

public class InstanceVariable {
public String lastName="khan";	
public static String lastName1="mulla"; 	
	
	

	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.sabrina();
		syed();
	}
	
	public void sabrina() {
	System.out.println(lastName);
}
	public static void syed() {
	System.out.println(lastName1);
	}
	
}
