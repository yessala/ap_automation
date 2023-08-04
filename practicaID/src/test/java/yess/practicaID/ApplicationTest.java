package yess.practicaID;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


class ApplicationTest {

	//probar login de Gidhub
    @Test
    void loginGH() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com.ar");
    	driver.navigate().to("https://github.com/login");
    	WebElement mail = driver.findElement(By.id("login_field"));
    	WebElement pass = driver.findElement(By.id("password"));
    	mail.sendKeys("prueba123");
    	pass.sendKeys("prueba123");
    	Thread.sleep(3000);
    	WebElement log_btn = driver.findElement(By.cssSelector("input[type=submit]"));
    	log_btn.click();
    	Thread.sleep(5000);
    	
//    	WebElement prof = driver.findElement(By.className("AppHeader-user"));
//    	prof.click();
//    	Thread.sleep(3000);
//    	
//    	
//    	driver.findElement(By.linkText("Sign out")).click();
//    	Thread.sleep(3000);
//    	driver.findElement(By.cssSelector("input[type=submit]")).click();
    	
    	Thread.sleep(3000);
    	driver.quit();    	
    }
    
    @Test
    void logOutGH() {
 
    	
    	
    	
    }
}