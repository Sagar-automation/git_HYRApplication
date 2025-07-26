package PractsOOPs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RemoteWebDriver driver    =new	ChromeDriver();
		driver.launch();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.launch();
		
		WebDriver driver3 = new EdgeDriver();
		driver3.launch();

	}

}
