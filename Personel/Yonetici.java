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
		super.bilgilerig�ster();
		System.out.print(" Sorumlu ki�i say�s� : " + this.sorumlu_kisi);
	}
	
	public void zamYap(int zam_miktari)
	{
		System.out.println("�al��anlara  " + zam_miktari + "tl zam yap�ld�");
	}
}
