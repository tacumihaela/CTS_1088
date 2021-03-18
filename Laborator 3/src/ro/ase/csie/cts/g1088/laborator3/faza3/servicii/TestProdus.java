package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import java.util.ArrayList;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza1.Produs;
import ro.ase.csie.cts.g1088.laborator3.faza1.TipProdus;

public class TestProdus {
	
	public static ArrayList<Object> servicii=new ArrayList<>();
	
	
	public void startup() {
		InterfataMarketing serviciiMarketing= new StrategieMarketing2021();
		InterfataValidare serviciuValidare=new ServiciuValidari();
		servicii.add(serviciuValidare);
		servicii.add(serviciiMarketing);
	}
	

	public static void main(String[] args) {
		
		Produs produs=new Produs(new StrategieMarketing2021(), new ServiciuValidari());
		
		try {
			float pretFinal=produs.getPretFinal(TipProdus.DISCOUNT, 100, 12);
			System.out.println("Pretul final este " +pretFinal);
			
			produs.setStrategieMarketing(new InterfataMarketing() {
				
				@Override
				public float getDiscountFidelitate(int vechimeClientInAni) {
				
					return 0.3f;
				}
			});
			
		   pretFinal=produs.getPretFinal(TipProdus.DISCOUNT, 100, 12);
			System.out.println("Pretul final este " +pretFinal);
			
		} catch (ExceptiePretInvalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptieVechimeClient e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}