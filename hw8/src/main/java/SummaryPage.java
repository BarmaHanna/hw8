import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {
    By algoPerformanceLocator = By.xpath("//*[@data-id='v1-h1']");

    private final WebDriver driver;

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

}
