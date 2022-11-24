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
import pages.ShoppingStepsPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ShoppingStepsTests {

    private WebDriver driver;

    @Given("User is logged")
    public void SetupBrowser(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginUser = new LoginPage(driver);
        loginUser.loginAs();

    }

    @When("search Hummingbird Printed Sweater")
    public void searchSweater(){

        ShoppingStepsPage searchProduct = new ShoppingStepsPage(driver);
        searchProduct.searchSteps();
    }

    @Then("a product search page will open")
    public void checkUrlAddressSearchPage(){

        AssertsMethods checkUrl = new AssertsMethods(driver);
        Assert.assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=search&s=Hummingbird+Printed+Sweater",checkUrl.checkURL());

    }

    @When("clicking Hummingbird Printed Sweater")
    public void clickingSweater(){

        ShoppingStepsPage clickProduct = new ShoppingStepsPage(driver);
        clickProduct.pageProductClick();

    }

    @Then("product page is open")
    public void checkUrlAddressProductPage(){

       AssertsMethods checkUrl = new AssertsMethods(driver);
       Assert.assertEquals("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s", checkUrl.checkURL());

    }

    @When("the selected size is M")
    public void selectSize(){

        ShoppingStepsPage takeSize = new ShoppingStepsPage(driver);
        takeSize.choseSize();



    }

    @Then("M size is selected")
    public void checkUrlAddressProductSize(){

        AssertsMethods checkUrl = new AssertsMethods(driver);
        Assert.assertEquals("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=10&rewrite=brown-bear-printed-sweater&controller=product#/2-size-m",checkUrl.checkURL());


    }

    @When("^set the \"(.*)\" to 5 and clicking button Add to cart$")
    public void setTheToAndClickingButtonAddToCart(String quantity) {

        ShoppingStepsPage chosenQuantity = new ShoppingStepsPage(driver);
        chosenQuantity.choseQuantity(quantity);

    }

    @Then("Product successfully added to your shopping cart")
    public void succesAddedProduct(){

        AssertsMethods CheckAddToCart = new AssertsMethods(driver);
        Assert.assertEquals("btn btn-primary",CheckAddToCart.AddProduct()); // sprawdzenie czy widnieje przyciosk w okienku poprzez nazwę klasy

    }

    @When("use PROCEED TO CHECKOUT")
    public void useButtonProceedToCheckout(){

        ShoppingStepsPage clickButtonProceed = new ShoppingStepsPage(driver);
        clickButtonProceed.clickProceedButton();

    }

    @Then("will find ourselves in the basket")
    public void ShoppingCart(){

        AssertsMethods checkUrl = new AssertsMethods(driver);
        Assert.assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show", checkUrl.checkURL());

    }

   @And("clicking button PROCEED TO CHECKOUT")
    public void clickingProceedToCheckOut(){

        ShoppingStepsPage clickSecondButtonProceed = new ShoppingStepsPage(driver);
        clickSecondButtonProceed.clickSecondProcededToCheckout();


    }

    @When("address is selected click continue")
    public void continueSelectedAddress(){

        ShoppingStepsPage clickContinueSellectAddres = new ShoppingStepsPage(driver);
        clickContinueSellectAddres.continueAddresButton();

    }

    @When("presta shop is selected click continue")
    public void prestaShopContinue(){

        ShoppingStepsPage clickContinueShip = new ShoppingStepsPage(driver);
        clickContinueShip.continueShippingButton();
    }

    @When("payment is selected click pay by check")
    public void clickPayByCheck(){

        ShoppingStepsPage payByCheck = new ShoppingStepsPage(driver);
        payByCheck.payByCheck();

    }

    @And("selected agree checkbox and click Order with an obligation to pay")
    public void agreeCheckbox(){

        ShoppingStepsPage checkBoxAgree = new ShoppingStepsPage(driver);
        checkBoxAgree.checkBoxAgreeAndOrderObligationPay();

    }

    @When("Order is done take screenshot and save as desktop")
    public void screenShotSave() throws IOException {

        ShoppingStepsPage screenshot = new ShoppingStepsPage(driver);
        screenshot.takeScreenshot("Order");


    }







    }


