package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWidows {  // close all except parent

    static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowsBtn")).click();
        String parentID=driver.getWindowHandle();
        Set<String> allWin= driver.getWindowHandles();

        for (String  ID: allWin)
        {
            driver.switchTo().window(ID);
            System.out.println(driver.switchTo().window(ID).getTitle());

            if (!ID.equals(parentID))   // closing all except parent
            {
                driver.close();
            }
        }
        driver.close();


    }
}
