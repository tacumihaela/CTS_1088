package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {

	// default = public la nivel de pachet

	int totalOreJucate;
	String nume;
	int clasaJucator;

	InterfataStrategieMarketing strategieMarketing = null;

	public Jucator(int totalOreJucate, String nume, int clasaJucator) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.clasaJucator = clasaJucator;
	}

	public int getTotalOreJucate() {
		return totalOreJucate;
	}

	public void setTotalOreJucate(int totalOreJucate) {
		this.totalOreJucate = totalOreJucate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getClasaJucator() {
		return clasaJucator;
	}

	public void setClasaJucator(int clasaJucator) {
		this.clasaJucator = clasaJucator;
	}

	public InterfataStrategieMarketing getStrategieMarketing() {
		return strategieMarketing;
	}

	public void setStrategieMarketing(InterfataStrategieMarketing strategieMarketing) {
		this.strategieMarketing = strategieMarketing;
	}

	public void acordaPuncteBonus() {
		if (this.strategieMarketing != null) {
			this.strategieMarketing.aplicaStrategieBonus(this);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
