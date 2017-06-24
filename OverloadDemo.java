package assignment_4a;

public class OverloadDemo {
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Overload ob = new Overload();
		ob.test(); //calling the method test without parameter
		ob.test(5); //calling the method test with one integer
		ob.test(5,10); //calling the method test with two integer
		result = ob.test(123.5); //calling the method test for a double parameter and saving the result in the variable test
		//Displaying the variable result
		System.out.println("Result of ob.test(123.5) : " +result);
		
	}

}
