package Personel;

public class Calisan {  // T�RET�LEN SINIFLAR B�ZLER ���N ANA SINIFI OLU�TURUYOR VE B�Z�M ���N BASECLASS DEMEKT�R
	private String isim;
	private int maas;
	private String departman;
	
	public Calisan(String isim, int maas, String departman) {
		
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void cal�s() {
		System.out.println("�al��an �al���yor...");
	}
	
	public void bilgilerig�ster() {
		
		String ftm = String.format(" �sim : %s\n Maas : %d\n Departman : %s",isim, maas, departman);
		System.out.println(ftm);
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void departman_degistir(String yeni_departman) {
		System.out.println("Departman de�i�tiriliyor...");
		this.departman = yeni_departman;
		
		System.out.println("Yeni departman : " + this.departman);
	}
	
}
