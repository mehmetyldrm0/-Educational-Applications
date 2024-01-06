package csd.idmanApp;

import java.util.Scanner;

public class IdmanTest {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Idman Program�na Ho�geldiniz...");
		
		System.out.println("Ge�erli Hareketler...");
		System.out.println("Burpee");
		System.out.println("Pushup(��nav)");
		System.out.println("Situp(Mekik)");
		System.out.println("Squal");
		
		System.out.println("Bir idman olu�turun...");
		
		System.out.print("Burpee Say�s� : ");
		int burpee = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Pushup Say�s� : ");
		int pushup = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Situp Say�s� : ");
		int situp = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Squat Say�s� : ");
		int squat = Integer.parseInt(scanner.nextLine());
		
		
		Idman idman = new Idman(burpee, pushup, situp, squat);
		
		System.out.println("�dman�n�z Ba�liyor.....");
		
		while(idman.idmanBittiMi() == false) {
			System.out.println("Hareket T�r�(Burpee,Pushup,Situp,Squat) : ");
			String tur = scanner.nextLine();
			System.out.println("Bu hareketten ka� tane yapacaks�n�z ? :");
			int sayi = Integer.parseInt(scanner.nextLine());
			
			idman.hareketYap(tur, sayi);
			
		}
	}
}
