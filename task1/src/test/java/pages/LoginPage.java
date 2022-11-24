///// Kod strony www odseparowany od kodu testu dzięki page object po to, aby kod testu był czytelniejszy

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver); // skracamy konstruktor w każdym Page Objekcie do jednej funkcji (wywołaj mi kopnstuktor z Base page)
    }

    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement emailInput; // tworzenie obiektu z klasy Webelement opisanej w selenium aby móc odwołać się do znalezionego elementu na stronie

    @FindBy (xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement passwordInput;

    @FindBy (xpath = "//*[@id=\"submit-login\"]")
    private WebElement clickLogin;

    @FindBy (xpath = "//*[@id=\"address-link\"]/span/i")
    private WebElement clickAddFirstAddress;



    public void loginAs(){

        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("dydsqpxtvivqlspgst@kvhrs.com");

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("AdamAdam");

        clickLogin.click();

        clickAddFirstAddress.click();


    }








}



