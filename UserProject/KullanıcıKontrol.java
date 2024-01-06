package UserProject;

public class KullanýcýKontrol {
	private  IUserCheckService iUserCheckService;
	
	
	public KullanýcýKontrol(IUserCheckService iUserCheckService) {
		
		this.iUserCheckService = iUserCheckService;
	}


	public void giris(User user) {
		
		
		if(iUserCheckService.checkUser(user)) {
			System.out.println("Kullanýcý Kaydý Oluþturuldu: " + user.getName());
		}
		
		else {
			System.out.println("Kullanýcý kaydý oluþturulmadý");
		}
	}
}
