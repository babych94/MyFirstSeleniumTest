package com.google.pages;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public abstract class Page {


    public WebDriver driver;

    public Page (WebDriver driver){
        this.driver=driver;
    }

    public void type (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public abstract void open();


    public boolean isElementPresent(WebElement element){
        try {
            element.isDisplayed();
            return  true;
        }catch (NoSuchElementException e){
            return false;
        }

    }

}
