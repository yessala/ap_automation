package yess.ejer3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ApplicationTest {
	Dimension dim, dimO, dimV;
	Point position, positionOld;
	WebDriver driver;
	
    @Test
    void integrador() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com.ar/");
    	dimO = driver.manage().window().getSize(); //guarda el valor del tamaño original de la ventana
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	driver.navigate().to("https://openai.com/");
    	dimV = driver.manage().window().getSize(); //Guarda el valor de la ventana maximizada
    	dim = new Dimension((dimV.width/2), (dimV.height/2)); //Asigno el valor de la mitad del tamaño de la ventana
    	driver.manage().window().setSize(dim);
    	positionOld =  driver.manage().window().getPosition(); //guarda el valor de la primera posición al abrir la pag
    	position = new Point((dimV.getWidth()/4), (dimV.getHeight()/4));
    	driver.manage().window().setPosition(position);
    	Thread.sleep(3000);
    	driver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada/");
    	Thread.sleep(2000);
    	driver.manage().window().setSize(dimO);
    	driver.manage().window().setPosition(positionOld);
    	Thread.sleep(2000);
    	driver.close();
    }
}
