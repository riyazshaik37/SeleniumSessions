package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_refreshpage
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        //refreshing  the page
        js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value='riyaz'");
        Thread.sleep(5000);
        js.executeScript("history.go(0)");

        //title of the page
       String str= js.executeScript("return document.title").toString();
       System.out.println(str);

       //scrolling down the webpage
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");





    }
}
