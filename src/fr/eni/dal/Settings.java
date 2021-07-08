package fr.eni.dal;

import java.io.IOException;
import java.util.Properties;

public class Settings {

	static private Properties properties;
	
	static {
		try {
			properties = new Properties();
			properties.load(Settings.class.getResourceAsStream("settings.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String cle) {
		return properties.getProperty(cle);
	}
}
