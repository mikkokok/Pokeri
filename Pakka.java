package pokeri;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final public class Pakka {
	private List<Kortti> valmisPakka = new LinkedList<Kortti> ();
	protected static enum Kortinmaa {RISTI,RUUTU,HERTTA,PATA};
	
	// -- Class 
	@SuppressWarnings("serial")
	static private List<Kortti> staticvalmis52korttia = new LinkedList<Kortti> () {
		{
			for (int i=1;i<14;i++) {
				staticvalmis52korttia.add(new Kortti(i,Kortinmaa.HERTTA));
				staticvalmis52korttia.add(new Kortti(i,Kortinmaa.RISTI));
				staticvalmis52korttia.add(new Kortti(i,Kortinmaa.RUUTU));
				staticvalmis52korttia.add(new Kortti(i,Kortinmaa.PATA));
			}
		}
	};
	// --
	private Pakka() {
		Kortti test1 = new Kortti(1,Kortinmaa.HERTTA);
		Kortti test2 = new Kortti(1,Kortinmaa.HERTTA);
		if ( test1.samaMaa(test2) ) {
			
		}
		
	}

	final static private class Kortti {
			private Map<Kortinmaa,String> nameMap = new HashMap<Kortinmaa,String>();
			private Kortinmaa maa;
			private Kortti(int luku, Kortinmaa maa) {
				this.maa = maa;
				nameMap.put(Kortinmaa.HERTTA,"Hertta");
				nameMap.put(Kortinmaa.RUUTU,"Ruutu");
				nameMap.put(Kortinmaa.RISTI,"Risti");
				nameMap.put(Kortinmaa.PATA,"Pata");
			}
			public Boolean samaMaa(Kortti toinen) {
				if ( toinen.maa == this.maa) {
					return true;
				}
				return false;
			}
			public String toString() {
				return ""+nameMap.get(this.maa);
			}
	}

	public static Pakka giverandom() {
		Pakka ret = new Pakka();
		for (Kortti c: Pakka.staticvalmis52korttia) {
			ret.add(c);
		}
		return ret;
	}

	private void add(Kortti c) {
		valmisPakka.add(c);
		
	}	
}
