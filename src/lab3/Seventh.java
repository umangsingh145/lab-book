package lab3;

import java.time.LocalDate;
import java.time.Period;

public class Seventh {
	public static void main(String[] args)
	{
		LocalDate pdate = LocalDate.of(1999, 12 ,25);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old", 
				diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
