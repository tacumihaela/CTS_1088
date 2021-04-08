package assignment;

public class Cont {
	double valoareImprumut;
	double rata;
	int zileActiv;
	Account tipCont;

	public Cont(double valoareImprumut, double rata, Account tipCont) throws Exception {
		if (valoareImprumut < 0)
			throw new Exception();
		else {
			this.valoareImprumut = valoareImprumut;
		}
		this.rata = rata;
		this.tipCont = tipCont;
	}

	public double getValoareImprumut() {
		return this.valoareImprumut;
	}

	public double getRata() {
		return this.rata;
	}

	public double getRataLunara() {
		return this.valoareImprumut * this.rata;
	}

	public void setValoare(double valoareImprumut) throws Exception {
		if (valoareImprumut < 0)
			throw new Exception();
		else {
			this.valoareImprumut = valoareImprumut;
		}
	}

	@Override
	public String toString() {
		return "Loan: " + this.valoareImprumut + "; rate: " + this.rata + "; days active:" + zileActiv + "; Type: "
				+ tipCont + ";";
	}

	public static double calculeazaComisionTotal(Cont[] conturi) {
		Cont cont;
		double comisionTotal = 0.0;
		for (int i = 0; i < conturi.length; i++) {
			cont = conturi[i];
			if (cont.tipCont == Account.PREMIUM || cont.tipCont == Account.SUPER_PREMIUM)
				comisionTotal += 0.0125
						* (cont.valoareImprumut * Math.pow(cont.rata, (cont.zileActiv / 365)) - cont.valoareImprumut);
		}
		return comisionTotal;
	}
}
