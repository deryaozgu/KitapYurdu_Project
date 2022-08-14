import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage {
    By allproductslocator=By.className("product-cr");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(int i) {
        List<WebElement> elements= getAllProductNames();
        int allproduct_count=elements.size();
        //System.out.println(allproduct_count+"dsyiiiii");
        //int random_count=(int)(Math.random()*allproduct_count);
        elements.get(i).click();
    }

    private List<WebElement> getAllProductNames()
    {
         return findAll(allproductslocator);
    }
}
