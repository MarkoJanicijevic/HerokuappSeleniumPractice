package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInPage {

    WebDriver driver;
    WebElement LogOutButton;


    public LoggedInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector(".button.secondary.radius"));
    }











}
