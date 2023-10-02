package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
