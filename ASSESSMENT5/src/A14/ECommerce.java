package A14;

public class ECommerce 
{

}

class ProductNotFoundException extends Exception
{
	String message;
	ProductNotFoundException()
	{
		this.message = message;
	}
}

class OrderFailedException extends Exception
{
	String message;
	OrderFailedException()
	{
		this.message = message;
	}
}


interface Product 
{
	

	String getProductDetails(String name, Double price, String description);
}

class  ConcreteProduct implements  Product
{
	String name; 
	Double price; 
	String description;
	ConcreteProduct(String name, Double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String getProductDetails(String name, Double price, String description)
	{
		return  "Product Name"+name+"Product price"+price+"Product description"+description;
	}	 
}

class  ProductCatalog
{
	 void addProduct(Product product)
	 {
		 
	 }
	 
	// Product findProduct(String productName) throws ProductNotFoundException
	 {
		// if(this.name.equals(productName))
			 
	 }
}








































































//
//You are required to create two custom exceptions: ProductNotFoundException and 
//OrderFailedException. These exceptions should be used to handle specific error conditions 
//in a simulated e-commerce application that deals with product searches and order processing.
//Steps to Follow:
//1. Define the Custom Exceptions:
//o ProductNotFoundException: Create a new class named 
//ProductNotFoundException that extends the Exception class.
//▪ Implement a constructor that accepts a string message and passes it to 
//the superclass constructor.
//o OrderFailedException: Create another class named OrderFailedException
//that extends the Exception class.
//▪ Implement a constructor that accepts a string message and passes it to 
//the superclass constructor.
//2. Create the E-Commerce Application:
//o Product Interface:
//▪ Define an interface named Product with the following method:
//▪ String getProductDetails(): Returns the details of the 
//product.
//o Concrete Product Class:
//▪ Create a class named ConcreteProduct that implements the Product
//interface.
//▪ Implement the getProductDetails method to return product details 
//(e.g., name, price, and description).
//o ProductCatalog Class:
//▪ Create a class named ProductCatalog with the following methods:
//▪ addProduct(Product product): Adds a product to the 
//catalog.
//▪ Product findProduct(String productName) throws 
//ProductNotFoundException: Searches for a product by name. 
//If the product is not found, throws 
//ProductNotFoundException.
//o OrderProcessor Interface:
//▪ Define an interface named OrderProcessor with the following 
//method:
//▪ void processOrder(Product product) throws 
//OrderFailedException: Processes an order for the given 
//product. Throws OrderFailedException if the order cannot 
//be processed.
//o ConcreteOrderProcessor Class:
//▪ Create a class named ConcreteOrderProcessor that implements the 
//OrderProcessor interface.
//▪ Implement the processOrder method to simulate order processing. If 
//the order fails (e.g., due to inventory issues), throw an 
//OrderFailedException.
//3. Handle the Exceptions in the Main Program:
//o ECommerceApplication Class:
//▪ Create a main method that simulates user interactions with the ecommerce application.
//▪ Create and populate a ProductCatalog with several products.
//▪ Prompt the user to enter a product name to search for and an order 
//quantity.
//▪ Use the ProductCatalog to find the product. If the product is not 
//found, handle the ProductNotFoundException.
//▪ If the product is found, use the OrderProcessor to process the order. 
//Handle the OrderFailedException if the order cannot be processed.
//▪ Use try-catch blocks to handle ProductNotFoundException and 
//OrderFailedException.
//▪ Display appropriate error messages in the catch blocks to inform the 
//user of invalid operations.
//▪ Ensure the program continues running after handling exceptions.
//4. Program Requirements:
//o Custom Exception Classes: Must define ProductNotFoundException and 
//OrderFailedException with constructors that accept messages.
//o Product Interface and Implementation: Must define a Product interface 
//and a concrete class implementing this interface.
//o ProductCatalog Class: Must implement methods to add and find products, 
//throwing exceptions for invalid searches.
//o OrderProcessor Interface and Implementation: Must define an 
//OrderProcessor interface and a concrete class implementing this interface, 
//throwing exceptions for order failures.
//o Main Method: Must handle user input, interact with the product catalog and 
//order processor, and properly handle exceptions to guide the user towards 
//valid operations.
//Example Output:
//Product Catalog:
//1. Laptop - $999.99
//2. Smartphone - $499.99
//3. Headphones - $199.99
//Enter product name to search: Tablet
//ProductNotFoundException: Product 'Tablet' not found.
//Enter product name to search: Laptop
//Enter order quantity: 2
//Order processed successfully for 2 units of Laptop.
//Enter product name to search: Smartphone
//Enter order quantity: 5
//OrderFailedException: Order failed for product 'Smartphone' due to 
//insufficient inventory.
//Additional Notes:
//• Ensure that the program handles invalid input types gracefully by wrapping input 
//parsing in a try-catch block for NumberFormatException.
//• Provide clear and user-friendly error messages to guide the user towards valid 
//operations and inputs.
//• Make sure the program allows multiple operations without exiting after a single 
//transaction.
//By following these steps, you will gain practical experience in creating custom exceptions, 
//simulating e-commerce operations, validating input, and handling exceptions in Java using 
//classes and interfaces