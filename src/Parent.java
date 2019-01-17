
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		
		x = 2;
		y = 5;
		
		z = x+y;
		
		//The + is a concatenation operator. We can use it to link strings and variables. 
		System.out.println("Sum is equal to "+z);
		
		Methods m = new Methods();
		
		m.ValidateHeader();
	}

}
