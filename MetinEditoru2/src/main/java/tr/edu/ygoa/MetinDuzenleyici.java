package tr.edu.ygoa;

import org.apache.commons.lang3.StringUtils;

public final class MetinDuzenleyici {
	
	//odev:
	public static String harfleriBuyult(String metin) {
		
		String sonuc = StringUtils.capitalize(metin);
		return sonuc;
	}

	/*
	public static String boslukTemizle(String orjinal) {
		return StringUtils.deleteWhitespace(orjinal);
	}
	
	public static String kisaltVeBuyut(String orjinal) {
		return StringUtils.abbreviate(orjinal, ".", 20).toUpperCase();
	}
	*/
		
	
	
}
