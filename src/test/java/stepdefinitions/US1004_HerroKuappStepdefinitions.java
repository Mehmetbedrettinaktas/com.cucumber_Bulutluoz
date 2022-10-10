package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HerroKuappPage;

public class US1004_HerroKuappStepdefinitions {
    HerroKuappPage herroKuappPage= new HerroKuappPage();
    @And("kullanici Add Element butona basar")
    public void kullaniciAddElementButonaBasar() {
        herroKuappPage.addElement.click();
    }

    @And("kullanici Delete butonu gorunur oluncaya kadar bekler")
    public void kullaniciDeleteButonuGorunurOluncayaKadarBekler() {

    }

    @Then("kullanici Delete butonunun gorunur oldugunu test eder")
    public void kullaniciDeleteButonununGorunurOldugunuTestEder() {
    }

    @Then("kullanici Delete butonuna basarak butonu siler")
    public void kullaniciDeleteButonunaBasarakButonuSiler() {
    }

    @And("kullanici Delete butonunun gorunmedigini test eder")
    public void kullaniciDeleteButonununGorunmediginiTestEder() {
    }
}
