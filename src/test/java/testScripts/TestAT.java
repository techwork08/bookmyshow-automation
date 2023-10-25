//package testScripts;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
//import io.github.sridharbandi.AxeRunner;
//
//public class TestAT {
//
//	private WebDriver driver;
//    private static AxeRunner axeRunner;
//
//    @BeforeEach
//    public void beforeTest() {
//        ChromeDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//        driver.manage().window().fullscreen();
//        axeRunner = new AxeRunner(driver);
//
//    }
//
//    @AfterEach
//    public void tearDown() throws IOException {
//        axeRunner.execute();
//        driver.quit();
//    }
//
//    @AfterAll
//    public static void generateReport() throws IOException {
//        axeRunner.generateHtmlReport();
//    }
//
//    @Test
//    public void googleTest() {
//        driver.get("https://www.google.com/");
//    }
//
//
//
//}
