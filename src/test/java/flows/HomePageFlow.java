package flows;

import com.bookMyShow.generic.Pojo;
import com.bookMyShow.generic.Utilities;
import com.bookMyShow.pageFactory.HomePage;

public class HomePageFlow {
	private Pojo objPojo;
	private HomePage objHomePage;
	private Utilities objUtilities;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo=pojo;
		objHomePage = new HomePage(objPojo);
		objUtilities = new Utilities(objPojo);
	}
	
	public void homePageFlow() {
		objHomePage.selectCity(objUtilities.getRandomCity());
		objHomePage.clickOnMovies();
		//objHomePage.verifyMoviesPageIsDisplayedOrNot();
	}
	
	
}
