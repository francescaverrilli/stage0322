package classeAstratta;

public class Macchina extends Veicolo {

	@Override
	void muovi() {
		// TODO Auto-generated method stub
		System.out.println("La macchina cammina veloce");
	}

	@Override
	void frena() {
		// TODO Auto-generated method stub
		System.out.println("La macchina frena forte");
		
	}

}
