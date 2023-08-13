package com.sevilay.entity;

import java.util.ArrayList;
import java.util.List;

public class Kitaplik extends Kitap implements IGoruntule {

	public Kitaplik(String baslik, String yazar, String isbn, int yayinYili) {
		super(baslik, yazar, isbn, yayinYili);
		this.kitapListesi = new ArrayList<>();
	}

//List sıralı bir veri kümesini saklamak için kullanılır.
//<Kitap> listeye eklenecek eleman türünü belirtir.Yani bu liste Kitap nesnelerini içerecektir.	
	private List<Kitap> kitapListesi;

	public void kitapEkle(Kitap kitap) {
		kitapListesi.add(kitap);

	}

	public void kitapSil(Kitap kitap) {
		kitapListesi.remove(kitap);
	}

	public Kitap kitapAra(String baslik) {
		for (Kitap kitap : kitapListesi) {
			if (kitap.getBaslik().equalsIgnoreCase(baslik)) {
				return kitap;
			}
		}
		return null;
	}

	public void kitaplariGoster(IGoruntule goruntule) {
		for (Kitap kitap : kitapListesi) {
			goruntule.goster(kitap);
		}

	}

	@Override
	public void goster(Kitap kitap) {
		// TODO Auto-generated method stub

	}

}
