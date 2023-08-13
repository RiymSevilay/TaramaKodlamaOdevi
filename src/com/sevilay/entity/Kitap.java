package com.sevilay.entity;

/**
 * Kitap Sınıfı (Book Class): Her kitap için; başlık, yazar, ISBN numarası ve
 * yayın yılı gibi bilgileri içermelidir.
 */
public class Kitap {

	private String baslik;
	private String yazar;
	private String isbn;
	private int yayinYili;

	public Kitap(String baslik, String yazar, String isbn, int yayinYili) {

		this.baslik = baslik;
		this.yazar = yazar;
		this.isbn = isbn;
		this.yayinYili = yayinYili;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

}
