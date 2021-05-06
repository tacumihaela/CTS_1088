package tacu.mihaela.g1088;

import tacu.mihaela.g1088.builder.BiletBuilder;
import tacu.mihaela.g1088.factory.Bilet;
import tacu.mihaela.g1088.factory.CinemaFactory;
import tacu.mihaela.g1088.factory.TipBilet;
import tacu.mihaela.g1088.prototype.Film;
import tacu.mihaela.g1088.proxy.InterfataLogin;
import tacu.mihaela.g1088.proxy.ModulLogin;
import tacu.mihaela.g1088.proxy.ProxyLogin;
import tacu.mihaela.g1088.singletone.Cinema;

public class TestAssignment {

	public static void main(String[] args) {

		// test singleton
		Cinema cinema1 = Cinema.getInstanta("ioanaP", "123");
		Cinema cinema2 = Cinema.getInstanta("mariaG", "asd");

		System.out.println(cinema1.getUtilizator());
		System.out.println(cinema2.getUtilizator());

	}

	// test factory
	CinemaFactory cinemaFactory = new CinemaFactory();
	Bilet bilet1 = null;
	{
		try {
			bilet1 = cinemaFactory.generareBilet(TipBilet.biletStandard);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bilet1.detalii();

	

	// test builder
	/*
	 * Bilet bilet=new BiletBuilder() .setHasGustari(true).setHasRacoritoare(true)
	 * .setHasOchelari3D(true).build(); System.out.println(bilet.toString());
	 */

	// test prototype
	// Film film1 = new Film("film");

	// Film film2 = (Film) film1.clone();

	// test proxy
	InterfataLogin login = new ModulLogin("10.0.0.2");
	
	if(login.login("admin1","rootasd123"))System.out.println("Hello");

	login=new ProxyLogin(login);

	String[] parole = new String[] { "1234", "root", "admin", "root12", "root1234" };for(
	String parola:parole)
	{
		//InterfataLogin login= new ModulLogin("12.2.2");
		if (login.login("admin", parola))
			System.out.println("Am gasit parola: " + parola);
	}System.out.println("bye");

}
}
