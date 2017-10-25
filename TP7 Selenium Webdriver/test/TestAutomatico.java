import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAutomatico {
    
    public TestAutomatico() {
    }

    @Test
    public void pruebaTP() {
        //Inicializar driver
        WebDriver driver = new FirefoxDriver();

        //Abrir URL
        driver.get("http://newtours.demoaut.com/");
    }
}