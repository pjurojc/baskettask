package basket.task.items;

import java.math.BigDecimal;

import basket.task.Item;

public class ItemA implements Item{

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal(40);
	}

	@Override
	public BigDecimal getSpecialPrice() {
		return new BigDecimal(70).divide(new BigDecimal(3));
	}

	@Override
	public BigDecimal calculeteItems(Long itemsCount) {
		return getPrice().multiply(new BigDecimal(itemsCount%3L));
	}
	
}
