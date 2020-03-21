import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args){
        String url = "http://www.wikipedia.org";

        //run driver
        SafariDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement drpLanguage = driver.findElement(By.name("language"));
        Select language = new Select(driver.findElement(By.id("searchLanguage")));
        language.selectByValue("pl");

       // WebElement element = driver.findElement(By.name("search")); //q z inspect element na stronie
        //element.sendKeys("mars");

        //element.submit();

//        //close driver
//        driver.close();
    }
}
