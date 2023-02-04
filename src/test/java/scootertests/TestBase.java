package scootertests;
import com.example.scooters.HomePageScooter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;


public class TestBase {

    HomePageScooter objHomePage;
    WebDriver driver;

    @Before
    public void before() {
        //драйвер для браузера Chrome
        //создание экземпляра драйвера
        /* ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);*/
        // Найди раздел «Вопросы о важном» и сделать скролл до неё
        WebElement element = driver.findElement(By.cssSelector(".Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        // создай объект класса главной страницы приложения
        objHomePage = new HomePageScooter(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        // Закрыть браузер
        driver.quit();
    }
}
