package basket.task.items;

import javax.activation.UnsupportedDataTypeException;

import basket.task.Item;

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
