package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium02ButtonWaitToDisappear {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[21]/a/img")).click();
        Thread.sleep(6000);
        WebElement btn = driver.findElement(By.id("show"));

        System.out.println(btn.getText());

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}