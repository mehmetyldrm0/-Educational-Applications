package Beyblade;

public class Drayga extends BeybladeApp {
	private String kutsalCanavar;

	public Drayga(String beybladeci, int donusH�z�, int saldiriGucu, String kutsalCanavar) {
		
		super(beybladeci, donusH�z�, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " � ortaya ��kar�yor...");
		System.out.println(getBeybladeci() + " �n Sald�r�s� : Kaplan Pen�esi");
	}
	
	
	
}
