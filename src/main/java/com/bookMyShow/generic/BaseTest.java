package com.bookMyShow.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sridharbandi.HtmlCsRunner;

public class BaseTest extends Pojo {
	private WebDriver driver;
	private WrapperFunction  objWrapperFunction;
	private Utilities objUtilities;
	public HtmlCsRunner objHtmlCsRunner;

	public void initBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		
		this.setDriver(driver);
		objUtilities = new Utilities(this);
		objWrapperFunction = new WrapperFunction(this);
		this.setObjUtilities(objUtilities);
		this.setObjWrapperFunction(objWrapperFunction);
	
		objHtmlCsRunner = new HtmlCsRunner(driver);
	}
	public void tearDown() throws IOException {
		objHtmlCsRunner.execute();
		driver.close();
	}
}
