package com.sevilay.entity;

public class KonsolaYazdirma implements IGoruntule {

	@Override
	public void goster(Kitap kitap) {

		System.out.println("Kitabın Başlığı: " + kitap.getBaslik());
		System.out.println("Kitabın Yazarı: " + kitap.getYazar());
		System.out.println("ISBN Numarası: " + kitap.getIsbn());
		System.out.println("Yayın yılı: " + kitap.getYayinYili());
		System.out.println();

	}

}
