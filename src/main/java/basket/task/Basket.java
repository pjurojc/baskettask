package basket.task;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

import basket.task.items.ItemA;
import basket.task.items.ItemFactory;
import basket.task.items.ItemType;

public class Basket {
	ConcurrentHashMap<ItemType, Long> basketContent = new ConcurrentHashMap<ItemType, Long>();

	public void putItemsIntoBasket(ItemType itemType, int itemsCount) {
		for (int i = 0; i < itemsCount; i++) {
			incrementCountOfItemTypeInBasket(itemType);
		}
	}

	private void incrementCountOfItemTypeInBasket(ItemType itemType) {
		Long basketItemtemCount = basketContent.get(itemType);
		if (basketItemtemCount == null) {
			basketItemtemCount = 0L;
		} else {
			basketItemtemCount++;
			basketContent.put(itemType, basketItemtemCount);
		}
	}

	public BigDecimal getPriceAllItems() {
		BigDecimal basketContentPrice=new BigDecimal(0);
		for (ItemType type : ItemType.values()) {
			basketContentPrice=basketContentPrice.add(ItemFactory.createItem(type).calculeteItems(basketContent.get(type)));
		}
		return basketContentPrice;
	}

	public BigDecimal getPriceForItemType(ItemType itemType) {
		// TODO Auto-generated method stub
		return null;
	}

}
