/**
 * 
 */
package utils.clazz;

import static utils.text_utils.StringUtils.replaceSpacesWithUnderScore;
import static java.lang.Character.isUpperCase;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 * 
 * Get a package name in the correct format. 
 * All lower case with words separated by an underscore.
 * 
 */
public class PackageNameResolver {
	private String pckge;
	private String updatedPckge = "";
	
	public PackageNameResolver(String pckge) {
		this.pckge = pckge;
	}

	public String getPackageInCorrectFormat() {		
		if(potentialPackage()) {
			if(withSpaces()) {			
				correctSpaces();
			}else if(inPascalCase()) {
				useUpdatedPackage();
			}
		}		
		return pckge.toLowerCase();
	}
	
	private boolean potentialPackage() {
		return pckge != null && !pckge.equals("");
	}
	
	private boolean withSpaces() {
		return pckge.contains(" ");
	}
	
	private void correctSpaces() {
		pckge = replaceSpacesWithUnderScore(pckge);
	}
	
	private boolean inPascalCase() {
		boolean res = false;
		char c;
		for(int idx = 0; idx < pckge.length(); idx++) {
			c = pckge.charAt(idx);
			if(isUpperCase(c) && notFirstChar(idx)) {
				updatedPckge += "_" + c;
				res = true;
			}else {
				updatedPckge += c;
			}
		}
		return res;
	}
	
	private boolean notFirstChar(int idx) {
		return idx > 0;
	}
	
	private void useUpdatedPackage() {
		pckge = updatedPckge;
	}

}
