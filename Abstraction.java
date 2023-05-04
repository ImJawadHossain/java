package jawad;

	abstract class Car {
	public abstract void start();
	public abstract void stop();
	
}


	class Bmw extends Car {
	public void start() {
		System.out.println("The BMW Started");
	}
	
	public void stop() {
		System.out.println("The BMW Stoped");
	}
}

// You should write the class name as the same to your file name
	class Main{
	public static void main(String[] args) {
		Car obj = new Bmw();
		
		obj.start();
		obj.stop();
	}
}
