package SeleniumScriptsOct19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotClass {

    static void main(String[] args) throws AWTException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// login steps
        driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");

        driver.findElement(By.id("usernameField")).sendKeys("pm808578@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Pragati@28");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//a[contains(text(),'View') and @href='/mnjuser/profile']")).click();

        driver.findElement(By.xpath("//input[@value='Update resume']")).click();



        // Robot method  // copying to clipboard
        StringSelection filepath= new StringSelection("C:\\Users\\PRAGATI\\OneDrive\\Desktop\\TestingNewStudy\\RESUMES\\PragatiAutomation6.pdf");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        //paste
        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        // Pressing Enter

        rb.keyPress(KeyEvent.VK_ENTER);



    }
}
