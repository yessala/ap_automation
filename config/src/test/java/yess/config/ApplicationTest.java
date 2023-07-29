package yess.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class ApplicationTest {

//	@Test
//	void shouldAnswerWithTrue() {
//		assertTrue(true);
//	}
	WebDriver driver;
	@Test
	void testWiki() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://es.wikipedia.org/");
		
		Thread.sleep(5000);
		
		driver.close();
		
		
//		driver.navigate().to("https://es.wikipedia.org/");;
//		WebElement inputSearch = driver.findElement(By.cssSelector(".cdx-text-input__input"));
//		
//		inputSearch.sendKeys("Selenium");
//		
//		assertEquals("Selenium", inputSearch.getText());
		
		
	}

//	@Test
//	void driverManagerFirefox() {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
//	}
//
//	@Test
//	void driverManagerOpera() {
//		WebDriverManager.operadriver().setup();
//		WebDriver driver = new OperaDriver();
//		driver.get("https://www.google.com");
//	}
}
