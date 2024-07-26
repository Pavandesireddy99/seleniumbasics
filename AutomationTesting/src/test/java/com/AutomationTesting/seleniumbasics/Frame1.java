package com.AutomationTesting.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("frmTextBox"))).perform();
		WebElement frame1 = driver.findElement(By.id("frm1"));
		action.moveToElement(frame1).perform();
		driver.switchTo().frame(frame1);
		WebElement menu = driver.findElement(By.id("selectnav2"));

		Thread.sleep(3000);
		Select menulist = new Select(menu);
		menulist.selectByIndex(3);
		
		

		
	
	
	}

}
