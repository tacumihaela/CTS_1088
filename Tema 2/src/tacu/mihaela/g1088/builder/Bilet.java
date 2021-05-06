package tacu.mihaela.g1088.builder;

public class Bilet {
	private boolean hasRacoritoare;
	private boolean hasGustari;
	private boolean hasOchelari3D;
	
	public Bilet(boolean hasRacoritoare, boolean hasGustari, boolean ochelari3d) {
		this.hasRacoritoare = hasRacoritoare;
		this.hasGustari = hasGustari;
		hasOchelari3D = ochelari3d;
	}
	public boolean isHasRacoritoare() {
		return hasRacoritoare;
	}
	public void setHasRacoritoare(boolean hasRacoritoare) {
		this.hasRacoritoare = hasRacoritoare;
	}
	public boolean isHasGustari() {
		return hasGustari;
	}
	public void setHasGustari(boolean hasGustari) {
		this.hasGustari = hasGustari;
	}
	public boolean isOchelari3D() {
		return hasOchelari3D;
	}
	public void setHasOchelari3D(boolean ochelari3d) {
		hasOchelari3D = ochelari3d;
	}
	@Override
	public String toString() {
		return "Bilet [hasRacoritoare=" + hasRacoritoare + ", hasGustari=" + hasGustari + ", ochelari3D=" + hasOchelari3D
				+ "]";
	}
	
	
}
