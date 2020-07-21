package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium02Checkboxes {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/h5")).click();
        WebElement box1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
        WebElement box2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));
        Thread.sleep(2000);
        box1.click();

        Thread.sleep(2000);
        box2.click();
        Thread.sleep(6000);
        driver.close();
        driver.quit();

    }

}