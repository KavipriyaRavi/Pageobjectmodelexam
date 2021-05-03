package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginapplication {
	

	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\Chromedriver.exe");
        WebDriver dd=new ChromeDriver();
        dd.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginpage rl=new RediffLoginpage(dd);
        rl.emailid().sendKeys("Hello");
        rl.password().sendKeys("123456");
        rl.submit().click();
        rl.home().click();
        
        Homepage hm=new Homepage(dd);
        hm.search().sendKeys("something");
        hm.submit().click();
        

	}
	
}
