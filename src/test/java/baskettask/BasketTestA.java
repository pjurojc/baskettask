package baskettask;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import basket.task.Basket;

public class BasketTestA {
	@Test
	public void TestItemTypeACount3() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket("A", 3);
		BigDecimal basketPrice=basket.getPriceForItemType("A");
		Assert.assertEquals(basketPrice, new BigDecimal(70));
	}
	@Test
	public void TestItemTypeACount1() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket("A", 1);
		BigDecimal basketPrice=basket.getPriceForItemType("A");
		Assert.assertEquals(basketPrice, new BigDecimal(40));
	}
	
	


}
