import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAutomatico {
    
    public TestAutomatico() {
    }

    @Test
    public void pruebaTP() {
        //inicializar Gecko Driver
        System.setProperty("webdriver.gecko.driver", "lib\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        //Inicializar driver
        WebDriver driver = new FirefoxDriver();

        //Abrir URL
        driver.get("http://newtours.demoaut.com/");
        
        //clickear REGISTER
        WebElement register = driver.findElement(By.linkText("REGISTER"));
        register.click();
        
        //ingresar usuario
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("admin");

        //ingresar password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin");
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("admin");
        
        //solucionar problema "Contraseña Insegura" de Firefox
        email.click();

        //clickear Register
        WebElement register2 = driver.findElement(By.name("register"));
        register2.click();
        
        //clickear Flights
        WebElement flights = driver.findElement(By.linkText("Flights"));
        flights.click();
    }
}