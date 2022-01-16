package prac;

public class Practice1 {

	// JAVA brain is the heap ==> all variables are stored in a special are called
	// the String Pool

	// dynamic code = 1) parameter and argument
	// in method level 2) parameter in class ==> constructor
	
	int a;

	Practice1(int b) {// b=2
		a = b;// a=2
	}
	
	public void getString(String s) {//dynamic code with parameter for string
		System.out.println(s);
	}
	
	void getInt(int a, int b ) {//dynamic with int 
		System.out.println(a + b);
	}

	void getMoney() {
		System.out.println(a);

	}

	void getIncome() {
		System.out.println(a);

	}

	void getSalary() {
		System.out.println(a);
	}

	void getSalaries() {
		String name = "iram";// variable ==> Stored in String pool
		String obj = new String("iram");// class ==> heap medium perf yes it is synced and thread safe

		// faster than String ==> StringBuilder ==> always a class
		StringBuilder lastName = new StringBuilder("iram"); // class ==> HEAP + faster but not Synced or thread safe

		// slowest but purely synced and thread safe
		StringBuffer obj3 = new StringBuffer();

		int a = 10;// var ==> Stored in String pool
		Integer obj1 = new Integer(10);// class ==> wrapper class ==> stored in HEAP

		double c = 20.25;// var ==> Stored in String pool
		Double obj2 = new Double(20.25);// class ==> wrapper class ==> stored in HEAP

	}

	void reverseString() {
		String country = "United States of America";
		for (int i = (country.length() - 1); i >= 0; i--) {
			System.out.print(country.charAt(i));
		}
		System.out.println();
	}

	void forLoopPrac() {
		String name = "Iram";
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
			//System.out.print(i);
		}
	}

	public static void main(String[] args) {
		Practice1 prac = new Practice1(9);
//		prac.getSalary();// argument ==> dynamic coding
//		prac.getIncome();// argument ==> dynamic coding
//		prac.getMoney();// argument ==> dynamic coding
//		prac.reverseString();
//		prac.forLoopPrac();
		prac.getString("Iram");
		prac.getInt(800, 2);
	}
}
