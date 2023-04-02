import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SummaryPageTest {
    @Test
    public void testSummaryPage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://app.tca.deltixuat.com/");
        driver.manage().window().maximize();
        SummaryPage summaryPage = new SummaryPage(driver);
        Assertions.assertEquals("ALL", driver.findElement (
                By.xpath("//*[@data-id='v1-h1']")).getText());
        driver.quit();
    }

}



