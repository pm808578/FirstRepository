package SeleniumScriptsOct19;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotProgram {

        static void main(String[] args) throws IOException {

            WebDriver driver= new ChromeDriver();

            driver.get("https://www.youtube.com/watch?v=zisAGm5I-Yw&list=PLUDwpEzHYYLs3DYFqm79fIj2QOzPke_fW&index=3");

            TakesScreenshot ts= (TakesScreenshot) driver;

            File src= ts.getScreenshotAs(OutputType.FILE);

            File dest= new File("C:\\Users\\PRAGATI\\OneDrive\\Desktop\\Projects\\MavenProject\\Screenshots\\First.png");

            FileUtils.copyFile(src,dest);


        }
    }

