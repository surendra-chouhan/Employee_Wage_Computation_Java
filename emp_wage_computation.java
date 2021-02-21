public class emp_wage_computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem");

		int is_FullTime=1;
		int is_PartTime=2;
		double wagePerHour=20;
		double empWage;
		double empCheck=Math.floor(Math.random() * 10 ) %3;

		if (empCheck==is_FullTime){
			System.out.println("Employee is Full Time");
			double dailyHour=8;
			empWage=wagePerHour*dailyHour;
			System.out.println("Employee wage is: "+ empWage);
		}
		else if (empCheck==is_PartTime){
			System.out.println("Employee is Part Time");
			double dailyHour=4;
			empWage=wagePerHour*dailyHour;
			System.out.println("Employee wage is: "+ empWage);
		}
		else {
			System.out.println("Employee is Absent");
			double dailyHour=0;
			empWage=wagePerHour*dailyHour;
			System.out.println("Employee wage is: "+ empWage);
		}
	}
}
