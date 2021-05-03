package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

 WebDriver dd;

	public Homepage(WebDriver dd) {
		// TODO Auto-generated constructor stub
		this.dd=dd;
	}
	By search=By.id("srchword");
	By submit=By.xpath("//input[@type='submit']");
	public WebElement search()
	{
		return dd.findElement(search);
	}
	public WebElement submit()
	{
		return dd.findElement(submit);
	}

}
