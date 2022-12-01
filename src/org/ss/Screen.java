package org.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\Priya\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
	}

}
