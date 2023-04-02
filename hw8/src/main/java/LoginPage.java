import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By usernameLocator = By.xpath("//input[@formcontrolname='username']");
    By passwordLocator = By.xpath("//input[@formcontrolname='password']");
    By signInButtonLocator = By.xpath("//button");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage submitSignIn() {
        driver.findElement(signInButtonLocator).submit();
        return new LoginPage (driver);
    }

    public LoginPage submitSignInExpectingFailure() {
        driver.findElement(signInButtonLocator).submit();
        return new LoginPage(driver);
    }

    public void enterLogIn (String username, String password) {
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();

    }
}
