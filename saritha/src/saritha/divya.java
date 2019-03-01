package saritha;
public class divya {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findelement(By.xpath("//input[@type='google']"));
		driver.close();
	}

}