package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class XpathPractice6Nov {

    static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ikea.com/in/en/cat/lowest-price/");

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

List<WebElement> allitems= driver.findElements(By.xpath("//span[@class='plp-price__integer' and text()<1000]/ancestor::div[@data-skapa='price-module@9.0.3']/descendant::span[2]"));

    for (WebElement name : allitems)
    {

        System.out.println(name.getText());
    }

        System.out.println();
        System.out.println("...................................");
    // get all the items in flipkart menu
    driver.navigate().to("https://www.flipkart.com/");
   List<WebElement> menu= driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/descendant::span[@class='_1XjE3T']/child::span"));
        for (WebElement name : menu)
        {

            System.out.println(name.getText());
        }

    }
}
