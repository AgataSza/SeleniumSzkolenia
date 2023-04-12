package selenium;

import org.junit.jupiter.api.Test;
import selenium.pages.MainPage;
import selenium.pages.ResultsPage;

public class FirstTest extends BaseTest {

    @Test
    public void openGooglePage() {
    }

    @Test
    public void search() {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchValue("Elon Musk");
        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.goToGraphicResults();

    }

    @Test
    public void search1(){
        new MainPage(driver).searchValue1("Elon Musk").goToGraphicResults();
    }
}
