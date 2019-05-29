import _03_smurf.Smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy");
	handySmurf.eat();
	System.out.println(handySmurf.getName());
	
	Smurf Papa = new Smurf("Papa");
	System.out.println(Papa.getName());
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());

}
}
