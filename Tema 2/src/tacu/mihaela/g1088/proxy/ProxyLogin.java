package tacu.mihaela.g1088.proxy;

import java.util.HashMap;
import java.util.Map;


public class ProxyLogin implements InterfataLogin{
	InterfataLogin modulOficial;
	public static int NR_MAXIM = 3;
	Map<String, Integer> utilizatori = new HashMap<>();

	public ProxyLogin(InterfataLogin modulOficial) {
		super();
		this.modulOficial = modulOficial;
	}

	@Override
	public boolean login(String utilizator, String parola) {
		Integer nrIncercari = utilizatori.get(utilizator);
		if (nrIncercari == null) {
			utilizatori.put(utilizator, 0);
			nrIncercari = 0;
		}
		if(nrIncercari >= NR_MAXIM) {
			return false;
		}
		
		if(modulOficial.login(utilizator, parola)) {
			utilizatori.put(utilizator, 0);
			return true;
		}else {
			nrIncercari += 1;
			utilizatori.put(parola, nrIncercari);
			if(nrIncercari == NR_MAXIM) {
				System.out.println("Blocare cont");
			}
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return modulOficial.verificaStatusServer();
	}
}
