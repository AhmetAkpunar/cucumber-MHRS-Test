package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MHRSPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

public class MhrsStepdefinitions {
    MHRSPage bp = new MHRSPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);


    @Given("mhrs randevu al sitesine git")
    public void mhrs_randevu_al_sitesine_git() {
        Driver.getDriver().get(ConfigReader.getProperty("mhrsUrl"));
    }

    @Given("gecerli {string} ve gecerli {string} gir")
    public void gecerli_ve_gecerli_gir(String string, String string2) {
        bp.usernameTextBox(ConfigReader.getProperty("kimlikNo"));
        bp.passwordTextBox(ConfigReader.getProperty("sifre"));
        bp.girisButtonu();
    }

    @Given("hastane randevusu bul butonuna tikla")
    public void hastane_randevusu_bul_butonuna_tikla() {
        bp.kapatButtonu();
        bp.randevuAlButton();
    }

    @Given("genel aramaya gore ara")
    public void genel_aramaya_gore_ara() {
        ReusableMethods.wait(1);
        bp.geneleGoreAraButtonu();
    }

    @Given("il {string} sec")
    public void il_sec(String string) {
        bp.sehirSecDropBox();
        bp.elazigSec();

    }

    @Given("ilce {string} sec")
    public void ilce_sec(String string) {

        bp.ilceSec();
        bp.ilceSecBox.click();
        actions.click(bp.merkezSec).perform();
        ReusableMethods.wait(2);
    }

    @Given("klinik {string} sec")
    public void klinik_sec(String string) {
        bp.clinic.click();
        bp.dahiliyeSec.click();
    }

    @Given("tarih {string} sec")
    public void tarih_sec(String string) {
        bp.baslangicZaman.get(0).click();
        bp.april24th.click();
    }

    @Given("randevu ara buttonuna tikla")
    public void randevu_ara_buttonuna_tikla() {
        bp.randevuAraButton.click();
    }

    @Given("listeden herhangi bir doktoru sec")
    public void listeden_herhangi_bir_doktoru_sec() {
        bp.doktorListesi.get(4).click();
    }

    @Given("istedigin saati sec")
    public void istedigin_saati_sec() {
        bp.saatListesi.get(1).click();
        bp.randevuSaati.click();
    }

    @Given("tamam butununa tikla")
    public void tamam_butununa_tikla() {
        wait.until(ExpectedConditions.visibilityOf(bp.tamamButton)).click();
    }

    @Given("randevu onayla buttona tikla")
    public void randevu_onayla_buttona_tikla() {
        ReusableMethods.wait(2);
        wait.until(ExpectedConditions.visibilityOf(bp.randevuOnayla)).click();
    }

    @Then("randevu alindigini dogrula")
    public void randevu_alindigini_dogrula() throws IOException {
        ReusableMethods.wait(2);
        bp.randevuOnaylaButton.click();
        ReusableMethods.getScreenshot("randevu onayi");
    }

}
