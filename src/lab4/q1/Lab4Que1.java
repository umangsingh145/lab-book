package lab4.q1;
class Lab4Que1
{
	public static void main(String arg[])
	{
		Person c1= new Person(101,200,"Rasika");
		System.out.println(c1.accNum);
		System.out.println(c1.balance);
		System.out.println(c1.accHolder);
		
		Person c2= new Person(102,300,"Riya");
		System.out.println(c2.accNum);
		System.out.println(c2.balance);
		System.out.println(c2.accHolder);
	
	
		
		c1.withdraw(200);
		c2.deposit(200);
	
		
	}
}