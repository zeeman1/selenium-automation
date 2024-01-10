package com.java.selenium.automation.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class LoadProps {
		public static String getData(String key) throws Throwable {
			String value = null;
			FileReader reader;
			try {
				reader = new FileReader("env.properties");
				Properties prop = new Properties();
				prop.load(reader);

				value = prop.getProperty(key);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return value;
		}
}
