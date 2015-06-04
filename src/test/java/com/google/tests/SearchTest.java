package com.google.tests;

import com.google.pages.SearchPage;
import com.thoughtworks.selenium.webdriven.commands.Open;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Василь on 04.06.2015.
 */
public class SearchTest extends BasicTestCase {
    private SearchPage searchPage= PageFactory.initElements(getWebDriver(), SearchPage.class);

    private SearchPage searchPage=PageFactory.initElements(getWebDriver(), SearchPage.class);

    public void goSearchPage() throws Exception {

        openSearchPage();

    }

    @Step
    public void openSearchPagePage(){
        searchPage.open();
}
