package testScripts;

import java.io.IOException;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bookMyShow.generic.BaseTest;
import com.bookMyShow.pageFactory.MoviesPage;

import flows.HomePageFlow;
import flows.MoviesPageFlow;

public class HomePageTest extends BaseTest {
	private HomePageFlow objHomePageFlow;
	private MoviesPageFlow objMoviesPageFlow;
	
	public void initFlows() {
		objHomePageFlow = new HomePageFlow(this);
		objMoviesPageFlow = new MoviesPageFlow(this);
	}
	
	@BeforeClass
	public void setUpEnv() {
		this.initBrowser();
		this.initFlows();
	}
	
	@Test
	public void selectCity() {
		objHomePageFlow.homePageFlow();
		objMoviesPageFlow.moviesPageFlow();
	}
	
	public void closeBrowser() throws IOException {
		this.tearDown();
	}

}
