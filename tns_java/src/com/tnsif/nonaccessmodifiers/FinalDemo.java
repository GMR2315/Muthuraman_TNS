package com.tnsif.nonaccessmodifiers;

final class FinalDemo {
	
	final int Max = 100;
	
	final void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		//fd.Max  = 100;

	}

}
//show error cannot extend final class
/*class Child extends FinalDemo{
	void display() {
		System.out.println("show the value of max: "+Max);
	}
}
*/