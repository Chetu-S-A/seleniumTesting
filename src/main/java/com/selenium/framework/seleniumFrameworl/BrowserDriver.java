package com.selenium.framework.seleniumFrameworl;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class BrowserDriver {
	WebDriver driver;
	@BeforeTest
	public void Browser_Init(){
		System.setProperty("webdriver.gecko.driver", 
				"geckoDriver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

	}
	@Test
	public void BrowserLauncher() throws InterruptedException{
//		URL rootFolder = BrowserDriver.class.getProtectionDomain().getCodeSource().getLocation();
//		File rootFolderPath = new File("geckDriver/geckodriver.exe");
//		System.out.println(rootFolderPath.g)
/*				driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@id='gs_hitf0')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='gs_hitf0')]")).sendKeys(Keys.ENTER);
*/		
//		Dimension dim = new Dimension(1024,768);
		//driver.manage().window().setSize(dim);
		//WebDriver.Options dm = driver.manage();
		//dm.window().maximize();
		//dm.window().fullscreen();
/*		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
*/
		Thread.sleep(5000);
		driver.get("google.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='gs_hitf0')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='gs_hitf0')]")).sendKeys(Keys.ENTER);
		System.out.println("This is the title of the page "+ driver.getTitle());
		Thread.sleep(5000);
	}
	@AfterTest
	public void cleanUp(){
		driver.quit();
	}
	
}



