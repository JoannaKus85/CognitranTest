import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class WebTest {

    public static void main(String[] args)   {


        System.setProperty("webdriver.chrome.driver" , "/Users/joanna.kus/Desktop/Chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");

        driver.manage().window().maximize();

        //Akceptacja plików cookie
        driver.findElement(By.id("L2AGLb")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox =  driver.findElement(By.name("q"));

        searchBox.sendKeys("Gildia");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchBox.sendKeys(Keys.ENTER);
        WebElement searchResult = driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3"));
        searchResult.click();

        driver.findElement(By.xpath("//a[contains(text(),'komiksy')]")).click();
        //Wyszukiwanie kategorii komiksu
        driver.findElement(By.xpath("//a[contains(text(),'horror')]")).click();

        }


















    }


