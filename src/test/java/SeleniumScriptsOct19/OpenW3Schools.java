package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


//20) Using Selenium WebDriver, write an automation script to open W3Schools, extract all company
//names from the "Tables" section, and verify if a specific text exists within the extracted list.
public class OpenW3Schools {

    static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();

     List<WebElement> menu= driver.findElements(By.xpath("//div[@id='menubtn_container']/following::a[@class='ga-nav']"));
        System.out.println("the no of items present are "+menu.size());
     for (WebElement item:menu)
     {
         System.out.println(item.getText());

     }
        driver.findElement(By.xpath("//a[text()='HTML']")).click();
        driver.findElement(By.xpath("//a[@title='Menu'and @onclick='open_menu()']")).click();


        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        /*WebElement table=driver.findElement(By.xpath("//a[text()='HTML Tables')"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollInToView",table);
        js.executeScript("arguments[0].click()", table);
        //driver.close()*/

    }



}
