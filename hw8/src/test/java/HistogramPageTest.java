import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HistogramPageTest {
    @Test
    public void testHistogramPage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://app.tca.deltixuat.com/");
        driver.manage().window().maximize();
        HistogramPage histogramPage = new HistogramPage(driver);
        Assertions.assertEquals("ALL", driver.findElement (
        By.xpath("//histogram[@class='h-100']//app-property-select-control//div[@class='deltix-autocomplete'" +
                "//app-intervals-count-control//div[@class='deltix-autocomplete'")).getText());
        driver.quit();
    }
}
