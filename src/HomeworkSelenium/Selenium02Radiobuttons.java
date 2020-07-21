package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium02Radiobuttons {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/img")).click();
        WebElement rad1 = driver.findElement(By.xpath("//*[@id=\"yes\"]"));
        Thread.sleep(2000);
        rad1.click();
        WebElement rad2 = driver.findElement(By.xpath("//*[@id=\"no\"]"));
        Thread.sleep(2000);
        rad2.click();
        Thread.sleep(6000);
        driver.close();
        driver.quit();

    }

}