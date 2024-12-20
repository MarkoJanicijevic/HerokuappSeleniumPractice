package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @BeforeMethod
    public void setUpPage () {
        driver.navigate().to("http://the-internet.herokuapp.com/login");
    }
    @Test
    public void TestLogInWithValidCredentials () throws InterruptedException {
        logInPage.inputUsername(reader.getStringData("sheet1", 1, 0));
        logInPage.inputPassword(reader.getStringData("sheet1", 1, 1));
        logInPage.clickSubmit();
        Assert.assertTrue(loggedInPage.getLogOutButton().isDisplayed());
    }

    @Test
    public void TestLogInWithInValidUsername () throws InterruptedException {
        logInPage.inputUsername(reader.getStringData("sheet1", 2, 0));
        logInPage.inputPassword(reader.getStringData("sheet1", 1, 1));
        logInPage.clickSubmit();
        Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
    }

    @Test
    public void TestLogInWithInValidPassword () throws InterruptedException {
        logInPage.inputUsername(reader.getStringData("sheet1", 1, 0));
        logInPage.inputPassword(reader.getStringData("sheet1", 2, 1));
        logInPage.clickSubmit();
        Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
    }

    @Test
    public void TestLogInWithInValidCredentials () throws InterruptedException {
        logInPage.inputUsername(reader.getStringData("sheet1", 2, 0));
        logInPage.inputPassword(reader.getStringData("sheet1", 2, 1));
        logInPage.clickSubmit();
        Assert.assertTrue(logInPage.getSubmitButton().isDisplayed());
    }
}
