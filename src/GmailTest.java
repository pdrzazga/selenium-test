import com.sun.nio.file.ExtendedWatchEventModifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class GmailTest {
    public static void main(String[] args) {

            String url = "http://gmail.com";

            //run driver
            SafariDriver driver = new SafariDriver();
            driver.manage().window().maximize();
            driver.get(url);

            //insert user
            WebElement user = driver.findElement(By.id("identifierId"));
            user.sendKeys("paulina.test.selenium");
            driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
            delay(1000);

        //insert password
            WebElement password = driver.findElement(By.id("password"));
            //password.sendKeys("psswrd123");
            //driver.findElement(By.cssSelector("span[class='wRNPwe pVlEsd']")).click();
            delay(1000);
            if( driver.findElement(By.id("password")).isDisplayed()){

                System.out.println("Element is Visible");
            }
            else{
                System.out.println("Element is InVisible");
        }
    }

    static void delay(int time){
        try
        {
            Thread.sleep(time);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
