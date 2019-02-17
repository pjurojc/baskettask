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
		Assert.assertEquals(new BigDecimal(15),basketPrice);
	}
	
	@Test
	public void TestItemTypeBCount1() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.B, 1);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.B);
		Assert.assertEquals( new BigDecimal(10),basketPrice);
	}
	
	@Test
	public void TestItemTypeBCount4() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.B, 4);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.B);
		Assert.assertEquals( new BigDecimal(30),basketPrice);
	}
	@Test
	public void TestItemTypeBCount5() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket(ItemType.B, 5);
		BigDecimal basketPrice=basket.getPriceForItemType(ItemType.B);
		Assert.assertEquals( new BigDecimal(40),basketPrice);
	}

}
