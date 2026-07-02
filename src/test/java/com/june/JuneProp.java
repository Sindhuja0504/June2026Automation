package com.june;

import java.io.FileReader;
import java.util.Properties;


public class JuneProp {
	public static void prop() {
		try {
			FileReader file = new FileReader(
					"C:\\Users\\M1001\\projectclss-workspace\\JuneProject\\src\\test\\resources\\Files\\sheet.properties");
			Properties p = new Properties();
			p.load(file);
			String url = p.getProperty("url");
			System.out.println(url);
			String name = p.getProperty("username", "Admin");
			System.out.println(name);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String [] args) {
		prop();
	}

}
