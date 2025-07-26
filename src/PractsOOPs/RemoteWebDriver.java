package PractsOOPs;

public class RemoteWebDriver implements WebDriver {
	
	


	@Override
	public void launch() {
		System.out.println("driver initiation");
		
	}

	@Override
	public void geturl() {
		System.out.println("fetching the url information");
		
	}

	@Override
	public void get() {
		System.out.println("load url");
		
	}

}
