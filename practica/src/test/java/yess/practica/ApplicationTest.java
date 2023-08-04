package yess.practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


class ApplicationTest {
	WebDriver driver;
	
    @Test
    void hacerClick() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    	
    	WebElement input = driver.findElement(By.cssSelector(".cdx-text-input__input"));
    	input.sendKeys("Selenium");
    	
    	WebElement sele =  driver.findElement(By.cssSelector(".cdx-text-input__input.cdx-text-input__input--has-value"));
    	assertEquals("Selenium", sele.getText());
    	
    	Thread.sleep(4000);
    	
    	
    	driver.close();
    }
}
	