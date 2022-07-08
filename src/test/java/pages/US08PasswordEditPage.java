package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US08PasswordEditPage {
    public US08PasswordEditPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signIn;
    @FindBy(xpath="//span[normalize-space()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath="//h5[@class='modal-title']//span[contains(text(),'Sign in')]")
    public WebElement signInPage;
    @FindBy(xpath="//input[@id='username']")
    public WebElement userNameTextBox;
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement secondSignInButton;
    @FindBy(xpath="//span[normalize-space()='team87user02 team87user02']")
    public WebElement userNameLoginPage;
    @FindBy(xpath="//span[normalize-space()='Password']")
    public WebElement passwordButtonLoginPage;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/span[1]")
    public WebElement passwordPage;
    @FindBy(xpath="//input[@id='currentPassword']")
    public WebElement currentPassword;
    @FindBy(xpath="//input[@id='newPassword']")
    public WebElement newPassword;
    @FindBy(xpath="//input[@id='confirmPassword']")
    public WebElement newPasswordConfrm;
    @FindBy(xpath="//span[normalize-space()='Save']")
    public WebElement saveButton ;
    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement passChangeMessage ;
}