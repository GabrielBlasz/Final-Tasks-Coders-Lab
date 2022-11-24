package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AssertsMethods;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginSite {

    private WebDriver driver;

    @Given("open the login window")
    public void SetupBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");

    }

    @When("the form is completed")
    public void userLoginProfile(){
        LoginPage loginUser = new LoginPage(driver);
        loginUser.loginAs();
    }

    @Then("succes login")
    public void succesLogin() {
        AssertsMethods goodLogin = new AssertsMethods(driver);
        assertEquals("Adam Adam", goodLogin.LoggedIn());
        AssertsMethods pause = new AssertsMethods(driver);
    }





}
