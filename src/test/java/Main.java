import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Сергей on 29.01.2017.
 */
public class Main {
    static WebDriver driver;
    @BeforeClass
    public static void bfr(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Сергей/Documents/webrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

   @Test
    public void  test() {
       driver.get("http://software-testing.ru");
       driver.close();
   }
}

