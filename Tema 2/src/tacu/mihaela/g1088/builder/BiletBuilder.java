package tacu.mihaela.g1088.builder;

public class BiletBuilder implements Builder {

	private Bilet bilet;

	public BiletBuilder() {
		bilet = new Bilet(false, false, false);
	}

	@Override
	public Bilet build() {
		return bilet;
	}

	public BiletBuilder setHasRacoritoare(boolean hasRacoritoare) {
		this.bilet.setHasGustari(hasRacoritoare);
		return this;
	}
	public BiletBuilder setHasGustari(boolean hasGustari) {
		this.bilet.setHasGustari(hasGustari);
		return this;
	}
	public BiletBuilder setHasOchelari3D(boolean hasOchelari3D) {
		this.bilet.setHasOchelari3D(hasOchelari3D);
		return this;
	}
}
