package com.AutomationTesting.seleniumbasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTestDemo1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://letcode.in/waits");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
	
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	//Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
	
}
}
