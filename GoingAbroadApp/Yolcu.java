package GoingAbroadApp;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallarý{
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	
	public Yolcu() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Yatýrdýðýnýz Harç bedeli ");
		this.harc = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Herhangi bir siyasi yasaðýnýz bulunuyor mu(Evet yada Hayýr)");
		String cevap = scanner.nextLine();
		
		if("evet".equalsIgnoreCase(cevap)) {
			this.siyasiYasak = true;
		}
		
		else {
			this.siyasiYasak = false;
		}
		
		System.out.println("Vizeniz Bulunuyor mu(Evet yada Hayýr)");
		
		String cevap2 = scanner.nextLine();
		
		if("evet".equalsIgnoreCase(cevap2)) {
			this.vizeDurumu = true;
			
		}
		
		else {
			this.vizeDurumu = false;
		}
		
		
		
	}
	@Override
	public boolean yutrDisiHarcýKontrol() {
		
		if(this.harc < 15 ) {
			System.out.println("Lütfen yutrdýþý çýkýþ harcýný tam yatýrýn...");
			return false;
		
		}
		
		else {
			System.out.println("Yurt dýþý harcý tamam");
			return true;
		}
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak) {
			System.out.println("Siyasi yasaðýnýz bulunuyor.Yurt dýþýna çýkamazsýnýz");
			return false;
		}
		
		else {
			System.out.println("Siyasi yasaðýnýz bulunmuyor");
			return true;
		}
	}
	@Override
	public boolean vizeDurumuKontrol() {
		
		if(this.vizeDurumu) {
			System.out.println("Vize iþlemleri tamam");
			return true;
		}
		
		else {
			System.out.println("Vizeniz gideceðiniz ülkeye bulunmamaktadýr");
			return false;
		}
	}
}



