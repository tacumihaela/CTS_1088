package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {


	String ip;
	String denumire;
	
	//versiune eager
	//private static Conexiune conexiune = new ConexiuneBD("10.0.0.1","cts");
	
	private static ConexiuneBD conexiune = null;
	
	private ConexiuneBD() {
		
	}
	
	private ConexiuneBD(String ip, String denumire) {
		System.out.println("apel constuctor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
	//versiune lazy
	public static synchronized ConexiuneBD getConexiune() { //DACA nu e static nu putem apela
		if(conexiune == null) {
			//datele se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1","cts");
		}
		return conexiune;
	}

}
