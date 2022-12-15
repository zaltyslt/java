package lt.techin.pvz;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class SiteTest {

	WebDriver driver;

	@BeforeAll
	static void setupClass() {
/*In this test, we invoke WebDriverManager in the setup method for all tests (@BeforeAll).
This way, the required driver (chromedriver) will be available for all the
WebDriver tests using Chrome in this class.**/
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		driver.quit();

	}

	@Test
	void test() {
		driver.get("http://selenium.dev/");

		assertTrue(driver.getTitle().contains("Selenium"));
	}

}
