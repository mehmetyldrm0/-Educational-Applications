package Beyblade;

import java.util.Scanner;

public class BeybladeTest {
	public static void main(String [] arga) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Beyblade Programýna Hoþgeldiniz");
		System.out.println("Çýkýþ için q'ya basýn");
		
		while(true) {
			System.out.println("Hangi Beyblade'i üretmek istiyorsun");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor");
				break;
			}
			
			else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				
				BeybladeApp beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("Lütfen geçerli bir beyblade ismi girin");
				}
				
				else {
					beyblade.bilgileriGoster();
					beyblade.saldir();
					beyblade.kutsalCanavarOrtayaCikar();
				}
			}
		}
	}
}
