import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
        
        //seleccionar name=fromPort -> label=London
        Select fromPort = new Select(driver.findElement(By.name("fromPort")));
        fromPort.selectByVisibleText("London");

        //seleccionar name=toPort -> label=Paris
        Select toPort = new Select(driver.findElement(By.name("toPort")));
        toPort.selectByVisibleText("Paris");
        
        //seleccionar primera clase name=servClass value=First
        List<WebElement> servClass = driver.findElements(By.name("servClass"));
        servClass.get(2).click();

        //seleccionar name=findFlights
        WebElement findFlights = driver.findElement(By.name("findFlights"));
        findFlights.click();

        //seleccionar name=reserveFlights
        WebElement reserveFlights = driver.findElement(By.name("reserveFlights"));
        reserveFlights.click();
        
        //ingresar nombre, apellido, y numero de tarjeta
        WebElement passFirst0 = driver.findElement(By.name("passFirst0"));
        passFirst0.sendKeys("Bruno");
        WebElement passLast0 = driver.findElement(By.name("passLast0"));
        passLast0.sendKeys("Diaz");
        WebElement creditnumber = driver.findElement(By.name("creditnumber"));
        creditnumber.sendKeys("123456789012");

        //seleccionar name=buyFlights
        WebElement buyFlights = driver.findElement(By.name("buyFlights"));
        buyFlights.click();
    }
}