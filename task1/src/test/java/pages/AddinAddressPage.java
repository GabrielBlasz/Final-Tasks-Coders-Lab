package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddinAddressPage extends BasePage {
    public AddinAddressPage(WebDriver driver) {
        super(driver);
    }

    // alias

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    private WebElement aliasInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    private WebElement adressInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    private WebElement postalCodeInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    private WebElement cityInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    private WebElement countryInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    private WebElement phoneInput;


    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div[1]/div/div/form/div/div[1]/div[1]/input")
    private WebElement clickSomeone; /// kliknięcie na pole adresu bo pauzy nie działają


    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement clickSave;






    public void submmittingAddres(String alias, String address, String postalCode, String city, String country, String phone) {
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys (alias);

        adressInput.click();
        adressInput.clear();
        adressInput.sendKeys(address);

        postalCodeInput.click();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);

        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);

        countryInput.click();
        countryInput.sendKeys(Keys.DOWN, Keys.RETURN);

        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        clickSomeone.click();

        clickSave.click();




    }



}



