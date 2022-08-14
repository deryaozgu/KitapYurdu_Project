import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends BasePage {
    HomePage homePage;
    By text_area= By.name("quantity");
    By refreshLocator=By.className("green-icon");
    //By basket_update=By.linkText("Sepetinizden güncelleniyor!");
    By exitt_button=By.className("red-icon");
    //By basket_null=By.linkText("Sepetinizden çıkarılıyor!");
    By cartCount= By.xpath("//span[@id='cart-items']");
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void increase_product() {
        clear(text_area);
        String count=find(cartCount).getText();
        System.out.printf(count);
        int new_number=Integer.parseInt(count);
        new_number=new_number+1;
        count=String.valueOf(new_number);
        type(text_area,count);
    }
    public void update_button() {
        click(refreshLocator);

    }
    /*   public boolean Basket_Update() {
        return isDisplayed(basket_update);
    }*/
    //Anlık güncelleniyor bilgisi verip sayfadan kaybolduğu için hata aldım o sebeple devamı
    //çalışsın diye yorum satırına aldım.
    public void exit_button() {
        click(exitt_button);
    }

    /*public boolean Basket_Null() {
        return isDisplayed(basket_null);
    }*/
}
