package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.Sources;
import data.DataProviderSample;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(AllureTestNg.class)
public class LawHotdocsPageTest {

    @BeforeClass
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test(dataProvider = "dataProviderLawHotdocs", dataProviderClass = DataProviderSample.class)
    public void testLawHotdocsElements(String element) {
        Selenide.open(Sources.LAW_HOTDOCS_PAGE);
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        assertTrue(Selenide.executeJavaScript("return document.body.innerHTML").toString().contains(element),
                "Элемент не найден: " + element);
    }
}