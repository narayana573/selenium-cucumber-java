package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverManager;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Facebook login page")
    public void user_is_on_facebook_login_page() {
        driver = DriverManager.getDriver();
        driver.get("https://www.facebook.com/");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        loginPage = new LoginPage(driver);
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername("your_email_here");
        loginPage.enterPassword("your_password_here");
        loginPage.clickLogin();
    }

    @Then("User should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        // Add wait/asserts here to validate successful login
        DriverManager.quitDriver();
    }
}
