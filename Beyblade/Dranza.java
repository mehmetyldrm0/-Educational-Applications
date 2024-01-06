package Beyblade;

public class Dranza extends BeybladeApp {
	private String kutsalCanavar;

	public Dranza(String beybladeci, int donusHýzý, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusHýzý, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adý : " + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ý ortaya çýkarýyor...");
		System.out.println(getBeybladeci() + " ýn Saldýrýsý : Alev Kýlýcý");
	}
	
	
	
	
}
