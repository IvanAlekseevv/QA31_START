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
        wd.findElement(By.cssSelector("table tr:last-child"));
        // Maria Anders - one element
        wd.findElement(By.cssSelector("table tr:nth-child(2) td:nth-child(2)"));
        // last column - all element

        // th elements
        wd.findElement(By.cssSelector("table tr th"));
        // Centro comercial Moctezuma	FranciscoChang	Mexico - one element
        wd.findElement(By.cssSelector("table tr:nth-child(4)"));
        // Giovanni Rovelli - one element
        wd.findElement(By.cssSelector("table tr:nth-child(9) td:nth-child(2)"));
        // first column - all element
        wd.findElements(By.cssSelector("")); 

    }
}
