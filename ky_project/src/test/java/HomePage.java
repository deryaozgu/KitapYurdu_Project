import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    By searchButtonLocator= By.id("search-input");
    By cartCount= By.xpath("//span[@id='cart-items']");
    By button=By.id("sprite-cart-icon");
  //  By go_to_basket=By.xpath("//a[@href='href=\"https://www.kitapyurdu.com/index.php?route=checkout/cart\"']");

    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchBox()
    {
        return this.searchBox;
    }

    public boolean IsOnHome_Page()
    {
     return isDisplayed(searchButtonLocator);
    }

    public boolean Product_Count_Control() {
        return getCartCount()>0;
    }
    public void goToCard() {
        click(button);
        driver.get("https://www.kitapyurdu.com/index.php?route=checkout/cart");
    }
    private int getCartCount()
    {
       String count=find(cartCount).getText();
        System.out.printf(count);
        return Integer.parseInt(count);
    }


}
