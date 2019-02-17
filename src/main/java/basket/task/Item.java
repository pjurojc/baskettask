package basket.task;

import java.math.BigDecimal;

public interface Item {
	BigDecimal getPrice();
	BigDecimal getSpecialPrice();
	BigDecimal calculeteItems(Long itemsCount);
}
