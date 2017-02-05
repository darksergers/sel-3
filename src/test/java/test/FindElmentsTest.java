package test;

import org.junit.AfterClass;
import org.junit.Test;
import page.AdminPage;
import page.Catolog;
import page.LoginPage;

import static org.junit.Assert.fail;

/**
 * Created by Сергей on 05.02.2017.
 */
public class FindElmentsTest {
    @Test
    public void test(){
        LoginPage loginPage = LoginPage.start();
        loginPage.username();
        loginPage.password();
        AdminPage adminPage=loginPage.login();
        if(!adminPage.ok()) fail();
    }
    @Test
    public void test1(){
        LoginPage loginPage = LoginPage.start();
        loginPage.username();
        loginPage.password();
        AdminPage adminPage=loginPage.login();
        Catolog catolog=adminPage.catolog();
        if (!catolog.ok())fail();
    }
    @AfterClass
    public static void aftr(){
        LoginPage.quit();
    }
}
