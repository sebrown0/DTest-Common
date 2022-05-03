/**
 * 
 */
package common.file;

import java.net.URL;
import java.util.Optional;

import file.helpers.FileFinder;


/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 */
public class FilePathLocator {
	
	public Optional<String> getPathToFileIgnoringTargetDir(URL fromUrl, String fileNameAndExtension) {
		Optional<String> pathToXml = Optional.empty(); 
		
		if(fromUrl != null) {
			var appPath = fromUrl.getPath().replace("target/classes/", "");
			
			if(appPath.startsWith("/")) {
				appPath = appPath.substring(1,appPath.length());
			}
			
			int idx = appPath.indexOf("target");
			if(idx > 0) {
				appPath = appPath.substring(0, idx);
			}
			
			pathToXml = FileFinder.findFilePath(appPath, fileNameAndExtension, "target");
		}
		return pathToXml;
	}
	
}
