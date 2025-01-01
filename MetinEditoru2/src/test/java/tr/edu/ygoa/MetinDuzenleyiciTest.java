package tr.edu.ygoa;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

import java.security.PublicKey;

public class MetinDuzenleyiciTest {
	
	//odev:	
	// Test 1	
	@Test
	public void Test_1_harfleriBuyult() {
		String metin = "bu dersin adı yazılım geliştirme ortam araçlarıdır.";
		String beklenenSonuc = "Bu dersin adı yazılım geliştirme ortam araçlarıdır.";
		String gercekSonuc = StringUtils.capitalize(metin);	
		assertEquals(beklenenSonuc, gercekSonuc);
			
	}
	
	// Test 2	
	@Test
	public void Test_2_harfleriBuyult() {
		String metin = " ";
		String beklenenSonuc = " ";
		String gercekSonuc = StringUtils.capitalize(metin);	
		
		assertEquals(beklenenSonuc, gercekSonuc);
	}
	
	// Test 3	
	@Test
	public void Test_3_harfleriBuyult() {
		String metin = "Bu Dersin Adı Yazılım Geliştirme Ortam Araçlarıdır.";
		String beklenenSonuc = "Bu Dersin Adı Yazılım Geliştirme Ortam Araçlarıdır.";
		String gercekSonuc = StringUtils.capitalize(metin);	
		
		assertEquals(beklenenSonuc, gercekSonuc);
	}
	
	
	/*
	@Test
	public void testboslukTemizle () {
		
		//bu testler 3 aşamada yapılır
		
		//GIVEN - Ön koşullar
		String orjinal = "Y A Z I L I M";
		
		//WHEN - Bu aksiyon gerçekleştiğinde
		String sonucString = StringUtils.deleteWhitespace("Y A Z I L I M");
		
		//THEN - Bunlar olmalı
		assertEquals("Beklenmedik sonuc!","YAZILIM",sonucString);
		/*
		if(!sonucString.equalsIgnoreCase("YAZILIM")) {
			throw new Error("Hata!");
		}
		
		}
	
	 @Test
	 public void kisaltVeBuyut_test1() {
	    	String orjinal = "YAZILIM TESTI VE ORTAM ARACLARI";
	    	String sonuc = MetinDuzenleyici.kisaltVeBuyut(orjinal);
	    	assertEquals("YAZILIM OR. ARACLARI", sonuc);
	 }
	 
	 */

}
