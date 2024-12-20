package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    WebElement username;
    WebElement password;
    WebElement submitButton;

    WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.className("radius"));
    }

    public void inputUsername (String x) {
        getUsername().sendKeys(x);
    }

    public void inputPassword (String x) {
        getPassword().sendKeys(x);
    }

    public void clickSubmit () {
        getSubmitButton().click();
    }





}
