package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Сергей on 29.01.2017.
 */
public class LoginPage {
    private static   LoginPage loginPage;
    public static WebDriver driver;


    private LoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Сергей/Documents/webrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/litecart/admin");
    }
    public static LoginPage start(){
        if (loginPage==null){
            loginPage = new LoginPage();
        }else {
        driver.get("http://localhost:8080/litecart/admin");

    }
        return loginPage;
    }
    public void username(){
        driver.findElement(By.name("username")).sendKeys("admin");
    }
    public void password(){
        driver.findElement(By.name("password")).sendKeys("admin");
    }
    public AdminPage login(){
        driver.findElement(By.name("login")).click();
        return new AdminPage(driver);
    }
    public static void quit(){
        driver.quit();
    }
}
