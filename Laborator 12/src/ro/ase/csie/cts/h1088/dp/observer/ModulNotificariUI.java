package ro.ase.csie.cts.h1088.dp.observer;

public class ModulNotificariUI implements InerfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("PopUP: Conexiune pierduta");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUP: Conexiune activa");
	}

}
