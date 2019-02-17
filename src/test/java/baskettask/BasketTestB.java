package baskettask;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import basket.task.Basket;
import basket.task.items.ItemType;

public class BasketTestB {
	
	@Test
	public void TestItemTypeBCount2() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.B, 2);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.B);
		Assert.assertEquals(basketPrice, new BigDecimal(15));
	}
	
	@Test
	public void TestItemTypeBCount1() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.B, 1);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.B);
		Assert.assertEquals(basketPrice, new BigDecimal(10));
	}


}
