package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.Sources;
import data.DataProviderSample;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(AllureTestNg.class)
public class LawHotdocsPageTest {

    @Test
    public void myTest(){
        System.out.println("111");
    }

//    @BeforeClass
//    public void setUp() {
//        Configuration.browserSize = "1920x1080";
//        Configuration.timeout = 10000;
//    }
//
//    @BeforeMethod
//    public void scrollDown() {
//        Selenide.open(Sources.LAW_HOTDOCS_PAGE);
//        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
//    }
//
//    @Test(dataProvider = "dataProviderLawHotdocs", dataProviderClass = DataProviderSample.class)
//    public void testLawHotdocsElements(String element) {
//        assertTrue(Selenide.executeJavaScript("return document.body.innerHTML").toString().contains(element),
//                "Элемент не найден: " + element);
//    }
}