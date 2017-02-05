package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Сергей on 05.02.2017.
 */
public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean ok()  {
        int size=driver.findElements(By.cssSelector("#box-apps-menu li")).size();

        for(int i = 1; i<=size;i++){
            driver.findElement(By.cssSelector("#box-apps-menu>li:nth-child("+i+")")).click();
            if(!h10k()) return false;
            int subSize=driver.findElements(By.cssSelector("#box-apps-menu>li:nth-child("+i+") > ul > li")).size();
            for(int j=2;j<subSize;j++){
                driver.findElement(By.cssSelector("#box-apps-menu>li:nth-child("+i+") > ul > li:nth-child("+j+")")).click();
                if(!h10k()) return false;
            }


        }
        return true;
    }

    private boolean h10k() {
        return driver.findElements(By.cssSelector("h1")).size()>0;
    }
}
