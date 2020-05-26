package SVG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class SVGDemo {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(System.getProperty("user.dir")+ "/Index.html");

        System.out.println("Driver Initialized");

        String color = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
        System.out.println(color);

        String text = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='name']")).getText();
        System.out.println(text);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
        System.out.println("Driver Closed");
        driver.quit();
    }
}
