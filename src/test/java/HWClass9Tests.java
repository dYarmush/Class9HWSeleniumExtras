import io.opentelemetry.api.internal.StringUtils;
import org.apache.commons.io.FileUtils;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class HWClass9Tests {
    private static WebDriver driver;
    private static WebElement element;
    public static Actions myAction;
    private static String filePath = "C:\\Users\\doviy\\Desktop\\test.png";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\doviy\\Downloads\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        myAction = new Actions(driver);
    }

    @Test
    public void test01() {
        driver.get("https://dgotlieb.github.io/WebCalculator/");
        element = driver.findElement(By.id("seven"));
        System.out.println(element.getSize());


    }
    @Test
    public void test02sixDisplayed(){
        element=driver.findElement(By.id("six"));
        System.out.println(element.isDisplayed());
    }
//    @Test
//    public void test03SimpleMath(){
//        String total = "10";
//
//        myAction.click(driver.findElement(By.id("six"))).click(driver.findElement(By.id("add")))
//                .click(driver.findElement(By.id("four"))).click(driver.findElement(By.id("equal"))).build().perform();
//        //What is the difference between doing it the previous way and the following?
////        driver.findElement(By.id("six")).click();
////        driver.findElement(By.id("add")).click();
////        driver.findElement(By.id("four")).click();
////        driver.findElement(By.id("equal")).click();
//        element=driver.findElement(By.id("screen"));
//
//        Assert.assertEquals(total,element.getText());
//
//    }
//    @Test
//    public void test04WebsiteNameTest(){
//        String url = "https://www.ozzy.com";
//        String title = "Home | Ozzy Osbourne Official Site";
//        driver.get("https://www.ozzy.com");
//        Assert.assertEquals(url,);
//    }
//    @Test
//    public void test05RunWithoutExtensions(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-extensions");
//        driver = new ChromeDriver(options);
//    }
//    @Test
//    public void test06AdvancedActions(){
//        driver.get("https://dgotlieb.github.io/Actions");
//        element = driver.findElement(By.id("div1"));
//
//        File f = element.getScreenshotAs(OutputType.FILE);
//       try {
//           FileUtils.copyFile(f, new File("C:\\Users\\doviy\\Desktop\\screenshotElement.png"));
//       } catch (IOException i){
//
//       }
//
//    }
//    @Test
//    public void test07DoubleClick() throws InterruptedException {
//        //double click test
//        driver.get("https://dgotlieb.github.io/Actions");
//        element=driver.findElement(By.cssSelector("p[ondblclick='doubleClickFunction()']"));
//        Assert.assertFalse(element.isDisplayed()==false);
//        myAction.doubleClick(driver.findElement(By.cssSelector("p[ondblclick='doubleClickFunction()']"))).perform();
//        Assert.assertTrue(element.isDisplayed()==true);

        //mouse hover test
//        element=driver.findElement(By.cssSelector("img[onmouseover='bigImg(this)']"));
//        myAction.moveToElement(element).perform();
////      select 2 elements from a list
//        element=driver.findElement(By.cssSelector("select[name='food']"));
//        Select selection = new Select(element);
//        selection.selectByVisibleText("Pizza");
//        selection.selectByVisibleText("Burger");
//
//        //file upload test
//        driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\doviy\\Desktop\\screenshotElement.png");
//
//        //scroll to bottom
//        element= driver.findElement(By.id("clickMe"));
//       // myAction.scrollToElement(element).perform();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//    }
//    @Test
//    public void test08Controllers(){
//        driver.get("https://dgotlieb.github.io/Controllers/");
//        //select "Cheese" radio button
//        element=driver.findElement(By.cssSelector("input[value='Cheese']"));
//        element.click();
//
//        //Select "Milk" from dropdown menu
//        Select choice = new Select(driver.findElement(By.cssSelector("select[name='dropdownmenu")));
//        choice.selectByValue("Milk");
//
//        //print dropdown menu choices
//        List<WebElement> choiceOptions = choice.getOptions();
//        int size = choiceOptions.size();
//        for(int i =0; i<size ; i++){
//            String options = choiceOptions.get(i).getText();
//            System.out.println(options);
//        }
//
//    }
//    @Test
//    public  void test09PrintHeightAndWidth(){
//        driver.get("https://dgotlieb.github.io/WebCalculator/");
//        element= driver.findElement(By.id("two"));
//        System.out.println(element.getRect().getHeight());
//        element= driver.findElement(By.id("six"));
//        System.out.println(element.getRect().getWidth());
//
//    }
//    @Test
//    public void test10WordCounter(){
//        driver.get("https://www.themarker.com");
//
//        /* Counts how many times the substring appears in the larger string. */
//       String text = driver.getPageSource();
//       String str = "news";
//        { Matcher matcher = Pattern.compile(str).matcher(text);
//
//            int count = 0;
//            while (matcher.find()) {
//                count++;
//            }
//            System.out.println("The word news occurs " +count+" times.");
//        }
//     }
    @Test
    public void test11PrintPage(){
        driver.get("https://www.ozzy.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.print();");


    }
}
