import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public Scroll(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver,this);
    }

    public void downScroll() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
        jse.executeScript("window.scrollBy(0, 350)", "");
        Thread.sleep(2000);
    }

    public void upScroll() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
        jse.executeScript("window.scrollBy(350, 0)", "");
        Thread.sleep(2000);
    }
}
