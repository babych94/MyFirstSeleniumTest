package com.google.tests;

import com.google.utils.ConfigProperties;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Created by Василь on 03.06.2015.
 */
public class BasicTestCase {


    protected WebDriver driver;

    protected WebDriver getWebDriver(){
        if (driver==null){
            String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
                System.setProperty("webdriver.chrome.driver", "chromedrivermac");
            } else if (OS.indexOf("win") >= 0) {
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                System.out.println(OS);
            } else if (OS.indexOf("nux") >= 0) {
                System.setProperty("webdriver.chrome.driver", "chromedriver");
            } else {
                System.out.println("NOT SUPPORTED OS");
            }


            driver=new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);

        }
        return driver;
    }


    @AfterTest
    public  void tearDown() {

        //driver.close();

    }
}
