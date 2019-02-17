package baskettask;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import basket.task.Basket;

public class BasketTest {
	@Test
	public void TestItemTypeA() {
		Basket basket = new Basket();
		basket.putItemsIntoBasket("A", 3);
		BigDecimal basketPrice=basket.getPriceForItemType("A");
		Assert.assertEquals(basketPrice, new BigDecimal(70));
	}

}
