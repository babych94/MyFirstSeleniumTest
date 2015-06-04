package com.google.pages;

import com.google.data.UserText;
import com.google.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Василь on 03.06.2015.
 */
public class SearchPage extends Page {
    @FindBy(id="lst-ib")
    public WebElement textField;

    @FindBy(xpath = ".//*[@id='sblsbb']/button")
    public WebElement buttonSearch;

    public SearchPage(WebDriver driver) {super(driver);}
    @Override
    public void open() {
        driver.get(ConfigProperties.getProperty("base.url"));

    }
public SearchPage (UserText user){
    type(textField, user.usertext);

    buttonSearch.click();
    return PageFactory.initElements(driver, SearchPage.class);
}
}