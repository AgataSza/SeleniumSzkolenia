package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.BasePage;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void goToGraphicResults() {
        driver.findElements(By.cssSelector("div.MUFPAc a")).get(0).click();
    }
}
