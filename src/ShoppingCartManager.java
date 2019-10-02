import java.util.Scanner;

public class ShoppingCartManager {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void printMenu() {

		System.out.println();
		System.out.println("Menu");
		System.out.println("a - Add item to cart");
		System.out.println("m - Add inherited item");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("s - Output inherited item");
		System.out.println("q - Quit");
		System.out.println();
		
	    }
	
   public static void main(String[] args) {
	  char command = 'z';
	  String date; 
	  String name;
	  String tempName;
	  String tempDescription;
	  String tempUnionMade;
	  int tempPrice;
	  int tempQuantity;
	  int tempProfitPerItem;
	  
	  // Get name, date and call overloaded constructor
	  System.out.println("Enter Customer's Name:");
	  name = scnr.nextLine();
	  System.out.println("Enter Today's Date:");
	  date = scnr.nextLine();
	  ShoppingCart theCart = new ShoppingCart(name, date);
	  System.out.println();
	  System.out.println("Customer Name: " + name);
	  System.out.println("Today's Date: " + date);
	  
	  //Call menu for a command
	  printMenu();
	  System.out.println("Choose an option:");
		

	  command = scnr.next().charAt(0);
	    
	  
	  while (command != 'q') {

	  switch (command) {
	  
	  case 'a':
		  System.out.println("ADD ITEM TO CART");
		  System.out.println("Enter the item name:");
		  tempName = scnr.nextLine();
		  tempName = scnr.nextLine();
		  System.out.println("Enter the item description:");
		  tempDescription = scnr.nextLine();
		  System.out.println("Enter the item price:");
		  tempPrice = scnr.nextInt();
		  System.out.println("Enter the item quantity:");
		  tempQuantity = scnr.nextInt();
		  ItemToPurchase newItem = new ItemToPurchase(tempName, tempDescription, tempPrice, tempQuantity);
		  theCart.addItem(newItem);
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
		
	  // remove item	  
	  case 'd':
		  System.out.println("REMOVE ITEM FROM CART");
		  System.out.println("Enter name of item to remove:");
		  tempName = scnr.nextLine();
		  tempName = scnr.nextLine();
		  theCart.removeItem(tempName);
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
	
	  // change item
	  case 'c':
		  ItemToPurchase tempItem = new ItemToPurchase();
		  System.out.println("CHANGE ITEM QUANTITY");
		  System.out.println("Enter the item name:");
		  tempName = scnr.nextLine();
		  tempName = scnr.nextLine();
		  System.out.println("Enter the new quantity:");
		  tempQuantity = scnr.nextInt();
		  tempItem.setName(tempName);
		  tempItem.setQuantity(tempQuantity);
		  theCart.modifyItem(tempItem);
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
		
      // print descriptions		  
	  case 'i':	  
		  System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
		  theCart.printDescriptions();
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
		
	  // print costs  
	  case 'o':
		  System.out.println("OUTPUT SHOPPING CART");
		  theCart.printTotal();
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
	  case 'm':
		  System.out.println("ADD INHERITED ITEM TO CART");
		  System.out.println("Enter the item name:");
		  tempName = scnr.nextLine();
		  tempName = scnr.nextLine();
		  System.out.println("Enter the item description:");
		  tempDescription = scnr.nextLine();
		  System.out.println("Enter the item price:");
		  tempPrice = scnr.nextInt();
		  System.out.println("Enter the item quantity:");
		  tempQuantity = scnr.nextInt();
		  System.out.println("Enter the item's Union Made status:");
		  tempUnionMade = scnr.nextLine();
		  tempUnionMade = scnr.nextLine();
		  System.out.println("Enter the profit per item:");
		  tempProfitPerItem = scnr.nextInt();
		  
		  MyInheritedItem newInheritedItem = new MyInheritedItem(tempName, tempDescription, tempPrice, tempQuantity, tempUnionMade, tempProfitPerItem);
		  theCart.addItem(newInheritedItem);
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
	  case 's':
		  System.out.println("PRINT INHERITED ITEM");
		  System.out.println("Enter the item name:");
		  tempName = scnr.nextLine();
		  tempName = scnr.nextLine();
		  theCart.printInheritedItem(tempName);
		  
		  printMenu();
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
		  
      // quit
	  case 'q':
		  break;
		  
	  default: 
		  System.out.println("Choose an option:");
		  command = scnr.next().charAt(0);
		  break;
	  }

   }
}
	

}
