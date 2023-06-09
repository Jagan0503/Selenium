package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Jagannath");
		
		
	}
}
