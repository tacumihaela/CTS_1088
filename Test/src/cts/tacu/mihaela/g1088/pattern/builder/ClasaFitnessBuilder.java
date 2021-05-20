package cts.tacu.mihaela.g1088.pattern.builder;

public class ClasaFitnessBuilder implements IBuilder {

	private ClasaFitness curs;

	public ClasaFitnessBuilder() {
		curs = new ClasaFitness();
	}

	public ClasaFitnessBuilder setAntrenor(String antrenor) {
		curs.setAntrenor(antrenor);
		return this;
	}

	public ClasaFitnessBuilder setDurata(int durata) {
		curs.setDurata(durata);
		return this;
	}

	public ClasaFitnessBuilder setNivelDificultate(String nivelDificultate) {
		curs.setNivelDificultate(nivelDificultate);
		return this;
	}

	public ClasaFitnessBuilder setNrMaxParticipanti(int nrMaxParticipanti) {
		curs.setNrMaxParticipanti(nrMaxParticipanti);
		return this;
	}

	public ClasaFitnessBuilder setPret(double pret) {
		curs.setPret(pret);
		return this;
	}

	public ClasaFitnessBuilder setTipExercitiu(Exercitii tipExercitiu) {
		curs.setTipExercitiu(tipExercitiu);
		return this;
	}

	@Override
	public ClasaFitness build() {
		return curs;
	}

}
