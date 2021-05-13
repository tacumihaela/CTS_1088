package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {


	String ip;
	String denumire;
	
	//versiune eager
	//private static Conexiune conexiune = new ConexiuneBD("10.0.0.1","cts");
	
	//un atribut static, privat, de tipul clasei ce reprezinta instanta unica
	private static ConexiuneBD conexiune = null; //obligatoriu
	
	private ConexiuneBD() {
		
	}
	
	private ConexiuneBD(String ip, String denumire) { //privat, apelabil doar din clasa
		System.out.println("apel constuctor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
	//versiune lazy
	//getInstance(); metoda publica ce da acces la instanta unica(creata la primul apel al metodei)
	public static synchronized ConexiuneBD getConexiune() { 
		if(conexiune == null) {
			//datele se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1","cts");
		}
		return conexiune;
	}

}
