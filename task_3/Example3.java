/*
 * The problem with the original example, is that the main function was
 * responsible for checking if the product is in stock, and if the customer has
 * enough balance for the product, which should be the responsibility of the
 * Customer class. that all the fields of BankAccount are public as well, which
 * breaks encapsulation.
 */


class Customer {
	private int balance;
	private int itemsCount;

	Customer(int initialBalance) {
		this.balance = initialBalance;
		this.itemsCount = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void addItem(Product product) {
		if (!product.isInStock()) {
			throw new IllegalArgumentException("Product not in stock");
		}

		if (balance < product.getPrice()) {
			throw new IllegalArgumentException(
					"Not enough balance to buy the product");
		}

		balance -= product.getPrice();
		itemsCount++;
	}
}


class Product {
	private int price;
	private boolean inStock;

	Product(int price, boolean inStock) {
		this.price = price;
		this.inStock = inStock;
	}

	int getPrice() {
		return price;
	}

	boolean isInStock() {
		return inStock;
	}
}


public class Example3 {
	public static void main(String[] args) {
		Customer customer = new Customer(100);

		Product phone = new Product(150, true);

		Product book = new Product(30, false);

		customer.addItem(phone);

		customer.addItem(book);
	}
}
