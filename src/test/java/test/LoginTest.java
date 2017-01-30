package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import page.LoginPage;

/**
 * Created by Сергей on 29.01.2017.
 */
public class LoginTest {
    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = LoginPage.start();
        loginPage.username();
        loginPage.password();
        loginPage.login();
        
    }
    @AfterClass
    public static void aftr(){
        LoginPage.quit();
    }
}
