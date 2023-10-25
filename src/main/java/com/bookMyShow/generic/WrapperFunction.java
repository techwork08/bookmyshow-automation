package com.bookMyShow.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperFunction {
	public Pojo objPojo;
	
	public WrapperFunction(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	public boolean clickUsingAction(By locator) {
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(objPojo.getDriver()).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(WebDriverException.class);
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		WebDriverWait objWebDriverWait = new WebDriverWait(objPojo.getDriver(), Duration.ofSeconds(3));
		
		try {
			Actions action = new Actions(objPojo.getDriver());
			WebElement element=objPojo.getDriver().findElement(locator);
			objWebDriverWait.until(ExpectedConditions.visibilityOf(element));	 
			action.click().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 				
		return true;
	}

	public void sendKeysUsingAction(By locator, String str) {
		try {
			Actions action = new Actions(objPojo.getDriver());
			WebElement element = objPojo.getDriver().findElement(locator);
			action.sendKeys(element,str).perform();
			action.sendKeys(Keys.ENTER).perform();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public void moveElementUsingAction(By locator) {
		WebDriverWait objWebDriverWait = new WebDriverWait(objPojo.getDriver(), Duration.ofSeconds(10));
		
		try {
			Actions action = new Actions(objPojo.getDriver());
			WebElement element = objPojo.getDriver().findElement(locator);
			
			action.moveToElement(element).click().perform();
			objWebDriverWait.until(ExpectedConditions.visibilityOf(element));
			//action.sendKeys(Keys.ENTER).perform();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public boolean selectAction(By locator, String value) {
		try {
			WebElement element = objPojo.getDriver().findElement(locator);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			return true;
	}
}
