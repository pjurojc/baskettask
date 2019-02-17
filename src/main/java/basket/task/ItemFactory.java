package basket.task;

import javax.activation.UnsupportedDataTypeException;

import basket.task.items.ItemA;
import basket.task.items.ItemB;
import basket.task.items.ItemC;
import basket.task.items.ItemD;

public class ItemFactory {
	public static Item createItem(ItemType type){
		
		switch (type) {
		  case A:
			  return new ItemA();
		  	
		  case B:
			  return new ItemB();
		  	
		  case C:
			  return new ItemC();	
		  case D:
			  return new ItemD();
		  default:
			  throw new IllegalArgumentException();
		  
		}
		
	}
}
