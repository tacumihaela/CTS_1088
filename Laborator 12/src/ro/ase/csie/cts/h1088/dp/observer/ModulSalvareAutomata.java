package ro.ase.csie.cts.h1088.dp.observer;

public class ModulSalvareAutomata implements InerfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("Salvare automata date joc");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("Afisare istoric salvari");
	}

}
