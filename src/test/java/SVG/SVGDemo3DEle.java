package SVG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.util.List;

public class SVGDemo3DEle {

    public static void main(String[] args) {


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://debeissat.nicolas.free.fr/svg3d.php");

        System.out.println("Driver Initialized");

        driver.switchTo().frame("svg_result");

        List <WebElement> elementsList = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g'" +
                " and @id='g2']//*[local-name()='path' and contains(@id,'face')]"));

        while (true){

            for (WebElement ele:elementsList){
                String text = null;
                text = ele.getAttribute("d");
                System.out.println(text);
            }
        }

    }
}
