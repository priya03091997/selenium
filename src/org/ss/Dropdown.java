package org.ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\priya\\ScreenShot\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement drp = driver.findElement(By.id("Skills"));
	
	Select ss=new Select(drp);
	List<WebElement> options = ss.getOptions();
	for (WebElement webEle: options) {
		String attribute = webEle.getAttribute("value");
		System.out.println(attribute);
		 
	}
	
	}

}
