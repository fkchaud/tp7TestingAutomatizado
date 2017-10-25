import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
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
    }
}