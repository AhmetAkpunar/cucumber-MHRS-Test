package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MHRSPage extends Base{

    @FindBy(id = "LoginForm_username")
    private WebElement username;
    @FindBy(id = "LoginForm_password")
    private WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    private WebElement girisButtonu;
    @FindBy(xpath = "(//*[@type='button'])[13]")
    private WebElement kapatButtonu;
    @FindBy(xpath = "//*[@class='randevu-turu-grup-content']")
    private List<WebElement> randevuAl;
    @FindBy(xpath = "(//*[@type='button'])[13]")
    private WebElement geneleGoreAra;
    @FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
    private List<WebElement> sehirList;
    @FindBy(xpath = "//*[@title='ELAZIĞ']")
    private WebElement elazigSec;
    @FindBy(xpath = "(//*[@class='ant-select-selection__rendered'])[2]")
    public WebElement ilceSecBox;
    @FindBy(xpath = "(//*[@role='option'])[10]")
    public WebElement merkezSec;
    @FindBy(xpath = "(//*[@role='treeitem'])[92]")
    public WebElement dahiliyeSec;
    @FindBy(xpath = "(//*[@class='ant-form-item-children'])[5]")
    public WebElement clinic;
    @FindBy(xpath = "//*[@class='ant-calendar-picker-input ant-input']")
    public List<WebElement> baslangicZaman;
    @FindBy(xpath = "(//*[@class='ant-calendar-date'])[29]")
    public WebElement april24th;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement randevuAraButton;
    @FindBy(xpath = "//*[@class='ant-list-item']")
    public List<WebElement> doktorListesi;
    @FindBy(xpath = "//*[@class='ant-collapse-item']")
    public List<WebElement> saatListesi;
    @FindBy(xpath = "(//*[@type='button'])[17]")
    public WebElement randevuSaati;
    @FindBy(xpath = "(//*[@type='button'])[19]")
    public WebElement tamamButton;
    @FindBy(xpath = "(//*[@type='button'])[20]")
    public WebElement randevuOnayla;
    @FindBy(xpath = "(//*[@type='button'])[22]")
    public WebElement randevuOnaylaButton;

    public void usernameTextBox(String str){username.sendKeys(str);}
    public void passwordTextBox(String str){password.sendKeys(str);}
    public void girisButtonu(){girisButtonu.click();}
    public void kapatButtonu(){kapatButtonu.click();}
    public void randevuAlButton(){randevuAl.get(2).click();}
    public void geneleGoreAraButtonu(){geneleGoreAra.click();}
    public void sehirSecDropBox(){sehirList.get(0).click();}
    public void elazigSec(){elazigSec.click();}
    public void ilceSec(){sehirList.get(1).click();}



}
