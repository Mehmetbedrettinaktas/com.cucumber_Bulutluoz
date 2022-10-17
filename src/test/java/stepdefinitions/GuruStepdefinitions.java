package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepdefinitions {
    GuruPage guruPage = new GuruPage();

    @And("cookies sorulursa kabul eder")
    public void cookiesSorulursaKabulEder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.acceptCookies.click();

    }

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {
    List<WebElement>tabloBaslikListesi= guruPage.baslikListesi;
    /*
    Listemiz webelementlerden olusuyor dolayisiyla bu webelementlerden hangisi istenen
    sutun basligini tasiyor bilemeyiz
     */
        int istenenBaslikIndexi=-3;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {

            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i;
                break;
            }
        }
        // fori loop ile tum sutun basliklari ile bana verilen istenenSutun degeri ile karsilastirdim
        // loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve bulundu ise yoluma devam etmek istiyorum
        if (istenenBaslikIndexi!=-3){ // baslik bulundu
        List<WebElement>istenenSutundakiElementler =
                Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement w:istenenSutundakiElementler){
                System.out.println(w.getText());
            }
        }else { // baslik bulunamadi
            System.out.println(" Istenen baslik bulunamadi");
        }
    }


}
