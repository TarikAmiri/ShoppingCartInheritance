
public class ItemToPurchase {
   protected String name;
   protected String description;
   protected int price;
   protected int quantity;
   
   		
		   // Default constructor
		   public ItemToPurchase() {
		      name = "none";
		      description = "none";
		      price = 0;
		      quantity = 0;
		   }
		   
		   public ItemToPurchase(String name, String description, int price, int quantity) {
			   this.name = name;
			   this.description = description;
			   this.price = price;
			   this.quantity = quantity;	  
		   }
		   
		   // Name setter
		   public void setName(String name) {
			   this.name = name;
		   }
		   
		   // Description setter
		   public void setDescription(String description) {
			   this.description = description;
		   }
		   
		   // Price setter
		   public void setPrice(int price) {
			   this.price = price;
		   }
		   
		   // Quantity setter
		   public void setQuantity(int quantity) {
			   this.quantity = quantity;
	       }
		   		   
		   // Name getter
		   public String getName() {
			   return name;
		   }
		   
		   // Description getter
		   public String getDescription() {
			   return description;
		   }
		   
		   // Price getter
		   public int getPrice() {
			   return price;
		   }
		   
		   // Quantity getter
		   public int getQuantity() {
			   return quantity;
		   }
		
		   // Print Item Cost
		   public void printItemCost() {
			   System.out.println( name + " " + quantity + " @ $" + price + " = $" + (quantity * price) );
		   }
		   
		   // Print Item Description
		   public void printItemDescription() {
			   System.out.println(name + ": " + description);
		   }
		   
}
