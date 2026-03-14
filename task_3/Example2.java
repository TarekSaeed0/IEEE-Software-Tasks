/*
 * The problem with the original example, is that the main function was
 * responsible for validating the transcation and performing it, which should be
 * the responsiblity of the BackAccount class. And that caused code repeat.
 * another problem is that all the fields of BankAccount are public as well,
 * which breaks encapsulation.
 */

class BankAccount {
	private String owner;
	private double balance;

	public BankAccount(String owner, double initialBalance) {
		this.owner = owner;
		this.balance = initialBalance;
	}

	String getOwner() {
		return owner;
	}

	double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}

		balance -= amount;
	}

	void transfer(BankAccount recipient, double amount) {
		this.withdraw(amount);
		recipient.deposit(amount);
	}
}


public class Example2 {
	public static void main(String[] args) {
		BankAccount mohamed = new BankAccount("Mohamed", 1000);
		BankAccount ahmed = new BankAccount("Ahmed", 500);

		double amount1 = 1500;
		try {
			mohamed.transfer(ahmed, amount1);
			System.out.println("Transaction 1 completed");
		} catch (IllegalArgumentException e) {
			System.out.println("Transaction 1 failed");
		}

		double amount2 = 1500;
		try {
			mohamed.transfer(ahmed, amount2);
			System.out.println("Transaction 2 completed");
		} catch (IllegalArgumentException e) {
			System.out.println("Transaction 2 failed");
		}

		System.out.println("Mohamed balance: " + mohamed.getBalance());
		System.out.println("Ahmed balance: " + ahmed.getBalance());
	}
}
