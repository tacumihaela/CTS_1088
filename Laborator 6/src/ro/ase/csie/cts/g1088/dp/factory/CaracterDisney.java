package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract{

	String culoare;
	//boolean okPentruCopiiMici = true;

	@Override
	public void alearga() {
		System.out.print("Alearga ..");
		
	}

	@Override
	public void sare() {System.out.print("Sare ..");
		
	}

	public CaracterDisney(String culoare, String nume) {
		this.culoare = culoare;
		this.nume = nume;
	}
	
	
}
