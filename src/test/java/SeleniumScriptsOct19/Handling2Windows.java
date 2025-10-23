package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;   // easy swiching to child and performing click

public class Handling2Windows {

    static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.id("newTabBtn")).click();

        // Get Parent window ID
        String parentID=driver.getWindowHandle();

        System.out.println("Get Parent window ID  "+parentID);

        Set<String> allWindowIDS = driver.getWindowHandles();

        List<String> liIDS= new ArrayList<>(allWindowIDS);

        for (String id:liIDS ){
            //if(id.)
            System.out.println(id);
        }

        System.out.println("Child windo ID   "+liIDS.get(1));
        // switching to child window
        driver.switchTo().window(liIDS.get(1));

        driver.findElement(By.id("alertBox")).click();

        driver.switchTo().alert().accept();

        //driver.quit();
        driver.close();

    }
}
