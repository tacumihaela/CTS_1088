package cts.tacu.mihaela.g1088.pattern.builder;

public class ClasaFitness {

	private String antrenor;
	private int durata;
	private String nivelDificultate;
	private int nrMaxParticipanti;
	private double pret;

	private Exercitii tipExercitiu;

	public ClasaFitness() {
		super();
	}

	public ClasaFitness(String antrenor, int durata, String nivelDificultate, int nrMaxParticipanti, double pret,
			Exercitii tipExercitiu) {
		super();
		this.antrenor = antrenor;
		this.durata = durata;
		this.nivelDificultate = nivelDificultate;
		this.nrMaxParticipanti = nrMaxParticipanti;
		this.pret = pret;
		this.tipExercitiu = tipExercitiu;
	}

	public String getAntrenor() {
		return antrenor;
	}

	public void setAntrenor(String antrenor) {
		this.antrenor = antrenor;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getNivelDificultate() {
		return nivelDificultate;
	}

	public void setNivelDificultate(String nivelDificultate) {
		this.nivelDificultate = nivelDificultate;
	}

	public int getNrMaxParticipanti() {
		return nrMaxParticipanti;
	}

	public void setNrMaxParticipanti(int nrMaxParticipanti) {
		this.nrMaxParticipanti = nrMaxParticipanti;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public Exercitii getTipExercitiu() {
		return tipExercitiu;
	}

	public void setTipExercitiu(Exercitii tipExercitiu) {
		this.tipExercitiu = tipExercitiu;
	}

	@Override
	public String toString() {
		return "Curs [antrenor=" + antrenor + ", durata=" + durata + ", nivelDificultate=" + nivelDificultate
				+ ", nrMaxParticipanti=" + nrMaxParticipanti + ", pret=" + pret + ", tipExercitiu=" + tipExercitiu
				+ "]";
	}

}
