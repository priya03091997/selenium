package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\Priya\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		WebElement ra = driver.findElement(By.xpath("//input[@value='Option 1']"));
		ra.click();
		
		WebElement ch1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		ch1.click();
		WebElement ch2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		ch2.click();
		WebElement ch3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		ch3.click();
		
		

}
}