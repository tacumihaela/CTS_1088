package cts.tacu.mihaela.g1088.pattern.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Abonat abonat1 = new Abonat("Matei");
		Abonat abonat2 = new Abonat("Andrei");
		Abonat abonat3 = new Abonat("Corina");

		Salturi exercitiuSalt = new Salturi();
		abonat1.setTipExercitiu(exercitiuSalt);
		abonat1.startExercitiu(3);

		Flotari exercitiuFlotare = new Flotari();
		abonat2.setTipExercitiu(exercitiuFlotare);
		abonat2.startExercitiu(15);
		abonat2.setTipExercitiu(exercitiuSalt);
		abonat2.startExercitiu(12);

		Fandari exercitiuFandare = new Fandari();
		abonat3.setTipExercitiu(exercitiuFandare);
		abonat3.startExercitiu(25);
		abonat3.setTipExercitiu(exercitiuSalt);
		abonat3.startExercitiu(30);

	}

}
