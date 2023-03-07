package EjerciciosViernes;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ejercicio1 {
	
	public void organizarTest() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver.quit();
		driver.get("https://www.saucedemo.com/");
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		//5. take action 
		//6.record the result
		//assertTrue(element.isDisplayed());
		//3. Find element
		//2. Navigate to the URL 
		//1. Instantiate the driver
		
		//4. Check the state
		//7. Quit the driver
	}
	
	/* Ingresar a saucedemo y localizar todos los tipos de elementos de username*/
	
	public void typesOfLocators()
    {
        //1. Instantiate the driver
        WebDriver driver = new ChromeDriver();
        //2. navigate to the URL
        driver.get("https://www.saucedemo.com/");
        
        
        driver.findElement(By.id(""));
        
        driver.findElement(By.className(""));
        
        driver.findElement(By.tagName(""));
        
        driver.findElement(By.cssSelector(""));
        
        driver.findElement(By.xpath(""));
        
        
        driver.quit();

    }

}
