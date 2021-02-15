import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class FirstTest {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test start");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/");
    }

    @Test //sign up
    public void firstTest() {
        driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("Svetlana");
        driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//button[@onclick=\"register()\"]")).click();
    }

    @Test  //add to cart Nexus 6
    public void addToCartNexus6() {
        driver.findElement(By.xpath("//*[text()[contains(.,'Nexus 6')]]")).click();
        driver.get("https://www.demoblaze.com/prod.html?idp_=3");
        driver.findElement(By.xpath("//a[@onclick='addToCart(3)']")).click();
        driver.get("https://www.demoblaze.com/prod.html?idp_=3#");
        driver.findElement(By.xpath("//*[@id='cartur']")).click();
        driver.get("https://www.demoblaze.com/cart.html");
    }

    @Test  //add to cart Iphone 6 32gb
    public void addToCartIphone6() {
        driver.findElement(By.xpath("//*[text()[contains(.,'Iphone 6')]]")).click();
        driver.get("https://www.demoblaze.com/prod.html?idp_=5");
        driver.findElement(By.xpath("//a[@onclick='addToCart(5)']")).click();
        driver.get("https://www.demoblaze.com/prod.html?idp_=5#");
        driver.findElement(By.xpath("//*[@id='cartur']")).click();
        driver.get("https://www.demoblaze.com/cart.html");
    }

    @After
    public void close() {
        System.out.println("Test close");
            driver.close();
    }
}
