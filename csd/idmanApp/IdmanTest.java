package csd.idmanApp;

import java.util.Scanner;

public class IdmanTest {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman Programýna Hoþgeldiniz...");
		
		System.out.println("Geçerli Hareketler...");
		System.out.println("Burpee");
		System.out.println("Pushup(Þýnav)");
		System.out.println("Situp(Mekik)");
		System.out.println("Squal");
		
		System.out.println("Bir idman oluþturun...");
		
		System.out.print("Burpee Sayýsý : ");
		int burpee = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Pushup Sayýsý : ");
		int pushup = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Situp Sayýsý : ");
		int situp = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Squat Sayýsý : ");
		int squat = Integer.parseInt(scanner.nextLine());
		
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("Ýdmanýnýz Baþliyor.....");
		
		while(idman.idmanBittiMi() == false) {
			System.out.println("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten kaç tane yapacaksýnýz ? :");
			int sayi = Integer.parseInt(scanner.nextLine());
			
			idman.hareketYap(tur, sayi);
			
		}
	}
}
