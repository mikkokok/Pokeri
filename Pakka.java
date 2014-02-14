package pokeri;

import java.util.HashMap;
import java.util.Map;

final public class Pakka {
	protected static enum Kortinmaa {RISTI,RUUTU,HERTTA,PATA};

	
	
	private Pakka() {
		Kortti test1 = new Kortti(1,Kortinmaa.HERTTA);
		Kortti test2 = new Kortti(1,Kortinmaa.HERTTA);
		if ( test1.samaMaa(test2) ) {
			
		}
		System.out.println(""+test1.toString());
	}

	final private class Kortti {
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
}
