import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScatterplotPage {
    By diagram = By.xpath("//scatter-plot");
    By attributeX = By.xpath("//div[text()='X Attribute']/..//div[@class='deltix-autocomplete']");
    By attributeY = By.xpath("//div[text()='Y Attribute']/..//div[@class='deltix-autocomplete']");
    By interval = By.xpath("//app-intervals-count-control//div[@class='deltix-autocomplete']");

    private final WebDriver driver;

    public ScatterplotPage(WebDriver driver) {
        this.driver = driver;
    }
}
