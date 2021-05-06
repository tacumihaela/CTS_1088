package tacu.mihaela.g1088.singletone;

public class Cinema {
	private String utilizator;
	private String parola;

	private static Cinema instanta = null;

	private Cinema(String utilizator, String parola) {
		super();
		this.utilizator = utilizator;
		this.parola = parola;
	}

	public String getUtilizator() {
		return utilizator;
	}

	public void setUtilizator(String utilizator) {
		this.utilizator = utilizator;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public static Cinema getInstanta(String utilizator, String parola) {
		if (instanta == null) {
			instanta = new Cinema(utilizator, parola);
		}
		return instanta;
	}

}
