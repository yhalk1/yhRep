package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium02ButtonGetSize {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();

        Integer elem1 = driver.findElement(By.id("size")).getSize().getWidth();
        Integer elem2 = driver.findElement(By.id("size")).getSize().getHeight();

        System.out.println("Element's width is "+elem1 +" pixels.");

        System.out.println("Element's height is "+elem2 +" pixels.");
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}