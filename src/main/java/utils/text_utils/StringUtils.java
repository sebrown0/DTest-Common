/**
 * 
 */
package utils.text_utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Steve Brown
 *
 */
public class StringUtils {
	public static String capitiliseFirstChar(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
	}
	public static String getValueAt(String s, int pos, String delimitter) {
		String[] elements = s.split(delimitter);
		return elements[pos].replace("'", "");
	}
	public static String removeLastChar(String s) {		
		if(s != null && s.length() > 1) {
			return s.substring(0, s.length()-1);
		}else {
			return s;
		}		
	}
	public static String firstCharToLower(String s) {
		if(s != null && s.length() > 1) {
			return  s.substring(0, 1).toLowerCase() + s.substring(1, s.length());
		}else {
			return s;
		}		
	}
	public static String capitaliseFirstChar(String word) {
		if(word != null) {
			String s = word.substring(0, 1);
			return s.toUpperCase() + word.substring(1, word.length());	
		}else {
			return "";
		}
		
	}
	
	public static String removeTrailingComma(String str) {
		String res = "";
		int toPos = -1;
		if(str != null && str.length() > 0) {
			int strLen = str.length()-1;
			int idx = strLen;
			while(idx >= 0) {
				toPos = idx;
				if(str.charAt(idx) == ',') {
					res = str.substring(0, toPos);
					break;
				}
				idx--;
			}
		}
		return (toPos > 0) ? res : str;
	}
	
	public static String replaceFwdSlashes(String str, String with) {
		String s=null;
		if(str != null) {
			s = str.replace("/", with);
		}
		return s;
	}
	
	public static String replaceDots(String str, String with) {
		String s = str.replaceAll("\\.", with); 
		return s;
	}

	public static String asCamelCase(String str) {
		String res = "";
		if(str != null && str.length() > 0) {
			String firstChar = str.substring(0, 1).toLowerCase();
			res = firstChar + str.substring(1, str.length());
		} 
		return res;
	}
	
	public static String asPascalCase(String str) {
		String res = "";
		if(str != null && str.length() > 0) {
			String firstChar = str.substring(0, 1).toUpperCase();
			res = firstChar + str.substring(1, str.length());
		} 
		return res;
	}
	
	public static String removeUnderScoresAndAsPascalCase(String str) {
		String res = "";
		if(str != null && str.length() > 0) {
			String [] parts = str.split("_");
			if(parts != null) {
				for (String s : parts) {					
					res += asPascalCase(s);
				}
			}			
		} 
		return res;
	}
	
	public static String replaceSpacesWithUnderScoreAndInLower(String str) {
		if(str != null) {
			return str.replace(" ", "_").toLowerCase();
		}
		return str;
	}
	
	public static String replaceSpacesWithUnderScore(String str) {
		if(str != null) {
			return str.replace(" ", "_");
		}
		return str;
	}
	
	public static String removeSpacesAndAsPascalCase(String str) {
		return replaceTokenWithCharSpaceAndAsPascalCase(str, " ", "").trim();
	}
	
	public static String replaceUnderScoresWithSpaceAndAsPascalCase(String str) {
		return replaceTokenWithCharSpaceAndAsPascalCase(str, "_", " ").trim();
	}
	
	public static String replaceTokenWithCharSpaceAndAsPascalCase(String str, String token, String chr) {
		String res = "";
		if(str != null && str.length() > 0) {
			String [] parts = str.split(token);
			if(parts != null) {
				for (String s : parts) {					
					res += chr + asPascalCase(s);
				}
			}			
		} 
		return res.trim();
	}
	
	public static List<String> getListFromString(String str, String separator) {
		List<String> res = null;
		if(str != null) {
			res = Arrays.asList(str.split(separator));
		}
		return res;
	}	

}
