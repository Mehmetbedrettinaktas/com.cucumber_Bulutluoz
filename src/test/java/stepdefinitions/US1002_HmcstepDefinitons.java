package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelmycampPage;
import utilities.ConfigReader;

public class US1002_HmcstepDefinitons {
    HotelmycampPage hotelmycampPage= new HotelmycampPage();
    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
    hotelmycampPage.logIn.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hotelmycampPage.userName.sendKeys("HotelmycampValidUsername");
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hotelmycampPage.password.sendKeys("HotelmycampValidPassword");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hotelmycampPage.loginButtonu2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hotelmycampPage.hotelManagment.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hotelmycampPage.password.sendKeys(ConfigReader.getProperty("HotelmycampWrongdPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hotelmycampPage.girilmediYaziElementi.isDisplayed());

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotelmycampPage.userName.sendKeys(ConfigReader.getProperty("HotelmycampWrongdUsername"));
    }

    @And("gecersiz username olarak{string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hotelmycampPage.userName.sendKeys(username);
    }

    @And("gecersiz password olarak{string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hotelmycampPage.password.sendKeys(password);

    }
}
