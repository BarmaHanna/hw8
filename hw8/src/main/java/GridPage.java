import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GridPage {
    By grid = By.xpath("//div[@role='grid']");
    By gridCell = By.xpath("//div[@role='gridcell']");
    By linesElement = By.xpath("//div[@class='chart-settings mr-1']");

    private final WebDriver driver;

    public GridPage (WebDriver driver) {
        this.driver = driver;
    }

}

