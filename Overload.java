package assignment_4a;

public class Overload {
	void test(){
		System.out.println("No Paramenters");
	}
	//Overload test for one integer parameter
	void test(int a){
		System.out.println("Value of a is "+a);
	}
	//Overload test for two integer parameter
	void test(int a, int b){
		System.out.println("Value of a and b is " +a+ "and" +b);
	}
	//Overload test for a double parameter
	double test(double a){
		System.out.println("Double a :" +a);
		return a*a;
	}
	
}
