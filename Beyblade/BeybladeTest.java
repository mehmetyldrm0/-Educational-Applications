package Beyblade;

import java.util.Scanner;

public class BeybladeTest {
	public static void main(String [] arga) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Beyblade Program�na Ho�geldiniz");
		System.out.println("��k�� i�in q'ya bas�n");
		
		while(true) {
			System.out.println("Hangi Beyblade'i �retmek istiyorsun");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor");
				break;
			}
			
			else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				
				BeybladeApp beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("L�tfen ge�erli bir beyblade ismi girin");
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
