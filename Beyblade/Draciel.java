package Beyblade;

public class Draciel extends BeybladeApp {
	private String kutsalCanavar;

	public Draciel(String beybladeci, int donusH�z�, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusH�z�, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("Kutsal canavar Ad� : " + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " � ortaya ��kar�yor...");
		System.out.println(getBeybladeci() + " �n Sald�r�s� : Kale Savunmas�");
	}
	
	

}
