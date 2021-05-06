package tacu.mihaela.g1088.factory;

public class CinemaFactory {
	
	public Bilet generareBilet(TipBilet tipBilet) throws Exception{
		switch (tipBilet) {
		case biletStandard:
			return new BiletStandard();
		case biletPremium:
			return new BiletPremium();
		case biletVip:
			return new BiletVip();
		default:
			throw new Exception("Generare eronata. Tip bilet neidentificat.");
		}
		
	}

}
