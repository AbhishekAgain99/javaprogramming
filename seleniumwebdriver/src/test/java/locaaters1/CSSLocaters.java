package locaaters1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocaters {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id  -->tag#id
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
		
		//tag class tag.classname
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		//tag attribute--.tag[attributes="value"]
	//	driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-shirt");

		//tag class attributes-->tag.classname[attributes='value']
	//	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirt");

	}

}
