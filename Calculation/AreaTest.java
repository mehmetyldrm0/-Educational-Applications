package Calculation;

import java.util.ArrayList;

public class AreaTest {
  public static void main(String args[]) {
	
	  String string = Integer.toString(3);
	  
	  String string2 = string;
	  System.out.println(string + 2);
	  
//		ArrayList<int> arrayList = new ArrayList<int>(); // bildirilen tür bir sýnýfý temsil etmesi gerekir int bir sýnýf olmadýðýnda error oluþturur
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); 
			
		
			for(int i = 0; i < 10; ++i) {
				arrayList1.add(Integer.valueOf(i * 4)); //  Autoboxing burda kutulama iþlemi yapýlýyor yani i deðeri 4 ile çarpýlýp ýnteger sýnýfýna kutulayp array list oluþtur
			}
			
			for(int i = 0; i < 10; ++i) {
				System.out.println(arrayList1.get(i).intValue()); // Unboxing yapýlýyor liste içerisnde int deðeri alýnýyor kutudan çýkartýlýyor
			}
			
			// javada bu iþlem otomatik olarak yapýlýyor
			
			for(int i = 0; i < 10; ++i) {
				arrayList1.add(i*4); //Integer.valueOf(i * 4
			}
			
			for(int i = 0; i < 10; ++i) {
				System.out.println(arrayList1.get(i)); //arrayList1.get(i).intValue()
			}
	  
  }
}
