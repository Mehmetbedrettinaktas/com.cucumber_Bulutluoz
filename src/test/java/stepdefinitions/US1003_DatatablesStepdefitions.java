package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DatatablesPage;

public class US1003_DatatablesStepdefitions {
    DatatablesPage datatablesPage= new DatatablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        datatablesPage.newButton.click();
    }

    @And("firstName bolumune {string} yazar")
    public void firstnameBolumuneYazar(String firstName) {
        datatablesPage.firstName.sendKeys(firstName);
    }

    @And("lastname bolumune {string} yazar")
    public void lastnameBolumuneYazar(String lastName) {
        datatablesPage.lastName.sendKeys(lastName);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        datatablesPage.position.sendKeys(position);
    }

    @And("office bolumune {string} yazar")
    public void officeBolumuneYazar(String office) {
        datatablesPage.office.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        datatablesPage.extension.sendKeys(extension);
    }

    @And("startDate bolumune {string} yazar")
    public void startdateBolumuneYazar(String starDate) {
        datatablesPage.startDay.sendKeys(starDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        datatablesPage.salary.sendKeys(salary);

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        datatablesPage.create.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
datatablesPage.search.sendKeys(firstName);
    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {
        Assert.assertTrue(datatablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }
}
