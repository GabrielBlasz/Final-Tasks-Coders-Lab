///// Kod testu odseparowany od kodu strony dzięki page object po to, aby kod przypominał poruszanie się po stronie


package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AssertsMethods;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginSite { // jest to klasa która wywoła nam test

    private WebDriver driver; // tworzymy pole/zmienną w klasie WebDriver(selenium) która narazie jest nullem po to, aby później je przekazać do klasy loginPage

    @Given("open the login window")
    public void SetUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");// wskazujemy gdzie mamy chrome driver do odpalenia przeglądarki
        driver = new ChromeDriver(); //tworzymy nowy obiekt Chromedriver z klasy WebDriver
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // za każdym razem przy @Findby będzie czekał 2 sekundy
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");

    }

    @When("the form is completed")
    public void userLoginProfile(){
        LoginPage loginUser = new LoginPage(driver);  // tworzymy nowy obiekt z klasy LoginPage żeby wywołać metodę loginAs()
        loginUser.loginAs();
    }

    @Then("succes login")
    public void succesLogin() {
        AssertsMethods goodLogin = new AssertsMethods(driver);
        assertEquals("Adam Adam", goodLogin.LoggedIn());
        AssertsMethods pause = new AssertsMethods(driver);
        pause.uglyPause(1000);  // brzydka pauza ale nie wiem jak inaczej
    }


    @And("go to the adress tab")
    public void goToTheAdressTab() {

        AssertsMethods checkWww = new AssertsMethods(driver);
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=address", checkWww.checkURL() );

        }


    }

