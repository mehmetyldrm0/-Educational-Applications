package Beyblade;

public class Dragon extends BeybladeApp {
	private String kutsalCanavar;
	private String gizliYetenek;
	
	public Dragon(String beybladeci, int donusH�z�, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusH�z�, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal canavar Ad� : " + kutsalCanavar);
		System.out.println("Gizli Yetenek : " + gizliYetenek);
		
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " � ortaya ��kar�yor...");
		System.out.println(getBeybladeci() + " �n Sald�r�s� : Hayalet Kas�rgas�");
	}
	
	
	
}
