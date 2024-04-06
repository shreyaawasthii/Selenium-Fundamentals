
package com.selenium.test;
import com.selenium.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Scenario {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://magento.softwaretestingboard.com/");
    }
    @org.testng.annotations.Test(priority = 0)
    public void executeTestScenarios() {
        // Initializing pages
        HomePage homePage = new HomePage(driver);
//        SignInPage signInPage = new SignInPage(driver);
//        MainTest myAccountPage = new MainTest(driver);
//        WishlistPage wishlistPage = new WishlistPage();
//        ComparePage comparePage = new ComparePage();

        // Scenario Steps
        homePage.maximizeWindow();
        homePage.printCurrentTitle();
        homePage.clickSignIn();

//        signInPage.signIn();
//        signInPage.clickSignInLink();
//        signInPage.fillEmail("shiksha@gmail.com");
//        signInPage.fillPassword("admin@1234");
//        signInPage.clickSignInButton();
//
//        myAccountPage.navigateToMyAccount();
//        myAccountPage.addShippingAddress();
//        myAccountPage.changeBillingAddress();

//        wishlistPage.addToWishlist();
//        wishlistPage.visitMyWishlist();
//        wishlistPage.removeFirstItem();
//        wishlistPage.addToCartLastItem();
//
//        comparePage.addToCompare();
//        comparePage.addToCartWithMoreReviews();
//        comparePage.removeItemsFromComparison();


    }

}