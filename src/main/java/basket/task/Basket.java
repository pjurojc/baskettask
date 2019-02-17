package basket.task;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

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
			basketItemtemCount = new Long(0);
		} 
		basketItemtemCount++;
		basketContent.put(itemType, basketItemtemCount);
		
	}

	public BigDecimal getPriceAllItems() {
		BigDecimal basketContentPrice=new BigDecimal(0);
		for (ItemType type : ItemType.values()) {
			basketContentPrice=basketContentPrice.add(getPriceForItemType(type));
		}
		return basketContentPrice;
	}

	public BigDecimal getPriceForItemType(ItemType itemType) {
		return ItemFactory.createItem(itemType).calculeteItems(basketContent.get(itemType));
	}

}
