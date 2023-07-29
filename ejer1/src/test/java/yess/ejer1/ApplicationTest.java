package yess.ejer1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


class ApplicationTest {
	WebDriver driver;
    
    @Test
    void maximice() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	Thread.sleep(3000);
    	
    	driver.manage().window().maximize();

       	Thread.sleep(3000);

       	driver.close();
    	
    }
    
}
