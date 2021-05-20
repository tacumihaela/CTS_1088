package ro.ase.csie.cts.h1088.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {

	List<InerfataStatusConexiuneServer> module = new ArrayList<>();

	public void register(InerfataStatusConexiuneServer modul) {
		this.module.add(modul);
	}

	public void unregistred(InerfataStatusConexiuneServer modul) {
		this.module.remove(modul);
	}

	public void detectieSchimbareStareConexiune(StareConexiune stare) {
		if (stare == StareConexiune.ACTIVA) {
			for (InerfataStatusConexiuneServer modul : module) {
				modul.conexiuneActiva();
			}
		}
		if (stare == StareConexiune.INACTIVA) {
			for (InerfataStatusConexiuneServer modul : module) {
				modul.conexiuneIntrerupta();
			}
		}
	}
}
