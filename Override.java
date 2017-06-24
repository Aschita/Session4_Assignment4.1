package assignment_4a;

public class Override {
	int i,j;
	//Constructor
	Override(int a, int b){
		i = a;
		j = b;
	}
	//display i and j
	void show(){
		System.out.println("Value of I and J are:" +i+ "and" +j);
	}
}

class OverrideTest extends Override {
	int k;
	OverrideTest(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	//Display the value of k - this overrides the show() in Override
	void show(){
		System.out.println("Value of K:" + k);
		}
}
