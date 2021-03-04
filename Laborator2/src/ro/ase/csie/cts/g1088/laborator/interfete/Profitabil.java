package ro.ase.csie.cts.g1088.laborator.interfete;

public interface Profitabil {
//italic - > abstracta, publica
//interfata-clasa abstracta, contine metode abstracte si atribute statice constante
//final - nu poate fi suprascrisa
	
	public static final int MAX_PROCENT_DOBANDA = 5;
	public abstract void adaugaDobanda(double procentDobanda);
}
