package com.Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // global wait 
		driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Thread.sleep(5000);
        driver.navigate().to("https://www.instagram.com/");
        String title1 = driver.getTitle();
        System.out.println(title1);
        String currentUrl1 = driver.getCurrentUrl();
        System.out.println(currentUrl1);
        Thread.sleep(5000);
        driver.navigate().back();
        String title2 = driver.getTitle();
        System.out.println(title2);
        Thread.sleep(5000);
        driver.navigate().forward();
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println(currentUrl2);
        Thread.sleep(5000);
        driver.close();
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
	}

}
