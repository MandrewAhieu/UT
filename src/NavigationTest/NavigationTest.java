package NavigationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.UTHomePage;

public class NavigationTest {
		public String baseURL = "http://www.uptake.com";
		public String expectedTitleHome = "Home | Uptake";
		public String expectedTitleApproach = "Approach | Uptake";
		public String actualTitle = "";
		public WebDriver driver = new FirefoxDriver();

		@BeforeTest
		public void launchBrowser() {
			 //open home page	
			  driver.get(baseURL);
		}
		
	  @Test(priority=0)
	  public void compareHomeTitle() {
		 // get actual title of homepage	
			actualTitle = driver.getTitle();
		// compare actual title to expected title of home page and print pass/fail result
			Assert.assertEquals(actualTitle, expectedTitleHome);
			}
		
		@Test(priority=1)
		public void compareApproachTitle() {
			//POM - navigate to Approach page using UTHomePage class
				UTHomePage.findApproach(driver).click();
			// get actual title of Approach Page	
				actualTitle = driver.getTitle();
			// compare actual title to expected title of approach page and print pass/fail result
				Assert.assertEquals(actualTitle, expectedTitleApproach);	
			}	
		
		@AfterTest
		public void terminateBrowser() {
			driver.quit();
		}
		
	}
