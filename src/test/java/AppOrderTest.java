import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class AppOrderTest {
    private WebDriver driver;

  @BeforeAll
  public static void setupAll() {
      WebDriverManager.chromedriver().setup();
  }
}
