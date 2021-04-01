package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterMarvel extends CaracterAbstract{
 
	int putere;

	public CaracterMarvel(String nume, int putere) {
		this.nume = nume;
		this.putere = putere;
		
	}

	@Override
	public void alearga() {
		System.out.print("Alearga ..");
		
	}

	@Override
	public void sare() {
		System.out.print("Sare ..");
		
	};
	
}
