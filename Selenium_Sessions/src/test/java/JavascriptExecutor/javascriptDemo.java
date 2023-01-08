package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptDemo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //1.entering a text
        js.executeScript("document.getElementById('email').value='shaikriyaz@gmail.com'");

        //2.clicking
        js.executeScript("document.getElementById('enterimg').click()");

        //3.getting text of a web element
       String str= js.executeScript("return document.getElementById('btn2').innerHTML").toString();
       System.out.println(str);







    }
}
