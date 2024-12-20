package Base;

import Pages.LogInPage;
import Pages.LoggedInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {
    public WebDriver driver;
    public LogInPage logInPage;
    public ExcelReader reader;
    public LoggedInPage loggedInPage;

    @BeforeClass
    public void SetUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logInPage = new LogInPage(driver);
        reader = new ExcelReader("C:\\Users\\Djang\\HerokuappSeleniumPractice\\TestData.xlsx");
        loggedInPage = new LoggedInPage(driver);
    }


}
