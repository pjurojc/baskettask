package basket.task;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

import basket.task.items.ItemType;

public class Basket {
    ConcurrentHashMap<String, Long> basketContent=new ConcurrentHashMap<>();
	public void putItemsIntoBasket(ItemType itemType, int itemsCount) {
		for (int i=0;i<itemsCount;i++) {
			
		}
	}

	public BigDecimal getPriceAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getPriceForItemType(ItemType itemType) {
		// TODO Auto-generated method stub
		return null;
	}

}
