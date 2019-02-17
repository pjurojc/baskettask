package basket.task;

import java.math.BigDecimal;
import java.util.List;

public interface Item {
	BigDecimal getPrice();
	BigDecimal getSpecialPrice();
	BigDecimal calculeteItems(List<Item> items);
}
