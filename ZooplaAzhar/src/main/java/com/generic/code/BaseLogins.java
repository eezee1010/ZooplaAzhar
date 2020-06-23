package com.generic.code;	



import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Highlighter;
import com.util.Wait;

import org.openqa.selenium.WebElement;

public class BaseLogins {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		
		WebElement acceptcookies = driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']"));
		acceptcookies.click();
		
		WebElement signin = driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']"));
		//new Highlighter().getcolor(driver, signin);
		Thread.sleep(3000);
		signin.click();
		
		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='signin_email']"), 0));
		WebElement email = driver.findElement(By.xpath("//*[@id='signin_email']"));
		//new Highlighter().getcolor(driver, email);
		
		email.sendKeys("eezee1010@hotmail.com");
		
		WebElement passwd = driver.findElement(By.xpath("//*[@name='signin_password']"));
		//new Highlighter().getcolor(driver, passwd);
		passwd.sendKeys("love7232");
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//*[@id='signin_submit']"));
		//new Highlighter().getcolor(driver, login);
		login.click();
		Thread.sleep(5000);
		driver.quit();		
		
	}
}
