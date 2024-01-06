package GoingAbroadApp;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallar�{
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	
	public Yolcu() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Yat�rd���n�z Har� bedeli ");
		this.harc = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Herhangi bir siyasi yasa��n�z bulunuyor mu(Evet yada Hay�r)");
		String cevap = scanner.nextLine();
		
		if("evet".equalsIgnoreCase(cevap)) {
			this.siyasiYasak = true;
		}
		
		else {
			this.siyasiYasak = false;
		}
		
		System.out.println("Vizeniz Bulunuyor mu(Evet yada Hay�r)");
		
		String cevap2 = scanner.nextLine();
		
		if("evet".equalsIgnoreCase(cevap2)) {
			this.vizeDurumu = true;
			
		}
		
		else {
			this.vizeDurumu = false;
		}
		
		
		
	}
	@Override
	public boolean yutrDisiHarc�Kontrol() {
		
		if(this.harc < 15 ) {
			System.out.println("L�tfen yutrd��� ��k�� harc�n� tam yat�r�n...");
			return false;
		
		}
		
		else {
			System.out.println("Yurt d��� harc� tamam");
			return true;
		}
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak) {
			System.out.println("Siyasi yasa��n�z bulunuyor.Yurt d���na ��kamazs�n�z");
			return false;
		}
		
		else {
			System.out.println("Siyasi yasa��n�z bulunmuyor");
			return true;
		}
	}
	@Override
	public boolean vizeDurumuKontrol() {
		
		if(this.vizeDurumu) {
			System.out.println("Vize i�lemleri tamam");
			return true;
		}
		
		else {
			System.out.println("Vizeniz gidece�iniz �lkeye bulunmamaktad�r");
			return false;
		}
	}
}



