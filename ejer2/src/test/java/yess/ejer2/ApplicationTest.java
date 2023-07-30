package yess.ejer2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 *@author yessa 
 */
class ApplicationTest {
	
	WebDriver driver;
	
	//navegar entre pagias usando atras y adelante
    @Test
    void navegateByF() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com.ar/");
    	Thread.sleep(3000); //funcion para esperar 3 segundos antes de hacer una acción
    	driver.navigate().to("https://openai.com/");
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.close();
    
    }
}
