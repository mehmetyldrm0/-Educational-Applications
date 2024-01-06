package HafızaOyunu;

import java.util.Scanner;

public class KartAppTest {
	private static Kart[][] karts = new Kart[4][4];
	
	public static void main(String [] args) {
		
		
		
		karts[0][0] = new Kart('E');
		karts[0][1] = new Kart('A');
		karts[0][2] = new Kart('B');
		karts[0][3] = new Kart('F');
		karts[1][0] = new Kart('G');
		karts[1][1] = new Kart('A');
		karts[1][2] = new Kart('D');
		karts[1][3] = new Kart('H');
		karts[2][0] = new Kart('F');
		karts[2][1] = new Kart('C');
		karts[2][2] = new Kart('D');
		karts[2][3] = new Kart('H');
		karts[3][0] = new Kart('E');
		karts[3][1] = new Kart('G');
		karts[3][2] = new Kart('B');
		karts[3][3] = new Kart('C');
		
		while( oyunBittimi() == false) {
			oyunTahtası();
			tahminEt();
		}
		
		
	}
	
	public static void tahminEt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Tahmin (i ve j değerlerini bir boşluklu girin)");
		int i1 = Integer.parseInt(scanner.nextLine());
		int j1 = Integer.parseInt(scanner.nextLine());
		
		karts[i1][j1].setTahmin(true);
		oyunTahtası();
		
		System.out.println("İkinci Tahmin (i ve j değerlerini bir boşluklu girin)");
		int i2 = Integer.parseInt(scanner.nextLine());
		int j2 = Integer.parseInt(scanner.nextLine());
		
		if(karts[i1][j1].getDeger() == karts[i2][j2].getDeger()) {
			
			karts[i2][j2].setTahmin(true);
			System.out.println("Doğru Tahmin. Tebrikler");
		}
		else {
			System.out.println("Yanlış Tahmin...");
			karts[i1][j1].setTahmin(false);
		}
		
		
	}
	public static boolean oyunBittimi()
	{
		for(int i = 0; i < karts.length; ++i) {
			System.out.println("---------------------");
			for(int j = 0; j < karts.length; ++j) {
				if(!karts[i][j].isTahmin()) {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	public static void oyunTahtası()
	{
		for(int i = 0; i <karts.length; ++i) {
			System.out.println("---------------------");
			for(int j = 0; j < karts.length; ++j) {
				if(karts[i][j].isTahmin()) {
					System.out.print(" |" + karts[i][j].getDeger() + "| ");
				}
				
				else {
					System.out.print(" | | ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
	}
}
