/**
 * 
 */
package common.file;

import java.util.Optional;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 * 
 * Any library used by SiteMapper or DTest
 * should implement this so that the path 
 * to the XML file used can be found.
 * 
 */
public interface XmlFileLocator {
	Optional<String> getPathToFile();
}
