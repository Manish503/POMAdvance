package sample.Data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver driver;
@Test
public void dat1()
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver.get("https://www.mketrade.com.sg/");
	driver.manage().window().maximize();
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Career {
       String[] name() default "Canberk";
       int age() default 33;
       String[] workedCompanies() default "none";
}

}
