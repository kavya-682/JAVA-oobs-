package in.java;

public class MethodOverloding1 {

	public static void main(String[] args) {
		int i=10, j=20,k=30;
		float l=10.5f, m=20.5f, o=30.5f;
		double p=100.65;
		
		//create the object for calculator class
		Calculator calculator = new Calculator();
		
		// call the methods
		System.out.println(calculator.add(i, j)); // output >> 30 
		System.out.println(calculator.add(i, p));  // output >> 110.65
		System.out.println(calculator.add(i, j,k)); // output >> 60
		System.out.println(calculator.add(l,k));  // output >> 40.5
		System.out.println(calculator.add(l,m));   // output >> 31.0
     
	}

}
class Calculator{
	
	int add(int a,int b){
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a+b+c;
	}
	float add(int a, float b, float c) {
		return a+b+c;
	}
	
}
