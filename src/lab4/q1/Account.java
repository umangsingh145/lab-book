package lab4.q1;

class Account {
	long accNum;
	Double balance;
	String accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

}

class Person extends Account {

	String name;
	float age;

	public Person(String name, float age) {

		this.name = name;
		this.age = age;
	}

	public Person(long accNum, double balance, String accHolder) {

		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	final float minBal = 1000;
	boolean oLimit;

	void withdraw(double minBal) {
		System.out.println("Availabe Balance : " + balance);
		minBal -= balance;
		System.out.println(oLimit = true);
		if (balance < 1000) {
			minBal += balance;
			System.out.println(oLimit = false);

		}
		System.out.println("Rs. : " + balance + "/-Debited");
		System.out.println("Balance : " + minBal);
	}

	double balance;

	void deposit(double deposit) {

		double deposit1 = 2000;

		balance = balance + deposit1;
		System.out.println(balance);
	}

}