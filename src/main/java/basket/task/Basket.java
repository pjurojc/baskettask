package basket.task;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class Basket {
    ConcurrentHashMap<String, Long> basketContent=new ConcurrentHashMap<>();
	public void putItemsIntoBasket(String itemType, int itemsCount) {
		for (int i=0;i<itemsCount;i++) {
			
		}
	}

	public BigDecimal getPriceAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getPriceForItemType(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
