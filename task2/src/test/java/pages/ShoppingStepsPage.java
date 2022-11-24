package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;


public class ShoppingStepsPage extends BasePage {

    public ShoppingStepsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]") // wyszukujemy produktu
    private WebElement searchProduct;

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2/a") //klikamy na sweter
    private WebElement clickSweater;

    @FindBy(xpath = "//*[@id=\"group_1\"]") // wybieramy rozmiar
    private WebElement choseSize;

    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")// wybieramy ilość
    private WebElement choseQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")// wybieramy ilość + klik dodoaj do koszyka
    private WebElement clickAddToCart;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")// klikamy proceedbutton
    private WebElement clickProcedToCheckout;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a") // klikamy 2 przycisk proceedbutton
    private WebElement clickSecondProcededToCheckout;

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button") // klikamy continue
    private WebElement clickContinueAddres;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button") // klikamy continue 2 raz
    private WebElement clickContinueShipping;

    @FindBy(xpath = "//*[@id=\"payment-option-1\"]") // wybieramy pay by check
    private WebElement clickPayByCheck;

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]") // zaznaczamy checkboxa Aggre
    private WebElement clickCheckBoxAgree;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button") // klikamy orderWithObligationToPay
    private WebElement orderWithObligationToPay;






    public void searchSteps() { // wyszukujemy produktu

        searchProduct.click();
        searchProduct.clear();
        searchProduct.sendKeys("Hummingbird Printed Sweater");
        searchProduct.sendKeys(Keys.ENTER);
    }

    public void pageProductClick() { // klikamy na sweter

        clickSweater.click();

    }

    public void choseSize() {  // wybieramy rozmiar
        choseSize.click();
        choseSize.sendKeys(Keys.DOWN);
        choseSize.sendKeys(Keys.ENTER);

        ///////////////////////////////// sztuczna pauza bo nie wczytywała się assercja (przeklikuje raz jeszcze adres strony
        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=10&rewrite=brown-bear-printed-sweater&controller=product#/2-size-m");
        ////////////////////////////////

    }

    public void choseQuantity(String quantity){ // wybieramy ilość i klikamy dodaj do koszyka poprzez pobranie wartości quantity z pliku feature

        choseQuantity.click();
        choseQuantity.clear();
        choseQuantity.sendKeys(quantity);

        clickAddToCart.click();
    }


    public void clickProceedButton(){ // klikamy przycisk proceed button

        clickProcedToCheckout.click();


    }

    public void clickSecondProcededToCheckout(){ // klikamy drugi przycisk proceed button
        clickSecondProcededToCheckout.click();



    }

    public void continueAddresButton(){ // klikamy continue

        clickContinueAddres.click();

    }

    public void continueShippingButton(){ // klikamy continue

        clickContinueShipping.click();
    }

    public void payByCheck(){ // wybieramy pay by check

        clickPayByCheck.click();
    }


    public void checkBoxAgreeAndOrderObligationPay(){ //zaznaczamy checkboxa Aggre i klikamy orderWithObligationToPay

        clickCheckBoxAgree.click();
        orderWithObligationToPay.click();


    }



    public  void takeScreenshot(String fileName) throws IOException {

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Users/Ja/Desktop/"+ fileName+".jpg"));





    }



    //public void takeOrderScreenShot() throws Exception{
      //      TakesScreenshot ts = ((TakesScreenshot)driver);
        //    File source = ts.getScreenshotAs(OutputType.FILE);
          //  FileUtils.copyFile(source, new File("E:\\2 pass\\src\\test\\java\\tests\\screenshot"));
            //System.out.println("Screenshot");










}










