// calculating employee wage for multiple companies
package Emp_wage;

public class day10_emp_wage {
	String company;
	int max_working_hrs;
	int max_working_days;
	int rate_per_hr;
	int emphrs;
	int totalworkinghrs;
	int totalworkingdays;
	int daily_wage;

	// parameterized constructor for input
	day10_emp_wage(String company, int max_working_hrs, int max_working_days, int rate_per_hr) {
		this.company = company;
		this.max_working_days = max_working_days;
		this.max_working_hrs = max_working_hrs;
		this.rate_per_hr = rate_per_hr;
	}

	void empwage() { // method for calculation of Employee wage

		int totalempwage = 0;

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
				daily_wage = emphrs * rate_per_hr;
				System.out.println("Daily wage of an empolyee for day " + totalworkingdays + " is " + daily_wage);
			}

		}
		System.out.println("Employee in an company " + company + " earned his monthly empwage by working "
				+ (totalworkingdays - 1) + " days is " + totalempwage + " with total hours of " + totalworkinghrs);

	}

	public static void main(String[] args) {

		System.out.println("Empwage for KFC company");
		// assigning input for KFC company employee wage
		day10_emp_wage KFC = new day10_emp_wage("KFC", 200, 25, 50);
		KFC.empwage();
		System.out.println("==========================================================================");
		System.out.println();
		System.out.println("Empwage for Dominos company");
		// assigning input for Dominos company employee wage
		day10_emp_wage dominos = new day10_emp_wage("Dominos", 150, 30, 40);
		dominos.empwage();
	}
}
