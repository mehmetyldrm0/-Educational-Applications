package UserProject;

public class Kullan�c�Kontrol {
	private  IUserCheckService iUserCheckService;
	
	
	public Kullan�c�Kontrol(IUserCheckService iUserCheckService) {
		
		this.iUserCheckService = iUserCheckService;
	}


	public void giris(User user) {
		
		
		if(iUserCheckService.checkUser(user)) {
			System.out.println("Kullan�c� Kayd� Olu�turuldu: " + user.getName());
		}
		
		else {
			System.out.println("Kullan�c� kayd� olu�turulmad�");
		}
	}
}
