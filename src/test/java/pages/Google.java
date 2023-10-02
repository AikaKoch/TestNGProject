package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class Google {

    @Test
    public void searchGoogle() {
        Faker faker = new Faker();
        String randomWord = faker.lorem().word();
        Driver.getDriver().get("https://Google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys(randomWord + Keys.ENTER);
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue("test failed", title.contains(randomWord) );
        Driver.closeDriver();
    }
}
