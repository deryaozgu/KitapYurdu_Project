import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ProductDetailPage extends BasePage {
        By addToCartLocator= By.id("button-cart");
        public ProductDetailPage(WebDriver driver) {
            super(driver);
        }
        public void addToCard() {
            click(addToCartLocator);
        }
    }

