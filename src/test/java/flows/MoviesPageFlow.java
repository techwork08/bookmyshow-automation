package flows;

import com.bookMyShow.generic.Pojo;
import com.bookMyShow.generic.Utilities;
import com.bookMyShow.pageFactory.MoviesPage;

public class MoviesPageFlow {
	
	private Pojo objPojo;
	private MoviesPage objMoviesPage;
	private Utilities objUtilities;
	
	public MoviesPageFlow(Pojo pojo) {
		this.objPojo=pojo;
		objMoviesPage = new MoviesPage(objPojo);
		objUtilities = new Utilities(objPojo);
	}
	
	public void moviesPageFlow() {
		objMoviesPage.verifyMoviesPageIsDisplayedOrNot();
		objMoviesPage.selectLanguage();
	}

}
