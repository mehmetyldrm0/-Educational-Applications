package UserProject;

public class Main {
	public static void main(String [] args) {
		
		KullanıcıKontrol kullanıcıKontrol = new KullanıcıKontrol(new KullanıcıYasSorgula());
		
		kullanıcıKontrol.giris(new User(1, "Mehmet", 17));
	}
}
