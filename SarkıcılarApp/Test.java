package SarkýcýlarApp;

import java.util.Scanner;

public class Test {
	private static Sarkýcýlar sarkýcýlar = new Sarkýcýlar();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void goruntule()
	{
		sarkýcýlar.sarkicilariYazdr();
	}
	
	public static void sarkiciEkle() {
		System.out.println("Eklemek Ýstediðiniz Þarkýcý Ýsmi");
		String name = scanner.nextLine();
		sarkýcýlar.sarkiciEkle(name);
	}
	
	public static void sarkiciGuncelle() {
		System.out.println("Güncellemek Ýstediðiniz Þarkýcý sýra Numarasý?");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("Þarkýcý Ýsmi?");
		String name = scanner.nextLine();
		sarkýcýlar.sarkiciGuncelle(name, index - 1);
	}
	
	public static void sil() {
		System.out.println("Silmek Ýstediðiniz Þarkýcý pozisyonu");
		int index = Integer.parseInt(scanner.nextLine());
		sarkýcýlar.sarkiciSil(index - 1);
	}
	
	public static void sarkýcýAra() {
		System.out.println("Aramak Ýstediðiniz Þarkýcý Ýsmi");
		String name = scanner.nextLine();
		sarkýcýlar.sarkiciAra(name);
 	}
	public static void main(String [] args) {
		System.out.println("\t Þarkýcý Uygulamasýna Hoþgeldiniz...");
		ÝslemlemleriBastir();
		
		boolean cýkýs = false;
		int islem;
		
		while(!cýkýs) {
			System.out.println("Bir Ýþlem Seçiniz:");
			
			islem = Integer.parseInt(scanner.nextLine());
			
			switch(islem) {
			case 0 : 
				ÝslemlemleriBastir();
				break;
			case 1 :
				goruntule();
				break;
			case 2 :
				sarkiciEkle();
				break;
			case 3 :
				sarkiciGuncelle();
				break;
			case 4:
				sil();
				break;
			case 5 :
				sarkýcýAra();
				break;
			case 6:
				cýkýs = true;
				System.out.println("Uygulamadan Çýkýlýyor...");
				break;
				
			
			}
		}
		
	}
	
	public static void ÝslemlemleriBastir() {
		
		System.out.println("\t 0- Ýþlemleri Görüntüle");
		System.out.println("\t 1- Þarkýcýlarý görüntüle ");
		System.out.println("\t 2- Þarkýcý Ekle");
		System.out.println("\t 3- Þarkýcý Güncelle");
		System.out.println("\t 4- Þarkýcý Sil");
		System.out.println("\t 5- Þarkýcý Ara");
		System.out.println("\t 6- Uygulamadan Çýk");
	}
}
