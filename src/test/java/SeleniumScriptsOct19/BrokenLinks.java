package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        int brokenlinkTota=0;
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement link:allLinks)
        {
            String href =link.getAttribute("href");
            URL url =new URL(href);  // www.href.com
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();  //https:www.
            connection.connect();
            try
            {
           if (connection.getResponseCode()>=400)
           {
               System.out.println(" its a broken link "+connection.getResponseCode());
               System.out.println(connection.getResponseMessage());
               System.out.println(brokenlinkTota++);
           }} catch (Exception e) {
                System.out.println(e.getMessage());;
            }

        }
        System.out.println(brokenlinkTota);

    }
}
