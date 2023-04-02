import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScatterplotPageTest {
    @Test
    public void testScatterplotPage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://app.tca.deltixuat.com/");
        driver.manage().window().maximize();
        ScatterplotPage scatterplotPage = new ScatterplotPage(driver);
        Assertions.assertEquals("ALL", driver.findElement (
                By.xpath("//scatter-plot//div[text()='X Attribute']/..//div[@class='deltix-autocomplete']" +
                        "//div[text()='Y Attribute']/..//div[@class='deltix-autocomplete']//app-intervals-count-control" +
                        "//div[@class='deltix-autocomplete']")).getText());
        driver.quit();
    }
}
