package day20;

public class Audi  extends Car{

	String model;
	public void stop()
	{
		System.out.println("This is to stop the car");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="A4";
		a.stop();
		a.price=2222;
		a.start();
		
		

	}

}




