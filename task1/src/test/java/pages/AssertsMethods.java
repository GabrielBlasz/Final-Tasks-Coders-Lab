package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssertsMethods extends BasePage {

    public AssertsMethods(WebDriver driver) {
        super(driver);
    }

    // sprawdzenie czy zalogowany poprawnie -działa

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span") // sprawdzenie po zalogowaniu napisu w górnym menu nazwy użytkownika
    private WebElement checkUser;

    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article/ul/li")  // sprawdzenie labelki na zielono
    private WebElement SuccesAddedNewAddress;


    @FindBy(css = "div.address-body") // pobranie całej tabelki tabelki z poprawnym adresem
    private WebElement checkAddresConfirmation;

    //address


    public String LoggedIn(){           // sprawdzenie po zalogowaniu napisu w górnym menu nazwy użytkownika
        return checkUser.getText();

    }


    public void uglyPause(int time){

        try {
            Thread.sleep(time);            /////////////////////////////////////////// paskudna pauza
        }
            catch (InterruptedException e){
            e.printStackTrace();
            }

    }
    /////////////////////////////////////////////////////////////////////////// koniec paskudnej pauzy

    public String checkURL(){     // assercja do sprawdzania adresu WWW (pobranie obecnego URL)
        return driver.getCurrentUrl();
    }

    public String checkConfirmationSaveAddress(){  // assercja do sprawdzenia napisu na zielono czy adres dodał się właściwie

        return SuccesAddedNewAddress.getText();
   }


   //////////assercja na sprawdzenie czy nowy adres (cała labelka) się dobrze dodał

   public String getSubmitConfirmationMessage(){    //pobieranie całej tabelki i zapisanie jej do Stringa
        return checkAddresConfirmation.getText();
   }


    }



