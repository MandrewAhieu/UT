package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UTHomePage {
	
	private static WebElement element = null;
	
	public static WebElement findApproach(WebDriver driver){
		 
		    element = driver.findElement(By.id("menu-item-4164"));
		    return element;
		 
		    }
		
}