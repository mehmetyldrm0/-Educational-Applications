package Personel;

public class Yonetici extends Calisan { // SUBCLASS

	private int sorumlu_kisi;
	
	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi)
	{
		super(isim, maas, departman);
		
		this.sorumlu_kisi = sorumlu_kisi;
	}
	
	public void bilgilerigoster()
	{
		super.bilgilerigöster();
		System.out.print(" Sorumlu kiþi sayýsý : " + this.sorumlu_kisi);
	}
	
	public void zamYap(int zam_miktari)
	{
		System.out.println("çalýþanlara  " + zam_miktari + "tl zam yapýldý");
	}
}
