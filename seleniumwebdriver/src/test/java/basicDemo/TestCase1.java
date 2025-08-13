package basicDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

//Lunch ChromeBrowser(chrome)
//open URL https://demo.opencart.com/
//validate title should be "Your Store"
//close browser

public class TestCase1 {

	public static void main(String[] args) {
		//Lunch ChromeBrowser(chrome)
	//	ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(); //Typecasting-Upcasting
		
		//open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		
		
		//validate title should be "Your Store"
	
		String act_titile = driver.getTitle();
		if(act_titile.equals("Your Store"))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		//close browser
		//driver.close();
	}

}
