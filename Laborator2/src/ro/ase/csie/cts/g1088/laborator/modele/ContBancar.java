package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected String iban;

	//constructor
	public ContBancar(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}

	// supradefinire metoda getBalanta
	@Override
	public double getBalanta() {
		return this.balanta;
	}
	// OBS: stub - forma implicita a unei functii. de obicei intoarce o instanta
}
