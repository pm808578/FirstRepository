package SeleniumScriptsOct19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessExecution {

    //Use ChromeOptions or FirefoxOptions for headless execution.
    static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.amazon.in/ref=nav_logo");
        System.out.println(driver.getTitle());

    }


}
