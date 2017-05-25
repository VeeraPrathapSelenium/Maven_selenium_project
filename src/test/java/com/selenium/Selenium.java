package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium {
	public WebDriver driver;
	
	@Test(priority=1)
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		System.out.println("Browser successfully launched");
	}
	@Test(priority=2)
	public void credentials()
	{
		driver.findElement(By.id("email")).sendKeys("9491076744");
		driver.findElement(By.id("pass")).sendKeys("*123456#");
		System.out.println("Enter valid credentials");
	}
	@Test(priority=3)
	public void login()
	{
		driver.findElement(By.id("u_0_q")).click();
		System.out.println("Application successfully Launched");
		
	}

}
