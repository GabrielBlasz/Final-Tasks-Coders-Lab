package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssertsMethods extends BasePage {

    public AssertsMethods(WebDriver driver) {
        super(driver);
    }

    ////////////////////////////Login

    @Fi4ndBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span")
    private WebElement checkUser;

    public String LoggedIn(){
        return checkUser.getText();}


    ////////////////////////// Login


    /////////////////////////Shopping Steps

    //1. Metoda do asercji na sprawdzenie poprawnego adresu URL

    public String checkURL() {
        return driver.getCurrentUrl();
    }

    //2. Metoda do asercji na sprawdzenie czy produkt dodał się poprawnie do koszyka

   @FindBy(xpath = "//a[contains(text(), 'Proceed to checkout')]") // sprawdziłem czy jest przycisk proceed to checkout
    private WebElement checkAddToCart;

    public String AddProduct() {
        return checkAddToCart.getAttribute("class"); // pobrałem nazwę klasy

    }


    //3. Metoda asercji na sprawdzenie czy jesteśmy na stronie karty


    }
















