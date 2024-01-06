package Calculation;

import java.util.ArrayList;

public class AreaTest {
  public static void main(String args[]) {
	
	  String string = Integer.toString(3);
	  
	  String string2 = string;
	  System.out.println(string + 2);
	  
//		ArrayList<int> arrayList = new ArrayList<int>(); // bildirilen t�r bir s�n�f� temsil etmesi gerekir int bir s�n�f olmad���nda error olu�turur
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); 
			
		
			for(int i = 0; i < 10; ++i) {
				arrayList1.add(Integer.valueOf(i * 4)); //  Autoboxing burda kutulama i�lemi yap�l�yor yani i de�eri 4 ile �arp�l�p �nteger s�n�f�na kutulayp array list olu�tur
			}
			
			for(int i = 0; i < 10; ++i) {
				System.out.println(arrayList1.get(i).intValue()); // Unboxing yap�l�yor liste i�erisnde int de�eri al�n�yor kutudan ��kart�l�yor
			}
			
			// javada bu i�lem otomatik olarak yap�l�yor
			
			for(int i = 0; i < 10; ++i) {
				arrayList1.add(i*4); //Integer.valueOf(i * 4
			}
			
			for(int i = 0; i < 10; ++i) {
				System.out.println(arrayList1.get(i)); //arrayList1.get(i).intValue()
			}
	  
  }
}
