package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Сергей on 05.02.2017.
 */
public class Catolog {
    WebDriver driver;

    public Catolog(WebDriver driver) {
        this.driver = driver;
    }
    public boolean subOk(String  selector) {// #box-latest-products > div > ul > li:nth-child(1)
        int size = driver.findElements(By.cssSelector(selector)).size();
        for (int i = 1; i <= size; i++) {
            if (driver.findElements(By.cssSelector(selector+":nth-child(" + i + ")> a.link > div.image-wrapper > div")).size() != 1)
                return false;
        }
        return true;
    }
    public boolean ok(){
        if (!subOk("#box-most-popular>div>ul>li"))return false;
        if (!subOk("#box-campaigns > div > ul > li"))return false;
        if (!subOk("#box-latest-products > div > ul > li"))return false;
        return true;
    }

}
