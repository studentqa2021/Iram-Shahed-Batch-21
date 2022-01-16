package prac;

public class VariableSwap {
	// actual code should be in another method

	void makeSwap(int a, int b) {
		System.out.println("a before swapping is " + a + "\n" + "b before swapping is " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a swapped with b value is " + a + "\n" + "b swapped with a value is " + b);
	}

	public static void main(String[] args) {
		VariableSwap obj = new VariableSwap();
		obj.makeSwap(2, 1);
	}
}
