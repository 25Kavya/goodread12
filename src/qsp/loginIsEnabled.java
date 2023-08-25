package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginIsEnabled{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.goodreads.com/");
			//login
			WebElement login=driver.findElement(By.linkText("Sign In"));
			login.click();
			WebElement signin=driver.findElement(By.linkText("Sign in with email"));
			signin.click();
			WebElement emailField = driver.findElement(By.linkText("a-input-text a-span12 auth-autofocus auth-required-field"));
	        emailField.sendKeys("kavyabande@gmail.com");

	        WebElement passwordField = driver.findElement(By.linkText("a-input-text a-span12 auth-required-field"));
	        passwordField.sendKeys("Kavya@321");

	        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
	        signInButton.click();

	        // Search for a specific book
	        WebElement searchBox = driver.findElement(By.linkText("searchBox__input searchBox__input--currentlyReading"));
	        searchBox.sendKeys("never lie");
	        searchBox.submit();

	        // Click on the book title from the search results
	        WebElement bookLink = driver.findElement(By.linkText("Book Title"));
	        bookLink.click();
	        
	     // Mark the book as 'want to read'
	        WebElement wantToReadButton = driver.findElement(By.xpath("//button[contains(text(), 'Want to Read')]"));
	        wantToReadButton.click();

	        // Go to 'My Books'
	        WebElement myBooksLink = driver.findElement(By.xpath("//a[contains(@href, '/review/list')]"));
	        myBooksLink.click();

	        // Remove the book from 'My Books'
	        WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(), 'Remove from My Books')]"));
	        removeButton.click();

	        // Confirm removal
	        WebElement confirmRemoveButton = driver.findElement(By.xpath("//button[contains(text(), 'Yes')]"));
	        confirmRemoveButton.click();

	        // Logout
	        WebElement userMenu = driver.findElement(By.xpath("//span[@class='gr-menuTriggerText']"));
	        userMenu.click();

	        WebElement logoutLink = driver.findElement(By.linkText("Sign out"));
	        logoutLink.click();

	        // Close the browser
	        driver.quit();
	    }
		}
			
	