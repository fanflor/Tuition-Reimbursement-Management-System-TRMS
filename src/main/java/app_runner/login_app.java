package app_runner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class login_app {
    public static void main(String[] args) {

        String driverPath="/Users/searto/Desktop/work/revature/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        String url="file:///Users/searto/Desktop/work/revature/Frontend%20stuff/LogIN.html";
        driver.get(url);
        try {

            WebElement userN= driver.findElement(By.id("Username"));
            WebElement password= driver.findElement(By.id("password"));
            WebElement clier= driver.findElement(By.id("selTest"));
            userN.sendKeys("theo");
            password.sendKeys("theo");
            clier.click();
            clier.click();
            System.out.println("Done");
            Thread.sleep(200000);

        }catch(Exception e){

            e.printStackTrace();

        }finally {
            driver.close();
        }
    }
}
