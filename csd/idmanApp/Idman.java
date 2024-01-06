package csd.idmanApp;

public class Idman {
	
	private int burpee_number;
	private int pushup_number;
	private int situp_number;
	private int squat_number;
	
	public boolean idmanBittiMi()
	{
		return (burpee_number == 0) && (pushup_number == 0) && (situp_number == 0) && (squat_number == 0);
	}
	public void burpeeYap(int sayi)
	{
		if(burpee_number == 0) {
			System.out.println("Yapacak burpee kalmadı...");
		}
		
		if(burpee_number - sayi < 0)
		{
			System.out.println("Hedeflediğin burpee geçtin.Tebrikler!");
			burpee_number = 0;
			System.out.println("Kalan Burpee : " + burpee_number);
		}
		else {
			burpee_number -= sayi;
			
			System.out.println("Kalan Burpee Sayısı : " + burpee_number);
		}
			
	}
	public void pushupYap(int sayi)
	{
		if(pushup_number == 0) {
			System.out.println("Yapacak burpee kalmadı...");
		}
		
		if(pushup_number - sayi < 0)
		{
			System.out.println("Hedeflediğin burpee geçtin.Tebrikler!");
			pushup_number = 0;
			System.out.println("Kalan Pushup : " + pushup_number);
		}
		else {
			pushup_number -= sayi;
			
			System.out.println("Kalan Pushup Sayısı : " + pushup_number);
		}
			
	}
	
	public void situpYap(int sayi)
	{
		if(situp_number == 0) {
			System.out.println("Yapacak burpee kalmadı...");
		}
		
		if(situp_number - sayi < 0)
		{
			System.out.println("Hedeflediğin burpee geçtin.Tebrikler!");
			situp_number = 0;
			System.out.println("Kalan pushup : " + situp_number);
		}
		else {
			situp_number -= sayi;
			
			System.out.println("Kalan Situp Sayısı : " + situp_number);
		}
			
	}
	
	public void squatYap(int sayi)
	{
		if(squat_number == 0) {
			System.out.println("Yapacak burpee kalmadı...");
		}
		
		if(squat_number - sayi < 0)
		{
			System.out.println("Hedeflediğin burpee geçtin.Tebrikler!");
			squat_number = 0;
			System.out.println("Kalan Squat : " + squat_number);
		}
		else {
			squat_number -= sayi;
			
			System.out.println("Kalan Squat Sayısı : " + squat_number);
		}
			
	}
	public void hareketYap(String hareketTuru, int sayi)
	{
		if(hareketTuru.equals("Burpee")) {
			burpeeYap(sayi);
		}
		
		else if(hareketTuru.equals("Pushup")) {
			pushupYap(sayi);
		}
		
		else if(hareketTuru.equals("Situp")) {
			situpYap(sayi);
		}
		
		else if(hareketTuru.equals("Squat")) {
			squatYap(sayi);
		}
		
		else {
			System.out.println("Geçersiz Hareket...");
		}
	}
	public Idman(int burpee_number, int pushup_number, int situp_number, int squat_number) {
		
		this.burpee_number = burpee_number;
		this.pushup_number = pushup_number;
		this.situp_number = situp_number;
		this.squat_number = squat_number;
	}

	public int getBurpee_number() {
		return burpee_number;
	}

	public void setBurpee_number(int burpee_number) {
		this.burpee_number = burpee_number;
	}

	public int getPushup_number() {
		return pushup_number;
	}

	public void setPushup_number(int pushup_number) {
		this.pushup_number = pushup_number;
	}

	public int getSitup_number() {
		return situp_number;
	}

	public void setSitup_number(int situp_number) {
		this.situp_number = situp_number;
	}

	public int getSquat_number() {
		return squat_number;
	}

	public void setSquat_number(int squat_number) {
		this.squat_number = squat_number;
	}
	
	
	
	
	
}
