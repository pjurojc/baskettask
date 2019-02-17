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
		return new BigDecimal(70);
	}

	@Override
	public BigDecimal calculeteItems(Long itemsCount) {
		long secialPriceCount = itemsCount/3;
		long secialPriceItems = secialPriceCount*3;
		long otherItems=itemsCount-secialPriceItems;
		return   getSpecialPrice().multiply(new BigDecimal(secialPriceCount))
				.add(
						getPrice().multiply(new BigDecimal(otherItems))
				);
	}
	
}
