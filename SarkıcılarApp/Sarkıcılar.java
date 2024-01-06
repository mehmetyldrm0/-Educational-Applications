package Sark�c�larApp;

import java.util.ArrayList;

public class Sark�c�lar {
	private ArrayList<String> sark�c�Listesi = new ArrayList<String>();
	
	public void sarkicilariYazdr() {
		
		System.out.println("�ark�c� Listesinde " + sark�c�Listesi.size() + " kadar �ark�c� vard�r");
		
		for(int i = 0; i < sark�c�Listesi.size(); ++i) {
			System.out.println((i + 1) + ".�ark�c� :" + sark�c�Listesi.get(i));
		}
		
	}
	
	public void sarkiciEkle(String isim) {
		sark�c�Listesi.add(isim);
		
		System.out.println("�ark�c� Listesi G�ncellendi...");
	}
	
	public void sarkiciGuncelle(String yeni�sim, int index) {
		
		sark�c�Listesi.set(index, yeni�sim);
		System.out.println("�ark�c� Listesi G�ncellendi");
		
	}
	
	public void sarkiciSil(int index) {
		
		String name = sark�c�Listesi.get(index);
		
		sark�c�Listesi.remove(index);
		
		System.out.println(name + " isimli �ark�c� listeden silindi");
	}
	
	public void sarkiciAra(String sarkici�smi) {
		
		int index = sark�c�Listesi.indexOf(sarkici�smi);
		
		if(index >= 0) {
			System.out.println("�ark�c� Bulundu");
			System.out.println(sarkici�smi + " isimli �ark�c� " + (index + 1) + ".S�rada");
		}
		else {
			System.out.println("�ark�c� Bulunamad�...");
		}
		
	}
}
