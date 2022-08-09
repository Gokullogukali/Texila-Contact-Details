package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul L\\eclipse-workspace\\Texila Contact\\driver\\chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Go to the url
		driver.get("https://tauedu.org/contact-us/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement textName = driver.findElement(By.xpath("//input[@id='name_e']"));
		textName.sendKeys("Gokul Loganathan");
		
		Thread.sleep(3000);
		WebElement textEmail = driver.findElement(By.xpath("//input[@id='email']"));
		textEmail.sendKeys("gokulloganathan78@gmail.com");
		
		Thread.sleep(3000);
		WebElement textCountry = driver.findElement(By.xpath("//select[@id='country_code']"));
		textCountry.click();
		Thread.sleep(2000);
		WebElement textIndia = driver.findElement(By.xpath("//option[text()='India (+91)']"));
		textIndia.click();
		
		Thread.sleep(3000);
		WebElement textContact = driver.findElement(By.xpath("//input[@id='contact']"));
		textContact.sendKeys("8489165569");
		
		Thread.sleep(2000);
		WebElement textPurpose = driver.findElement(By.xpath("//select[@id='purpose']"));
		textPurpose.click();
		Thread.sleep(2000);
		WebElement textEmp = driver.findElement(By.xpath("//option[text()='Employee credentials']"));
		textEmp.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		WebElement textPur = driver.findElement(By.xpath("//select[@id='purpose']"));
		jk.executeScript("arguments[0].scrollIntoView('true')", textPur);
		
		Thread.sleep(2000);
		WebElement textMsg = driver.findElement(By.xpath("//textarea[@name='message']"));
		textMsg.sendKeys("Hello Sir");
		
		WebElement textCaptcha = driver.findElement(By.xpath("//input[@id='captcha']"));
		textCaptcha.sendKeys("");
		
		WebElement textSubmit = driver.findElement(By.xpath("//button[text()='Send Message']"));
		textSubmit.click();
		
	}
	
}
