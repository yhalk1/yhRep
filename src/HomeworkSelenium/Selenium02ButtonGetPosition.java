package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium02ButtonGetPosition {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();

        WebElement Image = driver.findElement(By.id("position"));
        Point classname = Image.getLocation();
        int xcoord = classname.getX();
        System.out.println("Element's Position from left side is "+xcoord +" pixels.");
        int ycoord = classname.getY();
        System.out.println("Element's Position from top is "+ycoord +" pixels.");
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}