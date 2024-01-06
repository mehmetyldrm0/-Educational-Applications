package GoingAbroadApp;

public class Test {
	public static void main(String [] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen Havalimanýna Hoþgeldiniz");
		System.out.println("Yurtdýþý Çýkýþ Kurallarý:");
		String sartlar = "Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor...\n"
				         + "15 TL harç bedelinizin tam olarak yatýrýlmasý gerekiyor...\n"
				         + "Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor";
		
		
		String message = "Yurtdýþý þarlarýndan hepsini saðlamanýz gerekiyor";
		System.out.println(message);
		while(true) {
			System.out.println("*********************************");
			System.out.println(sartlar);
			System.out.println("*********************************");
		
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harç bedeli kontrol ediliyor");
			Thread.sleep(3000);
			
			if(!yolcu.yutrDisiHarcýKontrol()) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("Siyasi yasak kontrol ediliyor");
			Thread.sleep(3000);
			
			if(!yolcu.siyasiYasakKontrol()) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("Vize durumu kontrol ediliyor");
			Thread.sleep(3000);
			
			if(!yolcu.vizeDurumuKontrol()) {
				System.out.println(message);
				continue;
			}
			
			System.out.println("Ýþlemleriniz Tamamlanmýþtýr.ÝYÝ YOLCULUKLAR :)");
			break;
		}
		
	}

	
}
