package com.AutomationTesting.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame3nested {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://letcode.in/frame");
		
		WebElement frame1 = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("fname")).sendKeys("PAVAN");
		driver.findElement(By.name("lname")).sendKeys("KUMAR");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));
        driver.findElement(By.name("email")).sendKeys("pavan@gmail.com");
        driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("REDDY");
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Watch tutorial']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


		
	}

}
