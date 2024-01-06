package Beyblade;

public class BeybladeApp {
	private String beybladeci;
	private int donusHýzý;
	private int saldiriGucu;
	
	public void bilgileriGoster()
	{
		System.out.println("Beybladci ismi : " + beybladeci);
		System.out.println("Saldýrý Gücü : " + saldiriGucu);
		System.out.println("Beybladeci Ýsmi : " + donusHýzý);
	}
	public void saldir() {
		System.out.println(getBeybladeci() + " " + saldiriGucu + " " + donusHýzý + " " + "ile saldýrýyor");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		System.out.println("bu beyblade'in kutsal canavarý bulunmuyor...");
	}
	public BeybladeApp(String beybladeci, int donusHýzý, int saldiriGucu) {
		super();
		this.beybladeci = beybladeci;
		this.donusHýzý = donusHýzý;
		this.saldiriGucu = saldiriGucu;
	}


	public String getBeybladeci() {
		return beybladeci;
	}


	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}


	public int getDonusHýzý() {
		return donusHýzý;
	}


	public void setDonusHýzý(int donusHýzý) {
		this.donusHýzý = donusHýzý;
	}


	public int getSaldiriGucu() {
		return saldiriGucu;
	}


	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	
}
