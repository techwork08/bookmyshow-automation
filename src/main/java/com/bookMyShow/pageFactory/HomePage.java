package com.bookMyShow.pageFactory;

import org.openqa.selenium.By;

import com.bookMyShow.generic.Pojo;
import com.bookMyShow.generic.Utilities;

public class HomePage {
	private Utilities objUtilities;
	private Pojo objPojo;
	public HomePage(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	
	By loc_txt_searchCity = By.xpath("//input[@placeholder='Search for your city']");
	By loc_btn_movies = By.xpath("//a[.='Movies']");
//	By temp = By.xpath("//ul[@class='bwc__sc-1iyhybo-11 jgrLow']");
	
	
	public void selectCity(String city) {
		By loc_select_cityDivision = By.xpath("//span[text()='Popular Cities']/ancestor::div//span[text()='"+city+"']");
		objPojo.getObjWrapperFunction().sendKeysUsingAction(loc_txt_searchCity, city);
		objPojo.getObjWrapperFunction().moveElementUsingAction(loc_select_cityDivision);
		//objPojo.getDriver().findElement(loc_txt_searchCity).sendKeys(Keys.ENTER);
		
//		WebElement dropdown = objPojo.getDriver().findElement(temp);
//		List<WebElement> options = dropdown.findElements(By.tagName("li"));
//		for (WebElement option : options)
//		{
//		    if (option.getText().equals(city))
//		    {
//		    	//objPojo.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		        option.click(); // click the desired option
//		        break;
//		    }
//		}
		System.out.println("City selected : " + city);
		
	}
	public void clickOnMovies() {
		objPojo.getObjWrapperFunction().clickUsingAction(loc_btn_movies);
		System.out.println("Click on Movies");
	}
	


}
