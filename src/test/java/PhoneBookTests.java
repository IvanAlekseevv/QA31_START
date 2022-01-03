import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBookTests {

    WebDriver wd;

    @BeforeMethod
    public void openSite(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        //wd.get("url"); //without history
       wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); //with history ---back forward refresh
    }

    @Test
    public void phoneBookStart(){
        WebElement element = wd.findElement(By.tagName("a"));
       List<WebElement> list = wd.findElements(By.tagName("a"));

       element.sendKeys("Hello");
       WebElement elId = wd.findElement(By.id("root"));
        WebElement elClass = wd.findElement(By.className("container"));
        WebElement elName = wd.findElement(By.name("nameEx"));
        WebElement elLink = wd.findElement(By.linkText("HOME"));
        WebElement elPlink = wd.findElement(By.partialLinkText("HOM"));
    }

    @Test
public void fillFormLogin(){
       List <WebElement> list = wd.findElements(By.tagName("input"));
       WebElement inputEmail = list.get(0);
       WebElement inputPassword = list.get(1);

       inputEmail.click();
       inputEmail.clear();
       inputEmail.sendKeys("noa@gmail.com");

       inputPassword.click();
       inputPassword.clear();
       inputPassword.sendKeys("Nnoa12345$");

       WebElement buttonLogin = wd.findElement(By.tagName("button"));
       buttonLogin.click();
    }


    @AfterMethod
    public void close(){
        //wd.quit();
        //wd.close();

    }
}
