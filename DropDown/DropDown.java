package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement dd1 = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(dd1);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByVisibleText("Apple");
		WebElement dd3 = driver.findElement(By.xpath("(//select)[3]"));
		Select s1 = new Select(dd3);
		s1.selectByIndex(4);
		WebElement dd4 = driver.findElement(By.xpath("(//select)[4]"));
		Select s2 = new Select(dd4);
		s2.selectByValue("India");
		WebElement dd2 = driver.findElement(By.xpath("(//select)[2]"));
		Select s3 = new Select(dd2);
		System.out.println(s3.isMultiple()); //without return type
		s3.selectByIndex(0);
		s3.selectByIndex(2);
		s3.selectByIndex(4);
		s3.selectByIndex(6);
		List<WebElement> allvalues = s3.getOptions();//prints all values from DD
		for (WebElement all : allvalues) {
			System.out.println(all.getText());
		}
		System.out.println("-----------------------------------");
		List<WebElement> selectedOptions = s3.getAllSelectedOptions();//prints only selected values
		for (WebElement selected : selectedOptions) {
			System.out.println(selected.getText());
		}
	}

}
