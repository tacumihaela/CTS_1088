package cts.tacu.mihaela.g1088.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		ClasaFitness clasaFitness1=new ClasaFitnessBuilder().setDurata(66).setAntrenor("andrei").setDurata(30).setTipExercitiu(Exercitii.fandari).build();
		ClasaFitness clasaFitness2=new ClasaFitnessBuilder().setAntrenor("matei").setNrMaxParticipanti(15).setTipExercitiu(Exercitii.floatri).build();
		ClasaFitness clasaFitness3=new ClasaFitnessBuilder().setDurata(60).setAntrenor("tudor").setPret(70.7).setTipExercitiu(Exercitii.salturi).build();
		ClasaFitness clasaFitness4=new ClasaFitnessBuilder().setDurata(20).setAntrenor("ana").setPret(80.7).setTipExercitiu(Exercitii.fandari).build();
		System.out.println(clasaFitness1.toString());
		System.out.println(clasaFitness2.toString());
		System.out.println(clasaFitness3.toString());
		System.out.println(clasaFitness4.toString());

	}

}
