//package testScripts;
//
//import java.io.IOException;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.bookMyShow.generic.BaseTest;
//
//public class BMSAccessibilityTest extends BaseTest{
//	
//	
//	@Test
//	public void test() throws IOException {
//		this.getDriver().get("https://google.com/");
//		Assert.assertTrue(true);
//	}
//	
//	@BeforeClass
//	public void setUpEnv() {
//		this.initBrowser();
//	}
//	
//	
//    public void tearDown() throws IOException {
//    	objHtmlCsRunner.execute();
//        //driver.quit();
//    }
//	
//	@AfterClass
//	public void generateReport() throws IOException {
//		objHtmlCsRunner.generateHtmlReport();
//    }
//	
//}
