public class emp_wage_computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem");

		int is_FullTime=1;
		int is_PartTime=2;
		int wagePerHour=20;
		int max_hours_in_a_month=100;
		int max_days_in_a_month=20;
		int total_Emp_Hour=0;
		int totalWorkingDays=0;

		while(total_Emp_Hour <= max_hours_in_a_month && totalWorkingDays < max_days_in_a_month) {
			totalWorkingDays++;
			int dailyHours=0;
			int empCheck=(int)Math.floor(Math.random() * 10 ) %3;

			switch (empCheck) {
				case 1:
					dailyHours=8;
					break;

				case 2:
					dailyHours=4;
					break;

				default:
					dailyHours=0;
					break;
			}
			total_Emp_Hour+=dailyHours;
		}
		int totalSalary=total_Emp_Hour*wagePerHour;
		System.out.println("Total Salary of an Employee is : " + totalSalary);
	}
}

