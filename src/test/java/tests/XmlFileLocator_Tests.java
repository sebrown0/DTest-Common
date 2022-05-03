package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.file.FilePathLocator;

class XmlFileLocator_Tests {

	@Test
	void test() {
		FilePathLocator locator = new FilePathLocator();
		assertEquals(
				"C:\\Users\\SteveBrown\\eclipse-workspace\\2021\\DTestCommon\\src\\test\\resources\\xml\\site_map.xml", 
				locator.getPathToFileIgnoringTargetDir(
						this.getClass().getProtectionDomain().getCodeSource().getLocation(), 
						"site_map.xml").get());
	}

}
