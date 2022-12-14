package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US1001_amazonStepdefinitons {
    AmazonPage amazonPage= new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
    amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Then("kullanici sonuclarin Nutella icerdigini test eder")
    public void kullanici_sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @Then("kullanici Java icerdigini test eder")
    public void kullanici_java_icerdigini_test_eder() {
        String arananKelime="Java";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("kullanici sonuclarin iphone icerdigini test eder")
    public void kullaniciSonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);

    }
    @Given("kullanici sonuclarin {string} icerdigini test eder")
    public void kullanici_sonuclarin_icerdigini_test_eder(String istenKelime) {
        String arananKelime=istenKelime;
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @And("kullanici url'in {string} icerdigini test eder")
    public void kullaniciUrlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
