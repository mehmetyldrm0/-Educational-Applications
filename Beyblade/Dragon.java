package Beyblade;

public class Dragon extends BeybladeApp {
	private String kutsalCanavar;
	private String gizliYetenek;
	
	public Dragon(String beybladeci, int donusHýzý, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusHýzý, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal canavar Adý : " + kutsalCanavar);
		System.out.println("Gizli Yetenek : " + gizliYetenek);
		
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ý ortaya çýkarýyor...");
		System.out.println(getBeybladeci() + " ýn Saldýrýsý : Hayalet Kasýrgasý");
	}
	
	
	
}
