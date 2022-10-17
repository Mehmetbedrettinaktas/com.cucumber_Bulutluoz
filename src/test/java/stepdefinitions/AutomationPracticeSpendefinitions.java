package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeSpendefinitions {
    AutomationPage automationPage= new AutomationPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker= new Faker();

    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        automationPage.signIn.click();
    }

    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
        automationPage.createEmail.sendKeys(faker.internet().emailAddress());
    }


    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
    automationPage.creatAnaccount.click();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {
actions.click(automationPage.mrButton).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .sendKeys(faker.internet().password()).sendKeys("10").sendKeys(Keys.TAB).sendKeys("January")
        .sendKeys(Keys.TAB).sendKeys("2000").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name())
        .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("Alaska").sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).sendKeys("UnitedStates")
        .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).sendKeys("Alaska").perform();



    }



    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
        automationPage.register.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {

    }

}
