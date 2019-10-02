import java.util.ArrayList;

public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
	
	// Default Shopping Cart
	public ShoppingCart() {
		customerName = "none";
		currentDate = "January 1, 2016";
	}
	
	// Overloaded shopping cart
	public ShoppingCart(String customerName, String currentDate) {
		this.customerName = customerName;
		this.currentDate = currentDate;
	}
	
	// Get name
	public String getCustomerName() {
		return customerName;
	}
	
	// Get Date
	public String getDate() {
		return currentDate;
	}
	
	// Get number of items in cart
	public int getNumItemsInCart() {
		return cartItems.size();
	}
	
	// Get cost of cart
	public int getCostOfCart() {
		int i = 0;
		int total = 0;
		while ( i < cartItems.size() ) {
			total += cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
		++i;
		}
				return total;
	}
	
	// Add item
	public void addItem(ItemToPurchase newItem) {
		cartItems.add(newItem);
	}
	
	// Remove item
	public void removeItem(String name) {
	      int i;
	      boolean found;

	      found = false;
	      i = 0;

	      while ( (!found) && (i < cartItems.size()) ) {
	         if (cartItems.get(i).getName().equals(name)) {
	            cartItems.remove(i); 
	            found = true; 
	         }

	         ++i;	       
	         }
	     if (found != true) {
	    	 System.out.println("Item not found in cart. Nothing removed.");
	     }
	}
	
	// Modify item
	public  void modifyItem(ItemToPurchase changeItem) {

		  int i = 0;
	      boolean found = false;

	      // new fields
	      while ( (!found) && (i < cartItems.size()) ) {
	         if (cartItems.get(i).getName().equals(changeItem.getName())) {
	            found = true;
	    		 cartItems.get(i).setQuantity(changeItem.getQuantity());
	         }
	         ++i;
	      }
	     
	     if (!found) {
	    	 System.out.println("Item not found in cart. Nothing modified.");	
	    	 }
	      }
	
	// Print Inherited Item
    public void printInheritedItem(String name) {
		  int i;
	      boolean found;

	      found = false;
	      i = 0;

	      while ( (!found) && (i < cartItems.size()) ) {
	         if (cartItems.get(i).getName().equals(name)) {
	        	 System.out.println(cartItems.get(i).toString());
	            found = true; 
	         }

	         ++i;	       
	         }
	     if (found != true) {
	    	 System.out.println("Item not found in cart.");
	     }
	}
	
	// PrintTotal
	public void printTotal() {
		int i = 0;
		int total = 0;
		int totalItems = 0;
		
		//get number of items
		while (i < cartItems.size()) {
			totalItems += cartItems.get(i).getQuantity();
		++i;
		}
		i = 0;
		
		//print out cart
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items: " + totalItems);
		System.out.println();
		if (cartItems.size() == 0) {
			System.out.println("SHOPPING CART IS EMPTY");
			System.out.println();
		}
		
		// get total and print cost
		while (i < cartItems.size()) {
			cartItems.get(i).printItemCost();
			total += cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
		++i;
		}
		System.out.println();
		System.out.println("Total : $" + total);
		System.out.println();
	}	
	
	// Print description
	public void printDescriptions() {
		int i = 0;
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println();
		System.out.println("Item Descriptions");
		while (i < cartItems.size()) {
			cartItems.get(i).printItemDescription();
			++i;
		}
	
	}

}
