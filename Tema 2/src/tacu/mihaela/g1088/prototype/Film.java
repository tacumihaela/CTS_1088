package tacu.mihaela.g1088.prototype;

import java.util.ArrayList;
import java.util.Random;

//import ro.ase.csie.cts.g1088.dp.prototype.Caracter3D;

public class Film implements Cloneable{
	String fisierFilme;
	String denumire;
	int durata;
	ArrayList<Integer> intreruperi = null;
	
	
	public Film(String fisierFilme) {
		System.out.println("Se filme din " + fisierFilme);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		intreruperi = new ArrayList<>();
		for(int i=0;i<10;i++) {
			intreruperi.add(random.nextInt(1000));
		}
		
		this.fisierFilme = fisierFilme;
		
		
	}
	
	
	  private Film() {
	  
	  }
	 

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Intreruperi film: ");
		for(int intrerupere : this.intreruperi) {
			sb.append(intreruperi + " | ");
		}
		return sb.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Film copie = new Film();
		copie.fisierFilme=this.fisierFilme;
		copie.denumire=this.denumire;
		copie.durata=this.durata;
		copie.intreruperi=(ArrayList<Integer>) this.intreruperi.clone();
		
		return copie;
	}

}
