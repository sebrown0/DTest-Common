/**
 * 
 */
package common.xml_file;

import java.net.URL;
import java.util.Optional;

import common.file.FilePathLocator;
import common.file.XmlFileLocator;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 */
public class FileLocator implements XmlFileLocator {

	@Override
	public Optional<String> getPathToFile() {		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		return 
			new FilePathLocator()
				.getPathToFileIgnoringTargetDir(url, "site_map.xml");
	}
	
}
