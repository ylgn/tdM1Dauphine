package TestExo3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Exercice3.Parser;

public class TestFonctionParse {

	@Test
	public void testTab() {
		String[] chaineDeTest = {"Afghanistan","AF","AFG","004"};
		char delemiter = ';';
		Parser p = new Parser();
		String strToTest = "Afghanistan;AF;AFG;004";
		assertEquals(strToTest, p.concatenationTabAvecChar(chaineDeTest, delemiter));
		
		
	}
	
	@Test
	public void testString() {
		String[]chaineDeBase = {"Afghanistan","AF","AFG","004"};
		String strToTest = "Afghanistan;AF;AFG;004";
		char delemiter = ';';
		Parser p = new Parser();
		String[] chaineDeTest = p.concatenationStringAvecChar(strToTest, delemiter);
		for (int i = 0; i < chaineDeTest.length; i++) {
			assertTrue(chaineDeTest[i].equals(chaineDeBase[i]));
		}
	}

}
