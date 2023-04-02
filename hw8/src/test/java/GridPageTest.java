import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GridPageTest {
    @Test
    public void testGridPage () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://app.tca.deltixuat.com/");
        driver.manage().window().maximize();
        GridPage gridPage = new GridPage(driver);
        Assertions.assertEquals("ALL", driver.findElement (
                By.xpath("//div[@role='grid'//div[@role='gridcell'//div[@class='chart-settings mr-1'")).getText());
        driver.quit();
    }
}
