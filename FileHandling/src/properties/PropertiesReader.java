package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"/src/properties/website.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));

	}

}
