package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchingBasedOnTitle {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowsBtn")).click();
        String parentID = driver.getWindowHandle();
        Set<String> allWin = driver.getWindowHandles();

        for (String handle : allWin) {
            String Title = driver.switchTo().window(handle).getTitle(); // getting Title for each window
            System.out.println(Title);

            if (!Title.equals("Basic Controls - H Y R Tutorials")) {
                driver.close();
            }
            if (Title.equals("Basic Controls - H Y R Tutorials")) {  //comparing title and swiching to handle based on title
                driver.switchTo().window(handle);

                driver.manage().window().maximize();
            }
        }
    }
}
