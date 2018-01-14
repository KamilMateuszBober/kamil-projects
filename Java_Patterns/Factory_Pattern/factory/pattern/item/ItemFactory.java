package factory.pattern.item;

public class ItemFactory {
	
	public static Item createItem(String s) {
		
		if(s.equalsIgnoreCase(Item.PAINT)) {
			return new Paint();
					
		}else
		if(s.equalsIgnoreCase(Item.NAILS)) {
			return new Nails();
		}else
		if(s.equalsIgnoreCase(Item.HAMMER)) {
			return new Hammer();
		}else
		if(s.equalsIgnoreCase(Item.FORBYTWO)) {
			return new ForByTwo();
		}
		return null;
		
		
		
	}
}
