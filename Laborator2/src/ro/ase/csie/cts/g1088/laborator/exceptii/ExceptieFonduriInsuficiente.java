package ro.ase.csie.cts.g1088.laborator.exceptii;

public class ExceptieFonduriInsuficiente extends Exception {

	public ExceptieFonduriInsuficiente(String mesaj) {
		super(mesaj); //super - apelam constr din clasa de baza
	}
	//daca definim un const, cel default nu mai exista, de aceea il definim mai jos
	public ExceptieFonduriInsuficiente() {
		
	}
}
