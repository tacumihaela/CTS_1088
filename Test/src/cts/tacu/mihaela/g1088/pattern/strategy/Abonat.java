package cts.tacu.mihaela.g1088.pattern.strategy;

public class Abonat {

	private String nume;
	private IChallenge tipExercitiu;

	public Abonat() {
		super();
	}

	public Abonat(String nume) {
		super();
		this.nume = nume;
	}

	public Abonat(String nume, IChallenge tipExercitiu) {
		super();
		this.nume = nume;
		this.tipExercitiu = tipExercitiu;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public IChallenge getTipExercitiu() {
		return tipExercitiu;
	}

	public void setTipExercitiu(IChallenge tipExercitiu) {
		this.tipExercitiu = tipExercitiu;
	}

	public void startExercitiu(int nrRepetitii) {
		tipExercitiu.startExercitiu(nrRepetitii);
	}

}
