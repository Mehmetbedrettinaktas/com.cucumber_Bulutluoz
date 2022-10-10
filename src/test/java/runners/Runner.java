package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",  // iki TC'zi birlikte calistirmak icin  "@nutella or java"
        dryRun = false
)
public class Runner {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class boday'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan 2 adet anataion vardir

    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framwork'umuzde Junit kullanmayi tercih ediyoruz

    features : runner dosyasinin feature dosyalarin nereden bulacagini gosterir
    glue: step definitions dosyalarini  nerede bulacagimizi gosterir
    tags: o an hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun = true yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir.
    ve creat edecegimiz methodlari bize verir.
    dryRun =false yazdigimizda testlerimizi calistirir


    */
}
