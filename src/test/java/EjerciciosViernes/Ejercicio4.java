package EjerciciosViernes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ejercicio4 {
	
	/* 1. Ingresar a SauceDemo 
	 * 2. Maximizar la ventana del navegador
	 * 3. Hacer un log in
	 * 4. Filtrar productos de la Z a la A 
	 * 5. Agregar los primeros 4 productos y luego remover 1
	 * 6. Ir a tu carrito de compra
	 * 7. Remover otro producto en tu carrito de compra y presionar el boton de checkout
	 * 8. Ingresar los datos que se piden y presionar el boton de continuar
	 * 9. Presionar el boton de Finish
	 * 10. Validar que el texto "THANK YOU FOR YOUR ORDER" este presente y presionar el boton de back home*/
	
public static WebDriver driver;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void cicloCompleto() throws InterruptedException
	{
		
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
