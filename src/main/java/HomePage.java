import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriverWait wait;
    ChromeDriver chromeDriver;


    public HomePage(ChromeDriver chromeDriver){
        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/div/nav[1]/div/div/div[1]/div/a")
    WebElement homeButton;

    public boolean homeButtonClickBoolean() {
        homeButton.click();
        return true;
    }

    public void homeButtonClick() {
        homeButton.click();
    }


    @FindBy(xpath = "//*[@id=\"nav-line\"]/ul/li[1]/div[1]")
    WebElement aboutUs;

    public void aboutUsClick(){

        aboutUs.click();
    }

    public boolean aboutUsClickBoolean(){

        aboutUs.click();
        return true;
    }

    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/header/div/div/div[2]/ul/li[1]/a")
    WebElement logIn;

    public void logInClick(){

        logIn.click();
    }

//    public boolean logInClickBoolean(){
//
//        return register.isEnabled();
//    }

    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/header/div/div/div[2]/ul/li[2]/a")
    WebElement register;

    public void registerClick(){

        register.click();
    }

//    public boolean registerClickBoolean(){
//
//        return register.();
//    }

    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/section[6]/div/div/div/img[1]")
    WebElement logo;

//    public boolean logoClickBoolean(){
//
//        return logo.isEnabled();
//    }
}
