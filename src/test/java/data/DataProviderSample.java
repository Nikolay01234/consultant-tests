package data;

import org.testng.annotations.DataProvider;

public class DataProviderSample {
    @DataProvider(name = "dataProviderMain")
    public static Object[][] dataProviderMainMethod() {
        return new Object[][] {
                {"<div id=\"ban__142\""},
                {"<div id=\"ban__148\""},
                {"<div class=\"cookies-banner\""}
        };
    }

    @DataProvider(name = "dataProviderLawHotdocs")
    public static Object[][] dataProviderLawHotdocsMethod() {
        return new Object[][] {
                {"<div id=\"ban__162\""},
                {"<div id=\"ban__135\""},
                {"<div id=\"ban__137\""},
                {"<div id=\"ban__138\""},
                {"<div id=\"ban__149\""}
        };
    }
}
