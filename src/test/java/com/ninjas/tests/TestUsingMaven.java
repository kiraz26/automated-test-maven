package com.ninjas.tests;

import org.apache.commons.text.WordUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ninjas.utilities.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUsingMaven {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.getProperty("url"));
	}

	// public static void main(String[] args) {
	// // write a code that takes a String and capitalizes all the words in that
	// String
	// // only the first letters
	//
	// String str ="write a code that takes a String and";
	// //str=str.substring(0, 1).toUpperCase()+str.substring(1);
	// //System.out.println(str);
	// str = WordUtils.capitalize(str);
	// System.out.println(str);
	// str = WordUtils.initials(str);
	// System.out.println(str);
	// }

}
