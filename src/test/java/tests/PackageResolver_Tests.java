package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.clazz.PackageNameResolver;

class PackageResolver_Tests {

	@Test
	void test_package_withUnderScores_() {
		PackageNameResolver resolver = new PackageNameResolver("Employee_Others");
		assertEquals("employee_others", resolver.getPackageInCorrectFormat());
	}
	
	@Test
	void test_package_withUnderScores() {
		PackageNameResolver resolver = new PackageNameResolver("a_package");
		assertEquals("a_package", resolver.getPackageInCorrectFormat());
	}
	
	@Test
	void test_package_with_spaces() {
		PackageNameResolver resolver = new PackageNameResolver("a package");
		assertEquals("a_package", resolver.getPackageInCorrectFormat());
	}

	@Test
	void test_package_with_spacesAndMixedChars() {
		PackageNameResolver resolver = new PackageNameResolver("a PacKage");
		assertEquals("a_package", resolver.getPackageInCorrectFormat());
	}

	@Test
	void test_package_with_spacesAndUnderScores() {
		PackageNameResolver resolver = new PackageNameResolver("a complex_PacKage");
		assertEquals("a_complex_package", resolver.getPackageInCorrectFormat());
	}
	
	@Test
	void test_package_inPascalCase() {
		PackageNameResolver resolver = new PackageNameResolver("PascalCase");
		assertEquals("pascal_case", resolver.getPackageInCorrectFormat());
	}

}
