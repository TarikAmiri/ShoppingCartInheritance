
public class MyInheritedItem extends ItemToPurchase {
	
	private String unionMade;
	private int profitPerItem;
	
	
	public MyInheritedItem() {
	super();
	}
	
	public MyInheritedItem(String name, String description, int price, int quantity, String unionMade, int profitPerItem) {
		   this.name = name;
		   this.description = description;
		   this.price = price;
		   this.quantity = quantity;	  
		   this.unionMade = unionMade;
		   this.profitPerItem = profitPerItem;
	}
	
	@Override
	public String toString() {
		String myString;
		
		myString = "Name and description: " + name + " " + description + ". Price, quantity and profit per item: " + price + " " + quantity + " " + profitPerItem + ". Union made status: " + unionMade + ".";
				return myString;
	}
	}

