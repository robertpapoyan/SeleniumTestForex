import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

    HomePage homepage;
    Scroll scroll;
    ChromeDriver chromeDriver;
    RegForm regForm;
    LogInPage logInPage;

    @BeforeClass
    public static void driverSetUp(){
        System.setProperty("webdriver.chrome.driver",
                             "C:\\Users\\Robert.Papoyan\\Desktop\\BrowserDrivers\\chromedriver.exe");
    }

    @Before
    public void browserSetUp() throws InterruptedException {
    chromeDriver = new ChromeDriver();
    chromeDriver.get("https://www.forextime.com/");

    Thread.sleep(1000);

    homepage = new HomePage(chromeDriver);
    scroll = new Scroll(chromeDriver);
    logInPage = new LogInPage(chromeDriver);

    }



    @Test
    public void test1_homePageElementsInit() throws InterruptedException {

        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().refresh();

        Thread.sleep(2000);

        Assert.assertTrue(homepage.aboutUs.isDisplayed());
        Assert.assertTrue(homepage.homeButton.isDisplayed());
        Assert.assertTrue(homepage.logIn.isDisplayed());
        Assert.assertTrue(homepage.register.isDisplayed());
    }

    @Test
    public void test2_homePageElementsClick() throws InterruptedException {

        chromeDriver.manage().window().maximize();

        Thread.sleep(1500);

        Assert.assertTrue(homepage.homeButtonClickBoolean());
        Assert.assertTrue(homepage.aboutUsClickBoolean());
    }

    @Test
    public void test3_logIn() throws InterruptedException {

    chromeDriver.manage().window().maximize();
    homepage.logIn.click();
    Thread.sleep(2000);

    Assert.assertTrue(logInPage.enterButtonBoolean());
    logInPage.logInMethod();
    Thread.sleep(2000);
    }

    @Test
    public void test4(){

    }

    @After
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(1500);
        chromeDriver.quit();
    }
}
