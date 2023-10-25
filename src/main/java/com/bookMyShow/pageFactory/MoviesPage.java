package com.bookMyShow.pageFactory;

import org.openqa.selenium.By;

import com.bookMyShow.generic.Pojo;

public class MoviesPage {
	private Pojo objPojo;
	private HomePage objHomePage;
	
	public MoviesPage(Pojo pojo) {
		this.objPojo=pojo;
		objHomePage = new HomePage(objPojo);
	}
	String str = "//h1[.='Movies in %s']";
	String language = "//div[@class='style__MobileFilterItemLabel-sc-1y4pbdw-15 kVQghR' and .='%s']";
	By loc_sel_language = By.xpath(language);
	By loc_filters = By.xpath("(//div[.='Filters'])[2]");
	
		
	public void verifyMoviesPageIsDisplayedOrNot() {
		
		//By loc_h1_moviesPage = By.xpath(String.format(str, city));
		objPojo.getDriver().findElement(loc_filters).isDisplayed();
		System.out.println("Check Movie Page is Displayed or Not");
}
	
	public void selectLanguage() {

	 Boolean flag =	objPojo.getObjWrapperFunction().clickUsingAction(loc_sel_language);
		System.out.println("Random language selected : " + flag);
		
	}

}
