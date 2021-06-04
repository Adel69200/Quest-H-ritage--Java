
public class Boat extends Vehicle {

public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}



@Override
public String doStuff() {
	return "je suis un " + this.getBrand() + this.getKilometers()+ " et je fais glow glow  ";
	
	
}

}
