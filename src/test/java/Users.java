import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Users {

    public static WebDriver driver;
    private long expected;

    @Test


    public void Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Driver Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html");


        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("demid1305@gmail.com");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("123456");
        driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click();
        Thread.sleep(3000);
        WebElement AddUser = driver.findElement(By.xpath("//*[contains(text(), 'Добавить пользователя')]"));
        Assert.assertEquals(true, AddUser.isDisplayed());

        driver.findElement(By.xpath("//input[@placeholder='Введите email или имя']")).sendKeys("demid1305@gmail.com");
        driver.findElement(By.xpath("//button[@class='btn btn-submit']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();

        driver.findElement(By.xpath("//input[@name='noibiz_name']")).sendKeys("sasha");
        driver.findElement(By.xpath("//input[@name='noibiz_email']")).sendKeys("sasha1305@gmail.com");

        driver.findElement(By.xpath("//input[@name='noibiz_password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='act_create']")).click();

        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.xpath("//li[@id='fat-menu']//li[1]//a[1]")).click();


        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sasha");
        driver.findElement(By.xpath("//select[@name='gender']")).click();
        driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Мужской");
        driver.findElement(By.xpath("//select[@name='gender']")).click();


        driver.findElement(By.xpath("//input[@name='birthday']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("12091989");


        driver.findElement(By.xpath("//input[@name='date_start']")).click();
        driver.findElement(By.xpath("//input[@name='date_start']")).sendKeys("12062020");


        driver.findElement(By.xpath("//textarea[@name='hobby']")).click();
        driver.findElement(By.xpath("//textarea[@name='hobby']")).sendKeys("Футбол");


        driver.findElement(By.xpath("//input[@name='inn']")).click();
        driver.findElement(By.xpath("//input[@name='inn']")).sendKeys("597435991753");

        driver.findElement(By.xpath("//input[@name='act_profile_now']")).click();


    }
    

}
