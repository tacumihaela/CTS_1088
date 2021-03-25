package ro.ase.csie.cts.g1088.dp.singleton;

public class TestSingletone {

	public static void main(String[] args) {
		//ConexiuneBD conexiune1 = new ConexiuneBD("10.0.0.1", "cts");
		//ConexiuneBD conexiune2 = new ConexiuneBD("10.0.0.1", "cts");
	
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune();
	
		
		if(conexiune1==conexiune2) {
			System.out.print("Cele 2 refer sunt identice");
			
		}else {
			System.out.print("Cele 2 refer nu sunt identice");
		}
	}
	
	ModulUI modulUI = new ModulUI();
	ModulProfil modulProfil = new ModulProfil();

}
