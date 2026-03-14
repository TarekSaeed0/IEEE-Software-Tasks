/*
 * The problem with the original example, is that it violates Encapsulation. In
 * that the balance was directly accessible. which allowed for code in the main
 * function to take out of the account, more than the balance, which causes the
 * balance to go negative, which shouldn't be allowed.
 */

class BankAccount {
	private String accountHolder;
	private double balance;

	public BankAccount(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
	}

	String getAccountHolder() {
		return accountHolder;
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
}


public class Example1 {
	public static void main(String[] args) {
		BankAccount mohamed = new BankAccount("Mohamed", 1000);
		BankAccount ahmed = new BankAccount("Ahmed", 500);

		try {
			mohamed.withdraw(1500);
			ahmed.deposit(1500);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Mohamed balance: " + mohamed.getBalance());
		System.out.println("Ahmed balance: " + ahmed.getBalance());
	}
}
