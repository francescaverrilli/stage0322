
public class Pesce implements Preda,Predatore {

	@Override
	public void caccia() {
		System.out.println("il pescione grosso mangia abbestia");
		
	}

	@Override
	public void scappa() {
		System.out.println("il pescione piccolo muore affogato");
		
	}

}
