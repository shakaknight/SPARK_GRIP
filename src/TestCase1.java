package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public static boolean isClickable(WebElement webe)      
	{
	    try
	    {
	        WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.elementToBeClickable(webe));
	        return true;
	    }
	    catch (Exception e)
	    {
	        return false;
	    }
	}
public static String browser="Chrome";
public static WebDriver driver;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://thesparksfoundation.sg");
	driver.manage().window().maximize();
	
	//Test1
	String title = driver.getTitle();
	System.out.println(title);
    String estimate_title = "The Sparks Foundation | Home";
    if(title.equalsIgnoreCase(estimate_title)){
        System.out.println("Test 1 successful!");
    }
    else{
        System.out.println("Test 1 unsuccessful!");
    }
    
    //Test2
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0, 5000)");

    boolean status = driver.findElement(By.className("b-nav")).isDisplayed();

        if(status){
            System.out.println("Test 2 successful!");
        }
        else{
            System.out.println("Test 2 unsuccessful!");
        }
        
    //Test3
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[1]/a")).click();
    boolean navStatus = driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul")).isDisplayed();

    if(navStatus){
        System.out.println("Test 3 successful!");
    }
    else{
        System.out.println("Test 3 unsuccessful!");
    }
    //Test4
    boolean buttonClick = TestCase1.isClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[4]")));

    if(buttonClick){
        System.out.println("Test 4 successful!");
    }
    else{
        System.out.println("Test 4 unsuccessful!");
    }
    
    //Test5
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[3]/a")).click();
    boolean AItextDisplay = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).isDisplayed();

    if(AItextDisplay){
        System.out.println("Test 5 successful!");
    }
    else{
        System.out.println("Test 5 unsuccessful!");
    }
    
    //Test6
    boolean PoliciesEnabled= driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).isEnabled();

    if(PoliciesEnabled){
        System.out.println("Test 6 successful!");
    }
    else{
        System.out.println("Test 6 unsuccessful!");
    }
    
    //Test7
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a")).click();
    boolean ImpNoticeDisplay = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]")).isDisplayed();

    if(ImpNoticeDisplay){
        System.out.println("Test 7 successful!");
    }
    else{
        System.out.println("Test 7 unsuccessful!");
    }
    
    
    //Test8
    boolean Linkdlink = TestCase1.isClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/p/span/a")));

    if(Linkdlink){
        System.out.println("Test 8 successful!");
    }
    else{
        System.out.println("Test 8 unsuccessful!");
    }
    
    
    //Test9
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[4]/a")).click();
    boolean LearnMoreDisplay = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[1]/div/a")).isEnabled();

    if(LearnMoreDisplay){
        System.out.println("Test 9 successful!");
    }
    else{
        System.out.println("Test 9 unsuccessful!");
    }
    
    //Test10
    boolean LearnMoreDisplay2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[5]/div/a")).isEnabled();

    if(LearnMoreDisplay2){
        System.out.println("Test 10 successful!");
    }
    else{
        System.out.println("Test 10 unsuccessful!");
    }//-
    
	driver.close();
}
}
