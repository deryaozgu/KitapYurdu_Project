import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class Test_Add_Product_To_Card extends BaseTest{
    HomePage homepage;
    ProductsPage productspage;
    ProductDetailPage productDetailPage;
    CardPage cardpage;
    @Test
    @Order(1)
    public void search_product()
    {
        homepage = new HomePage(driver);
        productspage =new ProductsPage(driver);
        Assertions.assertTrue(homepage.IsOnHome_Page(),"Ana sayfasa değilsiniz.");
        homepage.searchBox().search("Roman");
    }
    @Test
    @Order(2)
    public void select_product()
    {
        productspage.selectProduct(1);
    }
    @Test
    @Order(3)
    public void addProductToCard()
    {
        productDetailPage=new ProductDetailPage(driver);
        productDetailPage.addToCard();
        driver.get("https://www.kitapyurdu.com/");
       Assertions.assertTrue(homepage.Product_Count_Control(),"ürün eklenmemis");
    }
    @Test
    @Order(4)
    public void goToCard()
    {
        cardpage=new CardPage(driver);
        homepage.goToCard();
        //ürün arttır
        cardpage.increase_product();
        cardpage.update_button();
       // Assertions.assertTrue(cardpage.Basket_Update(),"Sepetiniz Güncel Değil");
        cardpage.exit_button();
        //Assertions.assertTrue(cardpage.Basket_Null(),"Sepetiniz Boş Değil");
    }

}
