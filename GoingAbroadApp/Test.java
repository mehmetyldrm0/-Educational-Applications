package GoingAbroadApp;

public class Test {
	public static void main(String [] args) throws InterruptedException {
		
		System.out.println("Sabiha G�k�en Havaliman�na Ho�geldiniz");
		System.out.println("Yurtd��� ��k�� Kurallar�:");
		String sartlar = "Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor...\n"
				         + "15 TL har� bedelinizin tam olarak yat�r�lmas� gerekiyor...\n"
				         + "Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor";
		
		
		String message = "Yurtd��� �arlar�ndan hepsini sa�laman�z gerekiyor";
		System.out.println(message);
		while(true) {
			System.out.println("*********************************");
			System.out.println(sartlar);
			System.out.println("*********************************");
		
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Har� bedeli kontrol ediliyor");
			Thread.sleep(3000);
			
			if(!yolcu.yutrDisiHarc�Kontrol()) {
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
			
			System.out.println("��lemleriniz Tamamlanm��t�r.�Y� YOLCULUKLAR :)");
			break;
		}
		
	}

	
}
