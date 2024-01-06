package Beyblade;

public class Drayga extends BeybladeApp {
	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusHýzý, int saldiriGucu, String kutsalCanavar) {
		
		super(beybladeci, donusHýzý, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adý : " + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ý ortaya çýkarýyor...");
		System.out.println(getBeybladeci() + " ýn Saldýrýsý : Kaplan Pençesi");
	}
	
	
	
}
