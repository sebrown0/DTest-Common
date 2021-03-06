/**
 * 
 */
package utils.text_utils;

import java.util.List;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 * 
 * Various ways formatting a string for a site mapped class.
 */
public class Formatter {

	public static String getVariableValue(String value, String type) {
		String ret = "";
		if(value != null) {
			if(type.contains("String")) {
				if(value.startsWith("\"")){
					ret = " = " + value;	
				}else {
					ret = " = \"" + value;					
				}				
				if(!(value.endsWith("\""))){
					ret += "\"";
				}
			}else {
				ret = " = " + value;
			}
		}
		return ret;
	}
	
	public static String getVariableValue(String value) {		
		return (value != null) ? " = " + value : "";
	}
	
	public static <T> String getNewLineIfValueExists(T value) {
		return (value != null) ? "\n" : "";
	}
	public static <T> String getValueOfStripTrailing(T value) {
		return (value != null) ? value.toString().stripTrailing() : "";
	}
	public static <T> String getValueOf(T value) {
		return (value != null) ? value.toString() : "";
	}
	public static String getValueOf(String value) {
		return (value != null) ? value : "";
	}
	public static String getValueOf(String prepend, String value) {
		return (value != null) ? prepend + value : "";
	}
	public static String trimValueOf(String value) {
		return (value != null) ? value.trim() : null;
	}	
	public static String getValuePair(String value, String valueTag) {
		return (value != null) ? valueTag + "=\"" + value + "\"" : "";
	}
	
	public static <T> String getAsCommaSeparatedList(List<T> listOfVals) {
		String ret = "";
		if(listOfVals != null) {			
			for (T t : listOfVals) {
				ret += String.format("%s, ", t.toString());				
			}
			if(listOfVals.size()>=1) { ret = ret.substring(0, ret.length()-2); }
		}
		return ret;
	}
	
	public static String getEndOfLine(String line) {		
		return (line != null && line.endsWith(";")) ? line : line + ";";
	}
	public static String capitaliseFirstChar(String word) {
		if(word != null) {
			String s = word.substring(0, 1);
			return s.toUpperCase() + word.substring(1, word.length());	
		}else {
			return "";
		}
		
	}
}
