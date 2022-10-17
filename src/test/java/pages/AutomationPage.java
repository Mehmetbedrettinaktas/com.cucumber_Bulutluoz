package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@title='Log in to your customer account']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement createEmail;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public WebElement creatAnaccount;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrButton;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;
}
