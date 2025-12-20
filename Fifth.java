package Assignment1;

public class Fifth {
	public static void main(String[] args) {
		Bank b = new Bank("Prachi Baraskar",2465,16000000,8009);
		b.accountDetailsDisplay(2465,8009 );
		System.out.println();
		b.balanceEnquiry(2465,8009);
		System.out.println();
		b.deposit(250000);
		System.out.println();
		b.withdrawl(100000);
	}
}

//Design a console-based Bank Management Program in Java that allows a user to create a 
//bank account and perform basic banking operations such as , , , and account details display. The program should handle exceptions as required. 

class Bank{
	String name;
	private int acc;
	private int amount;
	private int pin;
	Bank(String name,int acc,int amount,int pin){
		this.name = name;
		this.acc = acc;
		this.amount = amount;
		this.pin = pin;
	}
	//deposit
	void deposit(int money) {
		this.amount += Math.abs(money);
		System.out.println("Deposited "+money );
		System.out.println("Total Amount : "+amount);
	}
	//withdrawal
	void withdrawl(int money) {
		this.amount -= Math.abs(money);
		System.out.println("Amount deducted : "+money );
		System.out.println("Total Amount : "+amount);
	}
	//balance enquiry
	void balanceEnquiry(int acc,int pin) {
		if(pin==this.pin) {
			System.out.println("Total Amount : "+amount);
		} else {
			System.out.println("you have entered wrong pin");
		}
	}
	//account details display
	void accountDetailsDisplay(int acc,int pin) {
		if(pin==this.pin) {
			System.out.println("Account Holder Name: "+name);
			System.out.println("Account number : "+acc);
			System.out.println("Total Amount : "+amount);
		} else {
			System.out.println("you have entered wrong pin");
		}
	}
	
}
