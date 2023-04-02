import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistogramPage {
    By histogram = By.xpath("//histogram[@class='h-100']");
    By attribute = By.xpath("//app-property-select-control//div[@class='deltix-autocomplete']");
    By interval = By.xpath("//app-intervals-count-control//div[@class='deltix-autocomplete']");

    private final WebDriver driver;

    public HistogramPage (WebDriver driver) {
        this.driver = driver;
    }

}


