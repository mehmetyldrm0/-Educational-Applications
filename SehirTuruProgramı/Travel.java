package SehirTuruProgram�;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Travel {
	public static void main(String [] args) {
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eski�ehir");
		sehirler.add("Afyon");
		sehirleriTurla(sehirler);
	}
	
	public static void islemleriBastir() {
		System.out.println("0 - ��lemleri G�r�nt�le");
		System.out.println("1 - Bir sonraki �ehre git");
		System.out.println("2 - Bir �nceki �ehre git");
		System.out.println("3 - Uygulamadan ��k");
	}
	public static void sehirleriTurla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator = sehirler.listIterator();
		
		int islem;
		
		islemleriBastir();
		
		Scanner scanner = new Scanner(System.in);
		
		if(!iterator.hasNext()) {
			System.out.println("Herhangi Bir �ehir Bulunmuyor ");
		}
		
		boolean c�k�� = false;
		boolean ileri = true;
		
		while(!c�k��) {
			System.out.println("Bir i�lem se�iniz ");
			islem = scanner.nextInt();
			
			switch (islem) {
				case 0:
					islemleriBastir();
					break;
				case 1:
					if(!ileri) {
						if(iterator.hasNext()) {
							iterator.next();
						}
						
						ileri = true;
					}
					if(iterator.hasNext()) {
						
						System.out.println("�ehre Gidiliyor : " + iterator.next());
					}
					
					else {
						System.out.println("Gidilecek �ehir Kalmad�");
						ileri = true;
					}
					break;
				case 2:
					
					if(ileri) {
						if(iterator.hasPrevious()) {
							iterator.previous();
							
						}
						ileri = false;
					}
						
						
					if(iterator.hasPrevious()) { // hasPrevious() bir �ncesi varm� diye bak�l�r
						System.out.println("�ehre gidiliyor : " + iterator.previous()); // previous() ile �nceki �ehre gitmek istiyorum demek istiyoruz
						
					}
					
					else {
						System.out.println("�ehir Turu Ba�lad�...");
					}
					break;
				case 3:
					c�k�� = true;
					System.out.println("Uygulamadan ��k�l�yor");
					break;
			
			}
		
		
		}
		
	}
}