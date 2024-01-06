package Beyblade;

public class BeybladeFabrikasi {
	public BeybladeApp beybladeUret(String beybladeTuru) {
		
		if(beybladeTuru.equals("Dragon")) {
			return new Dragon("Tako", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konu�ma");
		}
		else if(beybladeTuru.equals("Dranza")) {
			return new Dranza("Kai", 600, 400, "Beyaz Kaplan");
		}
		
		else if(beybladeTuru.equals("Drayga")) {
			return new Dranza("Rei", 800, 250, "K�rm�z� Anka Ku�u");
		}
		
		else if(beybladeTuru.equals("Draciel")) {
			return new Dranza("Max", 400, 1000, "Kara Kaplumba�a");
		}
		
		else {
			return null;
		}
	
	
	}
}
