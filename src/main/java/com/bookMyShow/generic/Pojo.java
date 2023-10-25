package com.bookMyShow.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {
	private Utilities objUtilities;
	private WrapperFunction objWrapperFunction;
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public Utilities getObjUtilities() {
		return objUtilities;
	}
	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}
	public WrapperFunction getObjWrapperFunction() {
		return objWrapperFunction;
	}
	public void setObjWrapperFunction(WrapperFunction objWrapperFunction) {
		this.objWrapperFunction = objWrapperFunction;
	}
	

}
