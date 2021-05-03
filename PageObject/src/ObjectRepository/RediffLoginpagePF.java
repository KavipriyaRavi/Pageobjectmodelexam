package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	WebDriver dd;
	public RediffLoginpagePF()
	{
		// TODO Auto-generated constructor stub
		
		this.dd=dd;
		PageFactory.initElements(dd, this);
		}


		
	
	   @FindBy(xpath="//input[@id='login1']")
	   WebElement username;
	   @FindBy(name="passwd")
	   WebElement Password;
	   @FindBy(name="proceed")
	   WebElement Submit;
	   @FindBy(linkText="Home")
	   WebElement Home;


		public WebElement emailid()
		{
		   
			return username;
		}
		public WebElement password()
		{
			return Password;
		}
		public WebElement submit()
		{
			return Submit;
		}
		public WebElement home()
		{
			return Home;
		}
		

	

}
