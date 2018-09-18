package test;

import org.junit.Test;

import core.function.TranslateRomansCodeFunction;

public class RomansTranslateJunitTest {

	@Test
	public void testGetRomansCode() {
		String romansCode = new TranslateRomansCodeFunction().getRomansCode(3201);
		System.out.println("translate result is:"+romansCode);
	}

}
