import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {

    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public LogInPage(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver,30);
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(xpath = "//*[@id=\"login\"]")
    WebElement idField;

    public void idFieldClick(){

        idField.click();
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordField;

    public void passwordFieldClick(){

        passwordField.click();
    }

    @FindBy(xpath = "//*[@id=\"auth\"]")
    WebElement enterButton;

    public boolean enterButtonBoolean(){
        boolean a = enterButton.isEnabled();
        System.out.println(a);
        return a;
    }

    public void enterButtonClick(){
        enterButton.click();
    }

    public void logInMethod() throws InterruptedException {

        idField.click();
            Thread.sleep(800);

        idField.sendKeys("61");
            Thread.sleep(1000);
        idField.sendKeys("88");
            Thread.sleep(1000);
        idField.sendKeys("99");
            Thread.sleep(1000);
        idField.sendKeys("62");
            Thread.sleep(1200);

        passwordField.sendKeys("as");
            Thread.sleep(1000);
        passwordField.sendKeys("das");
            Thread.sleep(1000);
        passwordField.sendKeys("d1");
            Thread.sleep(1000);
        passwordField.sendKeys("23");
            Thread.sleep(1000);

        enterButton.click();
    }
}
