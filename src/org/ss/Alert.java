package org.ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Priya\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		WebElement al = driver.findElement(By.xpath("//input[@name='cusid']"));
		al.sendKeys("56322");

		WebElement all = driver.findElement(By.xpath("//input[@name='submit']"));
		all.click();

		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

		System.out.println("priya");
		System.out.println("dharshini");

	}
}