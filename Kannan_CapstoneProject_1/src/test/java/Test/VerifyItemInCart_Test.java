package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Base_Test;
import pages.Cart;
import pages.ClickOnADDCart;
import pages.SearchPage;
import pages.SelectFirstItem;

public class VerifyItemInCart_Test extends Base_Test {
  @Test(priority=3)
  public void verifyItem() throws InterruptedException  {
	  SearchPage sp=new SearchPage(driver);
//	  sp.clickOnCancelButton();
	  sp.searchQuery("Macbook air m2");
	  
	  SelectFirstItem selectItem=new SelectFirstItem(driver);
	  selectItem.selectFirstItem();
	  
	  ClickOnADDCart addt=new ClickOnADDCart(driver);
	  addt.clickOnAddCarts();
	  Thread.sleep(1000);	  
	  Cart c=new Cart(driver);
	  c.clickOnCart();
	  c.verifyItemAdded();

  }
}
