package com.AutomationTesting.seleniumbasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filetestdemo1 {
	public static void main(String[] args) throws IOException {
		String project_location = System.getProperty("user.dir");
		System.out.println(project_location);
		File fi = new File(project_location+"\\Automationbasic.properties");
		BufferedReader br = new BufferedReader(new FileReader(fi));
		Properties pr = new Properties();
		pr.load(br);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String urlapp = pr.getProperty("url");
		driver.get(urlapp);
		String user = pr.getProperty("email");
		String pass = pr.getProperty("password");

				driver.findElement(By.id("email")).sendKeys(user);
				driver.findElement(By.id("login-password")).sendKeys(pass);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", WebElement);
				//driver.findElement(By.id("login")).click();
		
		
	}

}
