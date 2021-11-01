//Calculating emp wage for single company
package Emp_wage;

public class day10_empwage1 {

	String company;
	int max_working_hrs;
	int max_working_days;
	int rate_per_hr;
	int emphrs;
	int totalworkinghrs;
	int totalworkingdays;

	day10_empwage1(String company, int max_working_hrs, int max_working_days, int rate_per_hr) {

		this.company = company;
		this.max_working_hrs = max_working_hrs; // taking input through constructor
		this.max_working_days = max_working_days;
		this.rate_per_hr = rate_per_hr;

	}

	void empwage() // calculating employee wage
	{
		int totalempwage = 0;
		// int daily_wage=emphrs*rate_per_hr;;

		while (totalworkinghrs <= max_working_hrs && totalworkingdays <= max_working_days) {
			int random1 = (int) (Math.random() * 10) % 3;
			switch (random1) {
			case 0:
				emphrs = 8;
				// System.out.println("Employee is present for Full time");
				// System.out.println("Daily emp wage is "+daily_wage);
				break;
			case 1:
				emphrs = 4;
				// System.out.println("Employee is present for Part time");
				// System.out.println("Daily employee wage is "+daily_wage);
				break;
			case 2:
				emphrs = 0;
				// System.out.println("Daily emp wage is "+daily_wage);

			}
			if (totalworkinghrs <= max_working_hrs) {
				totalworkinghrs = totalworkinghrs + emphrs;
				// System.out.println("Total hrs worked by employee in a month
				// "+totalworkinghrs);
				totalempwage = totalworkinghrs * rate_per_hr;
				// System.out.println("Total wage earned by an employee in an month is
				// "+totalempwage);
				// System.out.println("Total number day the employee worked "+totalworkingdays);
				totalworkingdays++;

			}

		}
		System.out.println("Employee in an company " + company + " earned his monthly empwage by working "
				+ (totalworkingdays - 1) + " days is " + totalempwage + " with total hours of " + totalworkinghrs);
	}

	public static void main(String[] args) {

		day10_empwage1 o = new day10_empwage1("KFC", 150, 25, 30);
		o.empwage();
	}
}
