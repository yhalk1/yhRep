import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static  void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5")).click();

        Thread.sleep(4000);

        driver.close();

    }
}
