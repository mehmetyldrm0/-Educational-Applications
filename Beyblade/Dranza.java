package Beyblade;

public class Dranza extends BeybladeApp {
	private String kutsalCanavar;

	public Dranza(String beybladeci, int donusH�z�, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusH�z�, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " � ortaya ��kar�yor...");
		System.out.println(getBeybladeci() + " �n Sald�r�s� : Alev K�l�c�");
	}
	
	
	
	
}
