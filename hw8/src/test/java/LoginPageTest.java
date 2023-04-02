import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageTest {

    @Test
    public void testLoginPage () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get("https://app.tca.deltixuat.com/");
            driver.manage().window().maximize();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterLogIn("selenium_chrome", "Axa@Demo");
            Assertions.assertEquals("ALL", driver.findElement (
                    By.xpath("//div[@formcontrolname='username']//div[@formcontrolname='password']//button")).getText());
            driver.quit();
    }

}

