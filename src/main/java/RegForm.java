import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegForm {

    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public RegForm(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(className = "fxtm-input-field")
    WebElement regFormFirstNameInput;



    public void regFormFirstNameInput(){

        regFormFirstNameInput.click();
    }


}
