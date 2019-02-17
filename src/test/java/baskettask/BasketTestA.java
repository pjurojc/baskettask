package baskettask;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import basket.task.Basket;
import basket.task.items.ItemType;

public class BasketTestA {
	@Test
	public void TestItemTypeACount3() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.A, 3);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.A);
		Assert.assertEquals(basketPrice, new BigDecimal(70));
	}
	@Test
	public void TestItemTypeACount1() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.A, 1);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.A);
		Assert.assertEquals(basketPrice, new BigDecimal(40));
	}

}
