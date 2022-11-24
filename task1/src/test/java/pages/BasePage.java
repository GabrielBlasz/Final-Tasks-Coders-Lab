package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver; // musimy przekazać drivera, protected aby można było dziedziczyć,

    public BasePage(WebDriver driver) { // konstruktor dzięki któremu możemy używać FindBy@,
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
