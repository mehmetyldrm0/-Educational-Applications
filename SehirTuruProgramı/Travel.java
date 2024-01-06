package SehirTuruProgramý;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Travel {
	public static void main(String [] args) {
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eskiþehir");
		sehirler.add("Afyon");
		sehirleriTurla(sehirler);
	}
	
	public static void islemleriBastir() {
		System.out.println("0 - Ýþlemleri Görüntüle");
		System.out.println("1 - Bir sonraki þehre git");
		System.out.println("2 - Bir önceki þehre git");
		System.out.println("3 - Uygulamadan çýk");
	}
	public static void sehirleriTurla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator = sehirler.listIterator();
		
		int islem;
		
		islemleriBastir();
		
		Scanner scanner = new Scanner(System.in);
		
		if(!iterator.hasNext()) {
			System.out.println("Herhangi Bir Þehir Bulunmuyor ");
		}
		
		boolean cýkýþ = false;
		boolean ileri = true;
		
		while(!cýkýþ) {
			System.out.println("Bir iþlem seçiniz ");
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
						
						System.out.println("Þehre Gidiliyor : " + iterator.next());
					}
					
					else {
						System.out.println("Gidilecek Þehir Kalmadý");
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
						
						
					if(iterator.hasPrevious()) { // hasPrevious() bir öncesi varmý diye bakýlýr
						System.out.println("Þehre gidiliyor : " + iterator.previous()); // previous() ile önceki þehre gitmek istiyorum demek istiyoruz
						
					}
					
					else {
						System.out.println("Þehir Turu Baþladý...");
					}
					break;
				case 3:
					cýkýþ = true;
					System.out.println("Uygulamadan Çýkýlýyor");
					break;
			
			}
		
		
		}
		
	}
}