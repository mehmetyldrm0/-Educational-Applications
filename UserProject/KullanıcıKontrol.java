package UserProject;

public class KullanıcıKontrol {
	private  IUserCheckService iUserCheckService;
	
	
	public KullanıcıKontrol(IUserCheckService iUserCheckService) {
		
		this.iUserCheckService = iUserCheckService;
	}


	public void giris(User user) {
		
		
		if(iUserCheckService.checkUser(user)) {
			System.out.println("Kullanıcı Kaydı Oluşturuldu: " + user.getName());
		}
		
		else {
			System.out.println("Kullanıcı kaydı oluşturulmadı");
		}
	}
}
