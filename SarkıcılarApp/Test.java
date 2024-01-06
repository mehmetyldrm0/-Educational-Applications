package Sark�c�larApp;

import java.util.Scanner;

public class Test {
	private static Sark�c�lar sark�c�lar = new Sark�c�lar();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void goruntule()
	{
		sark�c�lar.sarkicilariYazdr();
	}
	
	public static void sarkiciEkle() {
		System.out.println("Eklemek �stedi�iniz �ark�c� �smi");
		String name = scanner.nextLine();
		sark�c�lar.sarkiciEkle(name);
	}
	
	public static void sarkiciGuncelle() {
		System.out.println("G�ncellemek �stedi�iniz �ark�c� s�ra Numaras�?");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("�ark�c� �smi?");
		String name = scanner.nextLine();
		sark�c�lar.sarkiciGuncelle(name, index - 1);
	}
	
	public static void sil() {
		System.out.println("Silmek �stedi�iniz �ark�c� pozisyonu");
		int index = Integer.parseInt(scanner.nextLine());
		sark�c�lar.sarkiciSil(index - 1);
	}
	
	public static void sark�c�Ara() {
		System.out.println("Aramak �stedi�iniz �ark�c� �smi");
		String name = scanner.nextLine();
		sark�c�lar.sarkiciAra(name);
 	}
	public static void main(String [] args) {
		System.out.println("\t �ark�c� Uygulamas�na Ho�geldiniz...");
		�slemlemleriBastir();
		
		boolean c�k�s = false;
		int islem;
		
		while(!c�k�s) {
			System.out.println("Bir ��lem Se�iniz:");
			
			islem = Integer.parseInt(scanner.nextLine());
			
			switch(islem) {
			case 0 : 
				�slemlemleriBastir();
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
				sark�c�Ara();
				break;
			case 6:
				c�k�s = true;
				System.out.println("Uygulamadan ��k�l�yor...");
				break;
				
			
			}
		}
		
	}
	
	public static void �slemlemleriBastir() {
		
		System.out.println("\t 0- ��lemleri G�r�nt�le");
		System.out.println("\t 1- �ark�c�lar� g�r�nt�le ");
		System.out.println("\t 2- �ark�c� Ekle");
		System.out.println("\t 3- �ark�c� G�ncelle");
		System.out.println("\t 4- �ark�c� Sil");
		System.out.println("\t 5- �ark�c� Ara");
		System.out.println("\t 6- Uygulamadan ��k");
	}
}
