package SarkıcılarApp;

import java.util.ArrayList;

public class Sarkıcılar {
	private ArrayList<String> sarkıcıListesi = new ArrayList<String>();
	
	public void sarkicilariYazdr() {
		
		System.out.println("Şarkıcı Listesinde " + sarkıcıListesi.size() + " kadar şarkıcı vardır");
		
		for(int i = 0; i < sarkıcıListesi.size(); ++i) {
			System.out.println((i + 1) + ".Şarkıcı :" + sarkıcıListesi.get(i));
		}
		
	}
	
	public void sarkiciEkle(String isim) {
		sarkıcıListesi.add(isim);
		
		System.out.println("Şarkıcı Listesi Güncellendi...");
	}
	
	public void sarkiciGuncelle(String yeniİsim, int index) {
		
		sarkıcıListesi.set(index, yeniİsim);
		System.out.println("Şarkıcı Listesi Güncellendi");
		
	}
	
	public void sarkiciSil(int index) {
		
		String name = sarkıcıListesi.get(index);
		
		sarkıcıListesi.remove(index);
		
		System.out.println(name + " isimli şarkıcı listeden silindi");
	}
	
	public void sarkiciAra(String sarkiciİsmi) {
		
		int index = sarkıcıListesi.indexOf(sarkiciİsmi);
		
		if(index >= 0) {
			System.out.println("Şarkıcı Bulundu");
			System.out.println(sarkiciİsmi + " isimli şarkıcı " + (index + 1) + ".Sırada");
		}
		else {
			System.out.println("Şarkıcı Bulunamadı...");
		}
		
	}
}
