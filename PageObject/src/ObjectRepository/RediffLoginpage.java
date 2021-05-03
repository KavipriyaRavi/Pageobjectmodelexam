package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginpage {

WebDriver dd;
public RediffLoginpage(WebDriver dd)
{
	this.dd=dd;
}


By username=By.xpath("//input[@id='login1']");
By Password=By.name("passwd");
By Submit=By.name("proceed");
By home=By.linkText("Home");


public WebElement emailid()
{
	return dd.findElement(username);
}
public WebElement password()
{
	return dd.findElement(Password);
}
public WebElement submit()
{
	return dd.findElement(Submit);
}
public WebElement home()
{
	return dd.findElement(home);
}
}
