package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumbar'da step definitions package'i icerisinde @Before, @After gibi
     notasyon varsa extends testBase dememeize gerek kalmadan her scenario'dan once ve/veya
     sonra bu method'lar calisacaktir

     Bu da bizim isteyecegimiz bir durum degldir
     Cucumer'da @Before, @After kullanma ihtiyacimiz olursa bunu stepdefinitions package'i
     altinda olusturacagimiz hooks class'ina koyariz

     bizim her scenario'dan sonra test sonucunu kontrol edip failed olan
     scenario'lar icin sceenshoot almasi amaciyla @After method'u kullanacagiz

     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }

}
