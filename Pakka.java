package pokeri;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

final public class Pakka {
	private LinkedList<Kortti> valmisPakka = new LinkedList<Kortti> ();
	protected static enum Kortinmaa {RISTI,RUUTU,HERTTA,PATA};

	// Staattinen 52 kortin pakka
	@SuppressWarnings("serial")
	static private LinkedList<Kortti> staticpakka = new LinkedList<Kortti> () {
		{
			for (int i=1;i<14;i++) {
				staticpakka.add(new Kortti(i,Kortinmaa.HERTTA));
				staticpakka.add(new Kortti(i,Kortinmaa.RISTI));
				staticpakka.add(new Kortti(i,Kortinmaa.RUUTU));
				staticpakka.add(new Kortti(i,Kortinmaa.PATA));
			}
		}
	};
	
	// --Staticpakka--
	// ***************************************************
	// Konstruktorit
	// Ensimmäisellä tehdään normaali 52 kortin pakka
	// Toisella tehdään pakka jossa on vain yhtä väriä
	// ***************************************************
	public Pakka() {
	
	}
	public Pakka(String maa) {
		
	}
	// ***************************************************
	// Havainnointimetodit
	// ***************************************************
	// Metodi jolla annetaan kortti pakkaoliosta. 
	// Alkuehto: Pakka pitää olla luotuna.
	public Kortti getKortti() {
		
		
		return null;
	}
	// Metodi jolla palautetaan kortti pakkaan.
	// Alkuehto: Pakka pitää olla luotuna.
	public Kortti giveKortti() {
		
		return null;
	}
	public void luePakka() {
		for (int i=0;i<52;i++) {
		System.out.println(valmisPakka.get(i));
		}
	}
	// ***************************************************
	// Muutosmetodit
	// ***************************************************
	// Metodi jolla pakka sekotetaan
	// Alkuehto: Pakka pitää olla luotuna
	public void teePakka() {
		for (int i=0;i<52;i++) {
		valmisPakka.add(staticpakka.get(i));	
		}
	}

	// *************************************************** 
	// Kortti classi jolla kortit luodaan
	// ***************************************************
	final static private class Kortti {
		private Map<Kortinmaa,String> maaMap = new HashMap<Kortinmaa,String>();
		private Kortti(int luku, Kortinmaa maa) {
			maaMap.put(Kortinmaa.HERTTA,"♥");
			maaMap.put(Kortinmaa.RUUTU,"♦");
			maaMap.put(Kortinmaa.RISTI,"♣");
			maaMap.put(Kortinmaa.PATA,"♠");
		}
	} // Kortti class
	} // Pakka class
