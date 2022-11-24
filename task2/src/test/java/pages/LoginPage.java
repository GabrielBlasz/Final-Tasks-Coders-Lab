package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement emailInput;

    @FindBy (xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement passwordInput;

    @FindBy (xpath = "//*[@id=\"submit-login\"]")
    private WebElement clickLogin;


    public void loginAs() {

        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("dydsqpxtvivqlspgst@kvhrs.com");

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("AdamAdam");

        clickLogin.click();

    }
}