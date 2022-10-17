package utils.tp.part2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.NonInstantiable;

/**
 * A non-instantiable class containing various utility
 * methods related to reading and writing files. Also can be used as a
 * repository of accessible path files for public use. 
 * 
 * @author DorianBoel
 */
public final class FileAccess extends NonInstantiable {

	/**
	 * A map containing several file path values mapped to the
	 * corresponding key.
	 */
	public static final Map<String, Path> PATHS;
	
	static {
		Map<String, Path> paths = new HashMap<>();
		paths.put("census", Paths.get("data/census.csv"));
		PATHS = Collections.unmodifiableMap(paths);
	}
	
	/**
	 * Returns a list containing every line from the
	 * file at a given file path. 
	 * 
	 * @param path The path corresponding to the file to read lines from
	 * @return A list containing every line in the file
	 * @throws IOException If the path is not recognized or the file cannot be read
	 */
	public static List<String> getLines(Path path) throws IOException {
		if (fileIsValid(path)) {			
			return Files.readAllLines(path, StandardCharsets.UTF_8);
		}
		throw new IOException("No readable file found at path " + path);
	}
	
	/**
	 * Verifies if the file at a given path is present and is not a directory.
	 * 
	 * @param path The path corresponding to the file to verify
	 * @return A {@code boolean} determining whether the file is valid or not
	 */
	public static boolean fileIsValid(Path path) {
		return Files.exists(path) && !Files.isDirectory(path);
	}
	
}
