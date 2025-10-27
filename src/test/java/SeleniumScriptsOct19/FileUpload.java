package SeleniumScriptsOct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FileUpload {

    static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.expandtesting.com/upload");

       // driver.findElement(By.xpath("//*[@id='heroSection-container']/div[3]/div[1]/div")).click();

    driver.findElement(By.xpath("//input[@id ='fileInput']")).sendKeys("C:\\Users\\PRAGATI\\OneDrive\\Desktop\\TestingNewStudy\\CD.docx");

driver.close();



    }


}
