package Beyblade;

public class BeybladeApp {
	private String beybladeci;
	private int donusH�z�;
	private int saldiriGucu;
	
	public void bilgileriGoster()
	{
		System.out.println("Beybladci ismi : " + beybladeci);
		System.out.println("Sald�r� G�c� : " + saldiriGucu);
		System.out.println("Beybladeci �smi : " + donusH�z�);
	}
	public void saldir() {
		System.out.println(getBeybladeci() + " " + saldiriGucu + " " + donusH�z� + " " + "ile sald�r�yor");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		System.out.println("bu beyblade'in kutsal canavar� bulunmuyor...");
	}
	public BeybladeApp(String beybladeci, int donusH�z�, int saldiriGucu) {
		super();
		this.beybladeci = beybladeci;
		this.donusH�z� = donusH�z�;
		this.saldiriGucu = saldiriGucu;
	}


	public String getBeybladeci() {
		return beybladeci;
	}


	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}


	public int getDonusH�z�() {
		return donusH�z�;
	}


	public void setDonusH�z�(int donusH�z�) {
		this.donusH�z� = donusH�z�;
	}


	public int getSaldiriGucu() {
		return saldiriGucu;
	}


	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	
}
