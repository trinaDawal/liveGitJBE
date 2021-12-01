package guide.core;

public class InterfaceEx {
	public static void main(String[] args) {
		System.out.println("BANKACCOUNT CLASS");
		BankAccount bankAccount = new BankAccount();
		bankAccount.transferFunds();
		bankAccount.withdrawCash();
//		BankAccount.password;
		System.out.println("DEBITCARD INTERFACE");
//	Reference can be created
		DebitCard debitCard = null;
// No instance can be created
// debitCard = new DebitCard();
		debitCard = new BankAccount();
		debitCard.withdrawCash();
//		debitCard.password;
//debitCard.transferFunds();
		System.out.println("NETBANKING INTERFACE");
		NetBanking netBanking = new BankAccount();
		netBanking.transferFunds();
//netBanking.withdraw();
	}
}

interface DebitCard {
	public abstract void withdrawCash();
}

interface NetBanking {
	public abstract void login();
	public abstract void transferFunds();
}

class BankAccount implements NetBanking, DebitCard {
	private String password;
	public void login() {
		//accept password from user
		password = "password typed by user";
	}
	public void transferFunds() {
		System.out.println("Transfer funds in BDO Bank");
	}

	public void withdrawCash() {
		System.out.println("Withdraw Cash");
	}
}