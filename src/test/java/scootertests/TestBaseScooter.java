package scootertests;

import com.example.scooters.OrderScooter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class TestBaseScooter {

    OrderScooter objOrderScooter;
    WebDriver driver;
     final String username;
     final String surname;
     final String address;
     final String phonenumber;



    public TestBaseScooter(String username, String surname, String address, String phonenumber) {
        this.username = username;
        this.surname = surname;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    // добавили аннотацию
    @Parameterized.Parameters(name = "Order scooter {index} -> Name: {0}, Second name: {1}, Address:{2}, Phone number:{3} ")
    public static String[][] gerOrderData() {
        return new String[][]{
                {"Андрей", "Алексеев", "Невский Проспект", "87654321113"},
                {"Петр", "Петров", "Екатеринбург", "89222222223"}
        };
    }
    @Before
    public void before() {
        //драйвер для браузера Chrome
        //создание экземпляра драйвера
       /* ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);*/
        // переход на страницу тестового приложения
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // создай объект класса главной страницы приложения
        objOrderScooter = new OrderScooter(driver);
    }


    @After
    public void after() {
        // Закрыть браузер
        driver.quit();
    }
}
