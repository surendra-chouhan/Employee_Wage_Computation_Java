public class emp_wage_computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem");

		int is_FullTime=1;
		int is_PartTime=2;
		double wagePerHour=20;
		double empWage;
		double dailyHour;
		int empCheck=(int)Math.floor(Math.random() * 10 ) %3;

		switch (empCheck) {
			case 1:
				System.out.println("Employee is Full Time");
				dailyHour=8;
				empWage=wagePerHour*dailyHour;
				System.out.println("Employee wage is: "+ empWage);
				break;

			case 2:
				System.out.println("Employee is Part Time");
				dailyHour=4;
				empWage=wagePerHour*dailyHour;
				System.out.println("Employee wage is: "+ empWage);
				break;

			case 0:
				System.out.println("Employee is Absent");
				dailyHour=0;
				empWage=wagePerHour*dailyHour;
				System.out.println("Employee wage is: "+ empWage);
		}
	}
}
