package UserProject;

public class Main {
	public static void main(String [] args) {
		
		Kullan�c�Kontrol kullan�c�Kontrol = new Kullan�c�Kontrol(new Kullan�c�YasSorgula());
		
		kullan�c�Kontrol.giris(new User(1, "Mehmet", 17));
	}
}
