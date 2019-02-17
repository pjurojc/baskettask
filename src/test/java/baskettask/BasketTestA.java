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
		Assert.assertEquals(new BigDecimal(70),basketPrice);
	}
	@Test
	public void TestItemTypeACount1() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.A, 1);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.A);
		Assert.assertEquals(new BigDecimal(40),basketPrice);
	}
	@Test
	public void TestItemTypeACount2() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.A, 2);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.A);
		Assert.assertEquals(new BigDecimal(80),basketPrice);
	}
	@Test
	public void TestItemTypeACount6() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.A, 6);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.A);
		Assert.assertEquals(new BigDecimal(140),basketPrice);
	}
}
