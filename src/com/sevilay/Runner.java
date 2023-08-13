package com.sevilay;

import com.sevilay.entity.IGoruntule;
import com.sevilay.entity.Kitap;
import com.sevilay.entity.Kitaplik;
import com.sevilay.entity.KonsolaYazdirma;

public class Runner {

	public static void main(String[] args) {

		Kitaplik kitaplik = new Kitaplik(null, null, null, 0);
		Kitap kitap1 = new Kitap("Küçük Prens", "Antoine de Saint-Exupéry", "ISBN-10", 1943);
		Kitap kitap2 = new Kitap("Fareler ve İnsanlar", "John Steinbeck", "ISBN-11", 1937);
		Kitap kitap3 = new Kitap("Kürk Mantolu Madonna", "Sabahattin Ali", "ISBN-12", 1943);
		Kitap kitap4 = new Kitap("Tutunamayanlar", "Oğuz Atay", "ISBN-13", 1972);
		Kitap kitap5 = new Kitap("Suç ve Ceza", "Dostoyevski", "ISBN-14", 1866);
		Kitap kitap6 = new Kitap("Küçük Prens", "Antoine de Saint-Exupéry", "ISBN-15", 1943);
		Kitap kitap7 = new Kitap("Şeker Portakalı", "José Mauro de Vasconcelos", "ISBN-16", 1968);

		kitaplik.kitapEkle(kitap1);
		kitaplik.kitapEkle(kitap2);
		kitaplik.kitapEkle(kitap3);
		kitaplik.kitapEkle(kitap4);
		kitaplik.kitapEkle(kitap5);
		kitaplik.kitapEkle(kitap7);

		IGoruntule konsolaYazdirma = new KonsolaYazdirma();
		kitaplik.kitaplariGoster(konsolaYazdirma);
		konsolaYazdirma.goster(kitap2);

//Başlık ile kitap arama
		Kitap kitapBul = kitaplik.kitapAra("");
		if (kitapBul != null) {
			System.out.println("Bulunan kitap: " + kitapBul.getBaslik());
		} else {
			System.out.println("Kitap bulunamadı.");
		}

	}
}
