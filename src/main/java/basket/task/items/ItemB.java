package basket.task.items;

import java.math.BigDecimal;
import java.util.List;

import basket.task.Item;

public class ItemB implements Item {

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal(10);
	}

	@Override
	public BigDecimal getSpecialPrice() {
		return new BigDecimal(15);
	}

	@Override
	public BigDecimal calculeteItems(Long itemsCount) {
		long secialPriceCount = itemsCount/2;
		long secialPriceItems = secialPriceCount*2;
		long otherItems=itemsCount-secialPriceItems;
		return   getSpecialPrice().multiply(new BigDecimal(secialPriceCount))
				.add(
						getPrice().multiply(new BigDecimal(otherItems))
				);
	}

}
