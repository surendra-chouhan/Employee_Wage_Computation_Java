public class emp_wage_computation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem");

		int IS_PRESENT=1;
		double wagePerHour=20;
		double fullDayHour=8;
		double empWage;
		double empCheck=Math.floor(Math.random() * 10 ) %2;


		if (empCheck==IS_PRESENT){
			System.out.println("Employee is present");
			empWage=wagePerHour*fullDayHour;
			System.out.println("Employee wage is: "+ empWage);
		}
		else{
			System.out.println("Employee is absent");
			empWage=wagePerHour*0;
			System.out.println("Employee wage is: "+ empWage);
		}
	}
}
