package Assignment2;

import java.util.Scanner;

public class Employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Level : ");
		int s=sc.nextInt();
		
		switch(s) {
		case 1:
		{
			Employee_Level e= new Employee_Level(5000,5000,2000);
			e.monthlygross_salary();
			e.yearlygross_salary();
			e.tax();
			e.takehome_Salary();
			
		}
		case 2:
		{
			Employee_Level e= new Employee_Level(10000,7000,2500);
			e.monthlygross_salary();
			e.yearlygross_salary();
			e.tax();
			e.takehome_Salary();
			e.display();
			break;
		}
		case 3:
		{
			Employee_Level e= new Employee_Level(12000,9000,3000);
			e.monthlygross_salary();
			e.yearlygross_salary();
			e.tax();
			e.takehome_Salary();
			e.display();
			break;
		}
		case 4:
		{
			Employee_Level e= new Employee_Level(15000,10000,3500);
			e.monthlygross_salary();
			e.yearlygross_salary();
			e.tax();
			e.takehome_Salary();
			e.display();
			break;
		}
		default:
		{
			System.out.println("Only 4 levels of employees are allowed.Please enter accordingly...");
		}
		}
		

	}

}
