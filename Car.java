
public class Car extends Vehicle {



public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}





@Override
public String doStuff() {
	
	return "je suis une" + this.getBrand() + this.getKilometers() + " vroum vroum! ";
	
}


}


