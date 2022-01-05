import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableCSS {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void tableTest(){
        wd.findElement(By.cssSelector("table"));
        // tr9 - one element
        // Maria Anders - one element
        // last column - all element
        // th elements
        // Centro comercial Moctezuma	FranciscoChang	Mexico - one element
        // Giovanni Rovelli - one element
        // first column - one element


    }
}
